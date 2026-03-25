import java.util.Random;
import java.util.Arrays;

pu


 class Arreglo {


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