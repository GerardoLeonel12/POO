import java.util.*; 
public class MyClass {
  public static void main(String args[]) {  //Esta es la funcion principal, que en orientado a objetos es lo equivalente a Metodos
    
    double a, b, c;
    Scanner entrada=new Scanner(System.in);   //Clase Scaner
    
    System.out.println("Da el cateto a: ");
    a=entrada.nextDouble();
    
    System.out.println("Da el cateto b: ");
    b=entrada.nextDouble();
    
    c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    
    System.out.println("La hipotenusa es: \n"+c);
  }
}