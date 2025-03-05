package com.example.demo.dto;

public class Calculadora {

	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}

	public int division(int num1, int num2) {

		// == cuando quiero comparar que 2 valores sean igual
		// >= 0 mayor igual
		// <= 0 manor igual
		// != diferente

		/*
		 * if (num2 >= 1) { return num1 / num2;
		 * 
		 * }
		 * 
		 * if (num2 <= 1) { return num1 / num2;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * if (num2 <= 1) { return num1 / num2;
		 * 
		 * } else if (num2 >= 1) {
		 * 
		 * return num1 / num2; }
		 * 
		 

		if (num2 >= 1 || num2 <= 1) {
			return num1 / num2;

		}
		
		*/
		
		if (num2 != 0) {
			return num1 / num2;

		}

		return 0;
	}

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();

		System.out.println("la suma es igual: " + calculadora.suma(2, 2));
		System.out.println("la resta es igual: " + calculadora.resta(2, 2));
		System.out.println("la multipliacion es igual: " + calculadora.multiplicacion(2, 2));
		System.out.println("la division es igual: " + calculadora.division(67, -2));

	}
}
