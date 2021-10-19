package com.calculator;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
	 Double firstNumberDouble = pobierzLiczbeDouble();
	 Double secondNumberDouble = pobierzLiczbeDouble();
	        System.out.println(firstNumberDouble);
	        char operator = pobierzOperator();
	        System.out.println(firstNumberDouble.toString()+operator+secondNumberDouble.toString());
	           
	        
	}
	
    
	static char pobierzOperator () {
	            System.out.println("Wybierz dzialanie");
	            Scanner scan = new Scanner(System.in);
	            String equaison = scan.nextLine();
	            if( equaison.length() != 1) {
	            	System.out.println ("Podaj tylko jedno dzia³anie");
	            	return pobierzOperator();
	            }
	            char operator = equaison.charAt(0);
	            List<Character> listOfOperators = Arrays.asList('+','-','*','/');
	            if (!listOfOperators.contains(operator)) {
	            	System.out.println("Operator niedozwolony");
	            	return pobierzOperator();
	            }
	            return operator;
	            
	        	 }
	
	
	
	static Double pobierzLiczbeDouble() {
		System.out.println("Wprowadz liczbe");	
		   Scanner scan = new Scanner(System.in);
	        String number = scan.nextLine();
	        Double numberDouble = 0.0;
	       try{
	    	   numberDouble = Double.parseDouble(number);
	       } catch (NumberFormatException exception) {
	    	   System.out.println("Zla wartosc, podaj poprawna");
	    	   return pobierzLiczbeDouble();
	       }
	       return numberDouble;
	}
	
	
	

}
