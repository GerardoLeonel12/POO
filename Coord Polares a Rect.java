import java.util.*;
import java.text.*;

public class MyClass {
    public static void main(String args[]) {
        
        double r, T, Trad, x, y;
        Scanner entrada=new Scanner(System.in);
        DecimalFormat formato1 = new DecimalFormat("##.###");
        
        System.out.print("Da la magnitud (r): ");
        r = entrada.nextDouble();
        
        System.out.print("Da el angulo en grados: ");
        T = entrada.nextDouble();
        
        Trad = T*Math.PI/180;
        x = Math.cos(Trad)*r;
        y = Math.sin(Trad)*r;
        
        System.out.print("Coordenadas Rectangulares: "+formato1.format(x));
        System.out.println(" , "+formato1.format(y));
    }
}