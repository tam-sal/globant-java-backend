/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allexcer;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author blue_
 */
public class excer16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randNum;
        int rows = input.nextInt();
        input.skip("\n");
        System.out.println("Enter num to find:");
        int numToFind = input.nextInt();
        input.skip("\n");
        String collect = "";
        int [] vect = createVector(rows);
        
        for (int i = 0; i < rows; i++) {
            randNum = (int) (Math.random() * 10);
            vect[i] = randNum;
            if(vect[i] == numToFind){
                collect += String.valueOf(i) + " ";
            }
            
        }
        excer15.printVector(vect, rows);
        if(collect.equals("")){
            System.out.println("Number no found");
        }
        else{
            System.out.println("Number found in indices: "+collect);
        }
        
        
        

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

    public static int[] createVector(int rows) {
        int[] vector = new int[rows];
        return vector;
    }

}
