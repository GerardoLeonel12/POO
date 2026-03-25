
import java.util.*;
public class MyClass {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Da el numero tope: ");
     int tope = entrada.nextInt();
     
     System.out.println("Numeros primos hasta el "+tope);
    
    for(int value = 2; value <= tope; value++) {
        
    boolean primo = verificarPrimo(value);
    
    if(primo)
    System.out.println(value);
    }
  }
  
  public static boolean verificarPrimo(int n) {
      
      int divisores = 0, d = 2;
      
      while(d<=(n/2)) {
          
          if(n%d == 0)
          divisores++;
          d++;
      }
      
      if(divisores == 0)
         return true;
      else
         return false;
      
  }
}