
import java.util.*;
import java.text.*;
public class MyClass {
  public static void main(String args[]) {
      
      DecimalFormat salida = new DecimalFormat("0.0000");
      int x, y;
      double f;
      
    System.out.println("TABULACIONES DE LA FUNCION: ");
    System.out.println("X       Y       f(x,y)\n");
    for(x=2; x<=8; x+=2){
        for(y=6; y<=21; y+=3){
            f=((x*x)-(y*y))/(double)((x*x)+(y*y));
            System.out.println(x+"\t\t"+y+"\t\t"+salida.format(f));
            
        }
        System.out.println();
        
    }
  }
}