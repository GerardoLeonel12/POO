//Repaso
import java.util.*;
public class MyClass {
  public static void main(String args[]) {
    double est, imc;
    int peso;
    String nombre;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Nombre del paciente: ");
    nombre = entrada.next();
    System.out.print("Ingresa el peso en kg: ");
    peso = entrada.nextInt();
    System.out.print("Ingresa la estatura en metros: ");
    est = entrada.nextDouble();
    
    imc = getImc(peso,est); //llamado al metodo getImc
    System.out.println("Tu Imc es de: "+imc);
    evaluarImc(nombre,imc); //void, no regresa nada
    despedida();  //metodo void
  }
  
  public static void despedida()
  {
    System.out.println(", ¡Come frutas y verduras!");
    System.out.println("Visita nuestra pagina web x");
  }
  
  
  public static void evaluarImc(String n, double imc)
  {
      System.out.println("Resultados del paciente "+n);
      if (imc<18.5)
          System.out.print("Peso bajo");  //si es solo una linea del if, se pueden omitir las llaves
      else if (imc<25)
          System.out.print("Peso normal");
           else if (imc<30)
               System.out.print("Sobrepeso");
                else
                    System.out.print("Obesidad");
  } 
  
  public static double getImc(int w,double h)
  {
      // return (w/(h*h)); forma 1
      double r;
      r = w/(h*h);
      return r;
  }
}