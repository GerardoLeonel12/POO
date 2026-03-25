//clase rectangulo, constructor y toString

public class Rectangulo {
  
  //atributos 
   double base;
   double altura;
   
   //constructor
   public Rectangulo(double d, double h)
   {
   base = b;
   altura = h;
  }
  
  public double getArea()
  {
      double r = base * altura;
      return r;
  }
  
  public String toString()
  {
      System.out.println("Rectangulo de base "+base+" y altura "+altura);
      return salida;
  }
}