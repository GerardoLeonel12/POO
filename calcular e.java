import java.util.*;

public class MyClass {
    
  public static double miFactorial(int valor){
      
      int i;
      double f = 1;
      
      for(i=1;i<=valor;i++){
          f = f * i;
      }
      
      return f;
  }
  
  public static double calcularE(int n){
      
      int j = 0;
      double k = 0;
      
      while(j<=n){
          k = k + (1/miFactorial(j));
          j++;
      }
      return k;
  }
  
  public static void main(String args[]) {
   
   Scanner entrada = new Scanner(System.in);
     
    int n;
    
    System.out.print("Da el valor de n: ");
    n = entrada.nextInt();
    
    //System.out.print("Factorial: "+miFactorial(n));
    
    double r = calcularE(n); 
    System.out.println("El valor de E aproximadamente es: " +r);
  }
}