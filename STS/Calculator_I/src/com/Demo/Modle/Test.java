package com.Demo.Modle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		calculator.setOerandOne(10.5);
		calculator.setOperation("-");
		calculator.setOerandTwo(5.2);
		calculator.performOperation();
		calculator.getReuslt() ; 

	}

}
