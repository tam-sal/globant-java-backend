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
public class excer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = input.nextLine();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        
    }
    
}
