/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prop1_gerardocano;

import java.util.Random;


/**
 *
 * @author gcano
 */
public class Recursion {
     Random ram = new Random();

    //private int col1 , col2, fil2,fil1;
    public static int i = 0, j = 0, k = 0;

    public Recursion(int col1, int col2, int fil2, int fil1, int num) {
        
    }

    public Random getRam() {
        return ram;
    }

    public void setRam(Random ram) {
        this.ram = ram;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Recursion.i = i;
    }

    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        Recursion.j = j;
    }

    public static int getK() {
        return k;
    }

    public static void setK(int k) {
        Recursion.k = k;
    }

    Recursion() {
    }

  

   

   //binarios y decimales
    
     public  int decAbin(int decimal){
         //revisa si dec =0
        if (decimal == 0){
            return 0;
        }else{
         //si no, suma residuo de decimal cuando es dividido por 2 +10 
        return (decimal % 2 + 10 *
                //manda resusltado de la operacion de arriba y la divide entre 2, si es =2 termina el ciclo
                decAbin(decimal / 2));
        }//fin else
    }
    public static int binAdec(String binario) {
    int decimal = 0;//valor de retorno
    int tam = binario.length();//size del string binario = tam para el if
    if (tam > 0) {//mientras tam es diff de 0
        
        String subway = binario.substring(1);
        //subtring = el primer character del binario
        int digito = Character.getNumericValue(binario.charAt(0));
        //pasa substring a digito
        decimal = digito * (int) Math.pow(2, tam - 1) + binAdec(subway);
        //deimal es igual al digito que se saco arriba por 2 al poder de el tam - 1
    }
    return decimal;
}
     //matrices
    //genera matriz
  public int[][] randommat(int fil, int col){
        int temp [][] =  new int [fil][col];
        for (int x = 0; x < fil; x++) {
            for (int y = 0; y <col; y++) {
                temp[x][y] =1+ram.nextInt(9);
            }}
        
    return temp;    
    }
  //print matriz
  public String print(int[][] matrix) {
        String cadena = "";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                cadena += "[" + matrix[i][j] + "]" + " ";
            }
            cadena += "\n";
        }

        return cadena;
    }
  
  public void rowProduct(int fil1, int col1, int A[][],
                       int fil2, int col2, int B[][]){
        //si todo es traversado
        int C[][] = new int [col1][fil2];
        //para terminar esta papada de metodo
        if (i >= fil1)
            return;
        if (j < col2){
            if (k < col1){
                C[i][j] += A[i][k] * B[k][j];
                k++;
                //esto es el sigma de la formula?
  
                rowProduct(fil1, col1, A, fil2, col2, B);
            }
  
            k = 0;
            //comienza en 0 para seguir la siguiente multiplcacion fil x col 
            j++;
            rowProduct(fil1, col1, A, fil2, col2, B);
        }
  
        j = 0;
        //comienza en 0 para seguir la siguiente multiplcacion fil x col 
        i++;
        rowProduct(fil1, col1, A, fil2, col2, B);
    }
  
  public void multiplicarmat(int row1, int col1, int A[][],
                    int row2, int col2, int B[][])
    {
  
        int[][] C = new int[col1][row2];
  
        rowProduct(row1, col1, A, row2, col2, B);
}//man i give up
}

