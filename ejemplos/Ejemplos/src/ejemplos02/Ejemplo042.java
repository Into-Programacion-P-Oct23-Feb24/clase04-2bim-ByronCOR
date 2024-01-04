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
public class Ejemplo042 {

    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] m2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] m3 = {{1, 4, 9}, {6, 4, 8}, {6, 6, 4}};
        int[][] m4 = new int[3][3];
        int[][] m5 = new int[3][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m4[i][j] = obtenerMultiplicacion(m1[i][j],
                        m2[i][j]);
                m5[i][j] = obtenerSuma(m1[i][j], m2[i][j], m3[i][j]);
            }
        }

        presentarPantalla(m1);
        presentarPantalla(m2);
        System.out.println("Multiplicación");
        presentarPantalla(m4);
        System.out.println("\n");
        presentarPantalla(m1);
        presentarPantalla(m2);
        presentarPantalla(m3);
        System.out.println("Suma");
        presentarPantalla(m5);
    }

    public static void presentarPantalla(int[][] m1) {
        String cadena = "";

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, m1[i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.printf("%s\n", cadena);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;

    }

    public static int obtenerSuma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        return resultado;

    }

}
