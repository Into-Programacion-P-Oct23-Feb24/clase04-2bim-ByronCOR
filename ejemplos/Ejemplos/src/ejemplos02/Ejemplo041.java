/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        int[][] primerValor = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] segundoValor = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        
        obtenerMultiplicacion(primerValor, segundoValor);

    }

    public static void obtenerMultiplicacion(int a[][], int b[][]) {
        int[][] arreglo3 = new int[3][3];
        int resultado;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                resultado = a[i][j]*b[i][j];
                arreglo3[i][j]= resultado;             
            }
            System.out.printf("%d\n",arreglo3[i][j]);
        }
      
   

    }

}
