/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allexcer;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author blue_
 */
public class excer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        input.skip("\n");
        System.out.println("sqrt "+(float) Math.sqrt(num) + " doubel " + num*2 + " triple "+num*3);
        
    }
    
}
