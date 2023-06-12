/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allexcer;

import java.util.Random;

/**
 *
 * @author blue_
 */
public class excer18 {

    public static void main(String[] args) {
        Random rand = new Random();
        int rows = 3;
        int cols = 3;
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(9) + 1;
            }
        }
        System.out.println(mat.length);

        int[][] transpose = transposeMat(mat, rows, cols);
        vec_mat_Utils.printMatriz(mat, rows, cols);
        System.out.println("----------------------------");
        vec_mat_Utils.printMatriz(transpose, rows, cols);

    }

    public static int[][] transposeMat(int[][] mat, int rows, int cols) {
        int[][] tMat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tMat[i][j] = mat[j][i];
            }
        }
        return tMat;
    }

}
