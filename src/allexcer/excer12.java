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
public class excer12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userMsg;
        String fde = "&&&&&";
        int validMsg = 0;
        int invalidMsg = 0;
        int counter = 0;
        
        while(true){
            counter++;
            System.out.println("counter "+counter);
            userMsg = input.nextLine();
            if(userMsg.length() <= 5 && userMsg.startsWith("X") && userMsg.endsWith("O")){
                validMsg += 1;
            }
            else if(userMsg.equals(fde)){
                validMsg += 1;
                break;
            }
            else{
                invalidMsg += 1;
            }
        }
        System.out.println("Valid: "+validMsg+" invalid: "+invalidMsg);
        
    }
    
}
