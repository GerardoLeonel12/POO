
import java.util.*;
public class MyClass {
  public static void main(String args[]) {
   Scanner entrada = new Scanner(System.in);
   
   int mes, n;
   double capital, interes;
   
   System.out.println("Ingresa el capital: ");
   capital = entrada.nextDouble();
   
   System.out.println("Ingresa el numero de meses: ");
   n = entrada.nextInt();
   
   double tasa = 0.075;
   
   mes = 1;
   while(mes<=n){
       interes = capital * (tasa/12);
       capital += interes;
       System.out.println("Periodo "+mes+": "+capital);
       mes++;
   }
   System.out.println("Gracias por su preferencia");
  }
}