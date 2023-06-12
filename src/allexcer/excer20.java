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
public class excer20 {

    public static void main(String[] args) {
        int[][] mat = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int rows = mat.length;
        int cols = mat[0].length;
        vec_mat_Utils.printMatriz(mat, rows, cols);

        int sumRow = 0;
        int firstRowSum = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < cols; j++) {
                firstRowSum += mat[i][j];
            }
        }
        boolean equalRowsSum = true;
        boolean equalColsSum = true;
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + mat[i][j];
                equalRowsSum = sumRow == firstRowSum;
            }
            if (!equalRowsSum) {
                System.out.println("unequal row sum");
                break;
            }
        }
        int firstColSum = 0;
        for (int col = 0; col < 1; col++) {
            for (int row = 0; row < mat.length; row++) {
                firstColSum += mat[col][row];
            }
        }
        int sumCol = 0;

        for (int col = 0; col < cols; col++) {
            sumCol = 0;
            for (int row = 0; row < rows; row++) {
                sumCol += mat[row][col];
                equalColsSum = sumCol == firstColSum;
            }
            if (!equalColsSum) {
                System.out.println("Unequal column sum ");
                break;
            }
        }
        int sumPrimaryDiag = 0;
        
        for (int i = 0; i < mat.length; i++) {
            sumPrimaryDiag += mat[i][i];
        }
        int sumSecondaryDiag = 0;
        for (int i = mat.length-1; i >= 0; i--) {
            sumSecondaryDiag += mat[i][mat.length-1-i];
        }
        if(sumRow == sumCol && sumPrimaryDiag == sumSecondaryDiag && sumPrimaryDiag == sumRow){
            System.out.println("magical matrix");
        }
        else{
            System.out.println("non magical one");
        }
        
    }

}
