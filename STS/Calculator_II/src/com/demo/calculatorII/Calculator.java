package com.demo.calculatorII;

import java.io.Serializable;

public class Calculator implements Serializable {
	
	private double oerandOne ; 
	private double oerandTwo ;
	private String operation ;
	private boolean op1;
	private boolean op2;
	private boolean op ; 
	private boolean resultFlag ; 
	private double result ; 
	
	public Calculator() {
		this.oerandOne = 0 ;
		this.oerandTwo = 0 ; 
		this.op1=false ; 
		this.op2=false ; 
		this.op=false ; 
		this.resultFlag = false ; 
	}
	
	public void setOerandOne(double oerandOne) {
		this.oerandOne = oerandOne;
		this.op1=true ; 
	}
	public double getOerandOne() {
		if(op1) {
			return oerandOne;}
		else {
			System.out.println("Warning: OperandOne does not initalize yet (defalt == 0 )");
			return 0.0 ; 
		}
	}

	public double getOerandTwo() {
		if(op2) {
			return oerandTwo;}
		else {
			System.out.println("Warning: OperandTwo does not initalize yet (defalt == 0 )");
			return 0.0 ; 
		}
	}

	public void setOerandTwo(double oerandTwo) {
		this.oerandTwo = oerandTwo;
		this.op2 = true ; 
	}

	public String getOperation() {
		if(op) {
		return operation;}
		else {
			System.out.println("Warring: oparation not initalize yet (defalt = ' ' )");
			return " "; 
		}
	}

	public void setOperation(String operation) {
		this.operation = operation;
		this.op=true ; 
	}
	
	public void performOperation() {
		if(this.getOperation().equals("+")){
			this.result = this.getOerandOne()+this.getOerandTwo() ; 
			System.out.println(this.getOerandOne()+" "+this.getOperation()+" "+this.getOerandTwo() ); 
			System.out.println("Addtion operation sccuessed"); 
			this.resultFlag=true ; 
			
		}
		else if (this.getOperation().equals("-")) {
			this.result = this.oerandOne - this.oerandTwo ;
			System.out.println(this.getOerandOne()+" "+this.getOperation()+" "+this.getOerandTwo() ); 
			System.out.println("Subtration operation sccuessed"); 
			this.resultFlag=true ; 
		}
		else if (this.getOperation().equals("*")) {
			this.result = this.oerandOne * this.oerandTwo ;
			System.out.println(this.getOerandOne()+" "+this.getOperation()+" "+this.getOerandTwo() ); 
			System.out.println("Multiplcation operation sccuessed"); 
			this.resultFlag=true ; 
		}
		else if (this.getOperation().equals("-")) {
			this.result = this.oerandOne - this.oerandTwo ;
			System.out.println(this.getOerandOne()+" "+this.getOperation()+" "+this.getOerandTwo() ); 
			System.out.println("Division operation sccuessed"); 
			this.resultFlag=true ; 
		}
		else {
			System.out.println("Invalid operation or not Supported yet ");
		}
	}

	public double getReuslt() {
		if(resultFlag) {
		System.out.print("The result: "+this.result) ;	
		return result;}
		else{
			System.out.print("Error : perform operation to get the result !!!");
			return 0 ; 
		}
	}
	
	
}
