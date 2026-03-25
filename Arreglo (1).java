import java.util.Random;
import java.util.Arrays;

public class Arreglo {

    public int[] datos;
    // Constructor 1: recibe la cantidad de elementos
    public Arreglo(int cantidad) {
        datos = new int[cantidad];
    }

    // Constructor 2: recibe un arreglo ya existente
    public Arreglo(int[] datos) {
        this.datos = datos;
    }

    //Ordenamiento por burbuja
    public void bubbleS(int[] datos)  {
        for (int pasadas=1;pasadas<datos.length; pasadas++)   //repite el proceso
        {
           for (int i=0; i<datos.length-1;i++)
           {
              if(datos[i]>datos[i+1])
              {
                int temp = datos[i];
                datos[i]=datos[i+1];
                datos[i+1]=temp;
              }    
           }    
        }
    }

    public void selectionSort(int[] datos) {
    int n = datos.length;

    for (int i = 0; i < n - 1; i++) {
        int indiceMinimo = i;

        for (int j = i + 1; j < n; j++) {
              if (arreglo[j] < arreglo[indiceMinimo]) {
                indiceMinimo = j;
               }  //if
        }//for j
        // swap
        int temp = arreglo[indiceMinimo];
        arreglo[indiceMinimo] = arreglo[i];
        arreglo[i] = temp;
    }   //del i
    } //fin del método selectionSort

    // Método para llenar con números aleatorios
    public void llenarAleatorio(int limite) {
        Random random = new Random();
        for (int i = 0; i < datos.length; i++) {
            datos[i] = random.nextInt(limite);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(datos);
    }
}