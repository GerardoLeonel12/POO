/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matricesexamen4;

/**
 *
 * @author 52222
 */
import java.util.*;
public class MatrizBasica 
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
               System.out.print("Ingresa el dato "+i+" con "+j);
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
   
   public int sumarElementos(int mat[][])
   {
       int suma=0;
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              suma=suma+mat[i][j];  
          }
      }
      return suma;
   }//metodo
   
    public void sumarElementos2(int mat[][])
   {
      int suma=0;
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              if (i<=j)
                  suma += mat[i][j];
          }
      }
      System.out.println(suma);
   }//metodo
   
    public void sumarElementos3(int mat[][])
   {
      int suma=0;
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              if (i>j)
                  suma += mat[i][j];
          }
      }
      System.out.println(suma);
   }//metodo
    
     public void sumarElementos4(int mat[][])
   {
       int suma=0;
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              if ((i+j)<4)
                  suma += mat[i][j];
          }
      }
      System.out.println(suma);
   }//metodo
    
    
      public void sumarElementos5(int mat[][])
   {
      int suma=0;
      for(int i=0;i<mat.length;i++)
      {
          for (int j=0;j<mat[0].length;j++)
          {
              if ((i+j)>=4)
                  suma += mat[i][j];
          }
      }
      System.out.println(suma);
   }//metodo
     
   //método que multiplica matrices
   public int[][] multiplicacion(int A[][], int B[][])
   {  
       int Z[][]= new int[A.length][B[0].length];
       //proceso de multiplicacion
       for (int i=0;i<A.length;i++)   //renglones de A
       {
           for (int j=0;j<B[0].length;j++) {   //columnas de B         
               Z[i][j]=0;
               for(int k=0;k<A[0].length;k++) {
                   Z[i][j]=Z[i][j]+A[i][k]*B[k][j];
               }    
           }
       }
       return Z;
   }
   
}