/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allexcer;

/**
 *
 * @author blue_
 */
public class vec_mat_Utils {

    public static void main(String[] args) {

    }

    public static int[] createVector(int rows) {
        int[] vector = new int[rows];
        return vector;
    }

    public static int[] fillVector(int[] vec, int rows, String ord) {
        if (ord.equals("asc")) {
            for (int i = 0; i < rows; i++) {
                vec[i] = i;
            }

        }
        if (ord.equals("des")) {
            for (int j = rows - 1; j >= 0; j--) {
                vec[rows - j - 1] = j;
            }
        }
        return vec;

    }

    public static void printVector(int[] vec, int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.print("[" + vec[i] + "]");
        }
        System.out.println("");
    }

    public static void printMatriz(int[][] mat, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " | ");
            }
            System.out.println("");
        }
    }

    public static int[][] transposeMat(int[][] mat, int rows, int cols) {
        int[][] tMat = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tMat[j][i] = mat[i][j];
            }
        }
        return tMat;
    }

}
