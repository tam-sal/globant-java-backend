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
public class excer17 {

    public static void main(String[] args) {
        //int rand = (int) (Math.random() * 1000);
        int one = 0; 
        int two = 0; 
        int three = 0; 
        int four = 0; 
        int five = 0;
        int[] vect = vec_mat_Utils.createVector(100);
        vect = fillRandVec(vect, 100);
        
        
        for (int i = 0; i < vect.length; i++) {
            String valS = String.valueOf(vect[i]);
            if(valS.length() == 1) one += 1;
            if(valS.length() == 2) two += 1;
            if(valS.length() == 3) three += 1;
            if(valS.length() == 4) four += 1;
            if(valS.length() == 5) five += 1;
            
        }
        System.out.println("len 1 "+one + " len2 "+two+" len three "+three+" len four "+ four + "len five "+five);
        //vec_mat_Utils.printVector(vect, 100);
    }

    public static int[] fillRandVec(int[] vector, int rows) {
        Random rand= new Random();
        for (int i = 0; i < rows; i++) {
            int val = (int)Math.pow(10, rand.nextInt(8)) ;
            vector[i] = val;
        }
        return vector;
    }

}
