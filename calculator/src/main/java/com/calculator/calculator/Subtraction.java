package com.calculator.calculator;

public class Subtraction {
	float first_number;
    float second_number;
    Subtraction(float first_number, float second_number){
        this.first_number = first_number;
        this.second_number = second_number;
    }
    public float subtract(float number_1, float number_2){
        return number_1 - number_2;
    }
}
