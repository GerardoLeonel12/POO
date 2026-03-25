import java.util.*;
public class MyClass {
    
    public static void main(String args[])
    {
        
        double b, h;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Da la base: ");
        b = entrada.nextDouble();
        System.out.println("Da la altura: ");
        h = entrada.nextDouble();
        Rectangulo rectangulo1 = new Rectangulo(b,h);
        System.out.println(rectangulo1);
    }
}