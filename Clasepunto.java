
public class Clasepunto{
    //atributos
    public double radio;
    public double angulo;    //usar estos nombres en toda la clase
    
    //constructores
    public Clasepunto(double r, double a)
    {
    radio = r;
    angulo = a;
    }
    
    public Clasepunto()
    {
        radio = 1;
        angulo = 0;
    }
    
    public void convertir_a_rectangulares()
    {
        double aRad, x, y;
        aRad = angulo*Math.PI/180;
        x = Math.cos(aRad)*radio;
        y = Math.sin(aRad)*radio;
        
        System.out.println("Coordenadas Rectangulares: ("+x+", "+y+")"); 
    }
    
    public void cuadrante()
    {
        if (angulo>0 && angulo<90)
             System.out.println("Cuadrante I");
             
        else if (angulo>90 && angulo<180)
                 System.out.println("Cuadrante II");
             
             else if (angulo>180 && angulo<270)
                    System.out.println("Cuadrante III");
                    
                    else if (angulo>270 && angulo<360)
                             System.out.println("Cuadrante IV")
                        
    if (angulo==90 || angulo==270)
         System.out.println("Sobre el eje y");
    
    if (angulo==180 || angulo==360 || angulo==0)
         System.out.println("Sobre el eje x");
    }
    
    public String toString()
    {
        String cadena = "El punto con angulo "+angulo+", Magnitud "+radio;
        return cadena;
    }
}