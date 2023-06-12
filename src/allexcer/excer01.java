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
public class excer01 {
    
    public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int num1;
    int num2;
    
    System.out.println("Ingrese num1 y num2");
    num1 = input.nextInt();
    num2 = input.nextInt();
    input.skip("\n");
    System.out.println("");
    System.out.println(num1+num2);
   }
}
