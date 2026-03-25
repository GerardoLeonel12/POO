
import java.util.*;


public class ArregloEstadisticas {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Numero de elementos: ");
    int n = entrada.nextInt();
    
        // Constructor 1
        Arreglo arreglo1 = new Arreglo(n);
        arreglo1.llenarAleatorio(10);

        System.out.println("Arreglo 1: " + arreglo1);
        //System.out.println("Promedio: " + arreglo1.promedio());
        
        Arreglo arreglo2 = new Arreglo(n);
        arreglo2.llenarAleatorio(10);
        
        System.out.println("Arreglo 2: " + arreglo2);
        
        System.out.println("Resultado de producto punto: " +ppunto(arreglo1.values,arreglo2.values));
        
        System.out.print("Suma de vectores 1 y 2: ");
        int c[] = new int[n];
        Arreglo arreglo3 = new Arreglo(c);
        sumarArreglos(arreglo1.values, arreglo2.values, arreglo3.values);
        System.out.println(arreglo3);
        
        // Constructor 2
        /*int[] numeros = {5, 8, 2, 9, 1};
        Arreglo arreglo2 = new Arreglo(numeros);

        System.out.println("Arreglo 2: " + arreglo2);
        System.out.println("Promedio: " + arreglo2.promedio());*/
       
    }
    public static int ppunto(int a[], int b[]){
        
        int suma = 0;
        
        for(int i = 0; i<a.length; i++)
           suma += a[i]*b[i];
           
           return suma;
    }
    
    public static void sumarArreglos(int a[], int b[], int c[]){
        
        for(int i = 0; i<c.length; i++)
           c[i] = a[i] + b[i];
    }
}


class Arreglo {

    public int[] values;


    public Arreglo(int cantidad) {
        values = new int[cantidad];
    }

    public Arreglo(int[] values) {
        this.values = values;
    }

    // MÃ©todo para llenar con nÃºmeros aleatorios
    public void llenarAleatorio(int limite) {
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(limite);
        }
    }

    // MÃ©todo para calcular el promedio
    public double promedio() {
        int suma = 0;
        for (int i = 0; i < values.length; i++) {
            suma += values[i];
        }
        return (double) suma / values.length;
    }

    public int maximo() {
        int max = values[0];
        return max;   
    }

    // MÃ©todo para obtener el valor mÃ­nimo
    public int minimo() {
       return 0;
    }

    public String toString() {
        return Arrays.toString(values);
    }
}