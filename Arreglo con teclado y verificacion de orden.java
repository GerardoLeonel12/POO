
import java.util.*;


public class ArregloEstadisticas {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Numero de elementos: ");
    int n = entrada.nextInt();
    
        // Constructor 1
        Arreglo arreglo1 = new Arreglo(n);
        arreglo1.llenarTeclado();

        System.out.println("Arreglo 1: " + arreglo1);
        
        verificarOrden(arreglo1.values);
        System.out.println("¿El arreglo esta ordenado de manera ascendente?: "+verificarOrden(arreglo1.values));
        //System.out.println("Promedio: " + arreglo1.promedio());
        
        // Constructor 2
        /*int[] numeros = {5, 8, 2, 9, 1};
        Arreglo arreglo2 = new Arreglo(numeros);

        System.out.println("Arreglo 2: " + arreglo2);
        System.out.println("Promedio: " + arreglo2.promedio());*/
       
    }
    
    public static boolean verificarOrden(int x[]){
        
        boolean ordenado = true;
        for(int i=0; i<x.length-1; i++){
            
            if (x[i] > x[i+1])
            ordenado = false;
            
        }
        return ordenado;
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
    //Metodo ára llenar con el teclado
    public void llenarTeclado(){
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i<values.length; i++){
            System.out.println("Da el dato: "+i);
            values[i] = entrada.nextInt();
            
        }
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