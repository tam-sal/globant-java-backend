/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allexcer;

import java.util.Scanner;

/**
 *
 * @author blue_
 */
public class excer19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = input.nextInt();
            }
        }

        vec_mat_Utils.printMatriz(mat, rows, cols);
        int[][] transposed = vec_mat_Utils.transposeMat(mat, rows, cols);
        System.out.println("***********************");
        vec_mat_Utils.printMatriz(transposed, rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[i][j] = -transposed[i][j];
            }
        }
        System.out.println("---------------");
        vec_mat_Utils.printMatriz(transposed, rows, cols);
        boolean antiMat = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] != transposed[i][j]) {
                    antiMat = false;
                    break;
                }
            }
        }
        System.out.println("Antimat: " + antiMat);
    }

}
