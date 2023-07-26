/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 *
 * @author KTMAIT
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter degree ing fahrenheit ");
        String input = obj.nextLine();
        Pattern pattern = Pattern.compile("^\\d+(\\.\\d+)?$");
        Matcher matcher = pattern.matcher(input);
        boolean matchFound = matcher.find();
        if(matchFound){
            
            System.out.println(input+" "+" fahrenheit is "+(Double.parseDouble(input)-32)*5/9 +" celsius");
             
        }else{
            System.out.println("Your input is not valid");
            
        }System.out.println("Good Bye");
        
    }
    
}
