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
public class excer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int sum = 0;
        while(sum <= limit){
        sum += input.nextInt();
        }
    }
    
}
