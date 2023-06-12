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
public class excer14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter eur qty to convert: ");
        float eur = input.nextFloat();
        input.skip("\n");
        System.out.println("Convert EUR to: 'usd'/'yen'/'pound' ");
        String outCurr = input.nextLine();
        exchange(outCurr, eur);
        
        
    }
    
    public static void exchange(String curr, float qty){
        switch (curr) {
            case "usd":
                System.out.println(qty + " EUR are "+qty*1.28611 + " USD" );
                break;
            case "pound":
                System.out.println(qty + " EUR are "+qty*0.86 + " POUNDS" );
                break;
            case "yen":
                System.out.println(qty + " EUR are "+qty*129.852 + " YENS" );
                break;
            default:
                throw new AssertionError("Invalid currency");
        }
    }
    
}
