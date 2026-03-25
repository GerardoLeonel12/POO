import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el tamaño del arreglo: ");
        int n = entrada.nextInt();

        Arreglo arreglo = new Arreglo(n);

        arreglo.llenarAleatorio(10);

        System.out.println("Arreglo desordenado:");
        System.out.println(arreglo);

        arreglo.selectionSort();
        System.out.println("Arreglo ordenado (SelectionSort):");
        System.out.println(arreglo);
        
        arreglo.bubbleSort();
        System.out.println("Arreglo ordenado (BubbleSort):");
        System.out.println(arreglo);
    }
}

class Arreglo {

    public int[] values;

    public Arreglo(int tamaño) {
        values = new int[tamaño];
    }

    // llenar con números aleatorios
    public void llenarAleatorio(int limite) {

        Random random = new Random();

        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(limite);
        }
    }

    // Selection Sort
    public void selectionSort() {

        for (int i = 0; i < values.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < values.length; j++) {

                if (values[j] < values[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = values[i];
            values[i] = values[minIndex];
            values[minIndex] = temp;
        }
    }

    // Bubble Sort
    public void bubbleSort() {

        for (int pasadas = 1; pasadas < values.length; pasadas++) {
            for (int i = 0; i < values.length - pasadas; i++) {

                if (values[i] > values[i + 1]) {

                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
    }

    public String toString() {
        return Arrays.toString(values);
    }
}