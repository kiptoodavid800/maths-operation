/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathoperations;

/**
 *
 * @author Kiptoo David
 */
public class Maths {
    
    public void add(int num1, int num2){
        System.out.println("Sum of the numbers " +(num1+num2));
    }
    public void subtract(int num1, int num2){
        System.out.println("Subtraction of numbers " + (num1-num2));
    }
    public void multiply(int num1, int num2){
        System.out.println("Multiplication of numbers " + (num1*num2));
    }
    public void divide(double num1, double num2){
        if(num1 > num2){
        System.out.println("Division of numbers "+ (num1/num2));
        }else{
            System.out.println("Not perfect answer since its a decimal!");
        }
    }
    
}
