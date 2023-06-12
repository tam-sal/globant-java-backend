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
public class excer11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer="N";
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String menu = "MENU"+ "\n"+"1.Sumar"+"\n"+"2.Restar"+"\n"+"3.Multi"+"\n"+"4.Div"+"\n"+"5.Salir"+"\n"+"Eliga opcion:"+"\n";
        
        while(!answer.equalsIgnoreCase("s")){
            System.out.println(menu);
            int op = input.nextInt();
            input.skip("\n");
            if(op == 1){
                System.out.println(num1+num2);
            }
            if(op == 2){
                System.out.println(num1-num2);
            }
            if(op == 3){
                System.out.println(num1*num2);
            }
            if(op == 4){
                System.out.println((float)num1/num2);
            }
            if(op == 5){
                System.out.println("escribir S para salir");
                answer = input.nextLine();
            }
        }
            
    }
}
        
    

