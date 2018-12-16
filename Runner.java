/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathoperations;

import java.util.Scanner;

/**
 *
 * @author Kiptoo David
 */
public class Runner {

    public static void main(String[] args) {  
        int num1;
        int num2;
        Scanner scan = new Scanner(System.in);
        
        Maths operation = new Maths();
        
        System.out.println("Enter the first number; ");
        num1 = scan.nextInt();
        System.out.println("HINT!!! Number Two should be lower than this; "+num1+ " For perfect answers");
        System.out.println("Enter the second number; ");
        num2 = scan.nextInt();
        System.out.println("Number two is; "+num2);
        
        System.out.println();
        operation.add(num1, num2);
        operation.subtract(num1, num2);
        operation.multiply(num1, num2);
        operation.divide(num1, num2);
    }
    
}
