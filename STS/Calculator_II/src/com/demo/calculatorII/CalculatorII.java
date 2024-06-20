package com.demo.calculatorII;

import java.util.ArrayList;
import java.util.Stack;
public class CalculatorII  {
	ArrayList<Double> operand ; 
	ArrayList<String> operation ; 
	Stack <String> stack ; 
	private double result ; 
	public CalculatorII() {
		this.operand = new ArrayList<>() ; 
		this.operation = new ArrayList<>();
		this.stack = new Stack<>();
	}
	
	public void performOperation(Object operand) {
		
		if( operand instanceof Double) {
		this.operand.add((Double)operand) ; }
		else if ( operand instanceof String && operand.equals("=")) {
			this.calculateResult() ; 
		}
		else if (operand instanceof String && (operand.equals("+") || operand.equals("-") || operand.equals("*") || operand.equals("/"))) {
			this.operation.add((String)operand);
		}
	} 
	public int powerOp(String op) {
		switch(op) {
		case "+":
		case "-":
			return 1 ; 
			
		case "*":
		case "/":
			return 2 ; 
		
		default: 
			return 0 ; 
		}
	}
	public void calculateResult() {
		if(operand.size() == 1 ) {
			result = operand.get(0) ; 
		}
		else if (operand.size()%2 == 1  && operation.size()==1 ){
			System.out.println("Error: need more operrand");
			result = 0 ; 
		}
		else{
			for (String op : operation) {
				if(stack.empty()) {
					stack.push(op);
				}
				else {
					
				}
			}
		}
		
	}
}
