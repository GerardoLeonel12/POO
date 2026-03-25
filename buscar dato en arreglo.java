import java.util.Random;
import java.util.*;

public class MyClass
{



 public static void main(String args[])

 {

   Scanner entrada = new Scanner(System.in);
   System.out.print ("Cuántos elementos en el arreglo: ");
   int n = entrada.nextInt();
   int a[]=new int[n];
   Arreglo arreglo1 = new Arreglo();
   arreglo1.llenarAleatorio(a);
   arreglo1.imprimir(a);

   System.out.print("\n¿Que dato buscas?: ");
   int valor = entrada.nextInt();
   
   //llamado al metodo buscquedaLineal
   /*int pos = arreglo1.busquedaLineal1(valor, a);
   if (pos==(-1))
        System.out.println("El dato no se encontró dentro del arreglo");
   else
        System.out.println("El valor "+valor+" se ubico en la posicion "+pos);*/
        
   arreglo1.busquedaLineal2(valor,a);
 }

}



 class Arreglo {

  // Método para llenar con números aleatorios
  
  public void busquedaLineal2(int valor, int datos[]){
      boolean encontrado=false;
      for (int i=0; i<datos.length; i++){
          if(valor==datos[i]){
              System.out.println("El dato esta en la posicion "+i);
              encontrado = true;
          }
      }
      if(!(encontrado))
      System.out.println("El dato no se encontro");
  }
     
  
  public int busquedaLineal1(int valor, int datos[]){
      
      int posicion = (-1);
      for (int i=0; i<datos.length; i++){
          if (valor==datos[i])
                return i;
      }
      return posicion;
  }
  

  public void llenarAleatorio(int datos[]) {

    Random random = new Random();

    for (int i = 0; i < datos.length; i++) {

      datos[i] = random.nextInt(20);

    }

  }
  

  public void imprimir(int datos[]) {

    for (int i = 0; i < datos.length; i++) {

      System.out.print(datos[i]+" ");

    }

  }
  

}