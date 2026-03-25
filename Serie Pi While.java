import java.util.*;

public class MyClass {

  public static void main(String args[]) {
    
    Scanner entrada = new Scanner(System.in);
     
    int n;
    
    System.out.print("Da el valor de n: ");
    n = entrada.nextInt();
    
    double r = calcularPi(n); 
    System.out.println("El valor de Pi aproximadamente es: " + r);
  }

  public static double calcularPi(int n){
        
    int i = 0;
    double s = 0, t;
        
    while(i <= n){
        t = Math.pow(-1, i) / (2 * i + 1);
        s = s + t;
        i++;
    }
    s = s * 4;
    return s;
  }
}