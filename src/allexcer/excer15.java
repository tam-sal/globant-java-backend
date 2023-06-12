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
public class excer15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("rows qty: ");
        int rows = input.nextInt();
        input.skip("\n");
        int[] vec = new int[rows];
        int[] newVec = fillVector(vec, rows, "des");
        printVector(newVec, rows);

    }

    public static int[] fillVector(int[] vec, int rows, String ord) {
        if (ord.equals("asc")) {
            for (int i = 0; i < rows; i++) {
                vec[i] = i;
            }

        }
        if (ord.equals("des")) {
            for (int j = rows - 1; j >= 0; j--) {
                vec[rows-j-1] = j;
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

}
