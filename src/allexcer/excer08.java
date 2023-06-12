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
public class excer08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase = input.nextLine();
        int len = frase.length();
        if(len >= 8){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
  
    }
}
