//Prueba de metodos clase Math

public class Main {
  public static void main(String args[]) {
      
    double value = 6.789;
    int num = 7;
    double r1, r2, r3;
    boolean positivo=true;
    
    r1 = (num * value);
    r2 = Math.floor(value);
    r3 = Math.ceil(value);
    
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println("LN de num es: "+Math.log(num));
    
    if(value<0){
        positivo=false;
    }
        System.out.println(positivo);
        
  }
}