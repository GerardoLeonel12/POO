public class MyClass {
    public static void main(String args[]) {
        //Declarar un objeto de clase Clasepunto
        
        Clasepunto miPunto1 = new Clasepunto();
        System.out.println(miPunto1);
        
         //Declarar otro objeto de clase Clasepunto
        
        Clasepunto miPunto2 = new Clasepunto(5,23); //
        System.out.println(miPunto2);
        miPunto2.convertir_a_rectangulares();
        miPunto2.cuadrante();
    }
}