package com.calculator;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		System.out.println("Wprowadz pierwsza liczbe");	
		   Scanner scan = new Scanner(System.in);
	        String firstNumber = scan.nextLine();
	        System.out.println(firstNumber.charAt(1));
	}

}
