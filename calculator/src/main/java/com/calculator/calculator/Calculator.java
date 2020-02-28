package com.calculator.calculator;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first operand:");
        float first_number = sc.nextFloat();
        System.out.println("Enter the Second operand:");
        float second_number = sc.nextFloat();
        System.out.println("Enter the operation you would like to perform:");
        String operand = sc.next();       
        if(operand.equals("+")){
            Addition add = new Addition(first_number, second_number);
            System.out.println("The result is "+add.add(first_number, second_number));
        }
        else if(operand.equals("-")){
            Subtraction sub = new Subtraction(first_number, second_number);
            System.out.println("The result is "+sub.subtract(first_number,second_number));
        }
        else if(operand.equals("*")){
            Multiplication mul = new Multiplication(first_number, second_number);
            System.out.println("The result is "+mul.multiply(first_number, second_number));
        }
        else if(operand.equals("/")){
            Division div = new Division(first_number, second_number);
            System.out.println("The result is "+div.divide(first_number, second_number));
        }
        else{
            System.out.println("Enter a valid operator...!");
        }
        
    }
}
