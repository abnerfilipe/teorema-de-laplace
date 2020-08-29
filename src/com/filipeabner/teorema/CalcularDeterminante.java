package com.filipeabner.teorema;

/**
 *
 * @author Filipe Abner
 */
public class CalcularDeterminante {

    public static void main(String args[]) {
        double matrizA[][] = {{2, 5, 3}, {0, 1, 4}, {-1, 0, 5}};
        // double matrizB[][] = {{2, 5, 3}, {0, 1, 4}, {-1, 0, 8}};
        System.out.println("Matriz = ");
        plotaMatriz(matrizA);
//        plotaMatriz(matrizB);
        System.out.println("Determinante = " + TeoremaDeLaplace.laplace(matrizA));
        // System.out.println("Determinante = " + TeoremaDeLaplace.laplace(matrizB));
    }

    static void plotaMatriz(double matriz[][]) {
        String acum = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acum += matriz[i][j] + "  ";
            }
            acum += "\n";
        }
        System.out.println(acum);
    }
}
