import java.util.*;

public class Matriz_Ejemplo1{

  public static void main(String args[])
  {
     int m[][]=new int[3][4];
     MatrizBasica matriz1 = new MatrizBasica();
     matriz1.leerMatriz(m);
     matriz1.imprimir(m,"Matriz 1");
  }
}


class MatrizBasica 
{
   public int[][] crear(int n, int m)
   {
      int mat[][]=new int[n][m];
      Random rnd=new Random();
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              mat[i][j]=rnd.nextInt(10)+1;
          }
      }    
      return mat;
   }           
   
   public void leerMatriz(int mat[][])
   {
      Scanner entrada=new Scanner(System.in);
       
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
               System.out.print("Ingresa el dato "+i+" con "+j+": ");
               mat[i][j]=entrada.nextInt();
          }
      }    
   }  
   
   public void imprimir(int mat[][],String nombre)
   {
       System.out.println("\n Matriz "+nombre);
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
              System.out.print(mat[i][j]+" ");
          System.out.println();
      }    
   
   }
}