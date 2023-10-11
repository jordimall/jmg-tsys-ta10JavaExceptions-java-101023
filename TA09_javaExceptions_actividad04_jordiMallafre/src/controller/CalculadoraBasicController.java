package controller;

import interfaces.OperacionesBasicas;
import interfaces.OperacionesPotencia;
import interfaces.OperacionesRaices;

/**
 * En este controlador se implementaran los metodos necesarios para el
 * funcionamiento de la fumcionalidad calculadora
 * 
 * @author Jordi Mallafre
 */
public class CalculadoraBasicController implements OperacionesBasicas, OperacionesRaices, OperacionesPotencia {
	
	

	/**
	 * Suma los valores pasados por parametro
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	@Override
	public double suma(double num1, double num2) {
		return num1 + num2;
	}

	/**
	 * Resta los valores pasados por parametro
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	@Override
	public double resta(double num1, double num2) {
		return num1 - num2;
	}

	/**
	 * Multiplica los valores pasados por parametro
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	@Override
	public double multiplicacion(double num1, double num2) {
		return num1 * num2;
	}

	/**
	 * Divide los valores pasados por parametro
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	@Override
	public double division(double num1, double num2) {
		if (num2 == 0.0) {
	        throw new ArithmeticException("No se puede dividir por cero.");
	    }
		return num1 / num2;
	}

	/**
	 * Eleva la base por el exponente
	 * 
	 * @param base
	 * @param exponente
	 * @return double
	 */
	@Override
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}

	/**
	 * Devuelve la raiz cuadrada
	 * 
	 * @param num1
	 * @return double
	 */
	@Override
	public double raizCuadrada(double num1) {

	    if (num1 < 0.0) {
	        throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
	    }
		return Math.sqrt(num1);
	}

	/**
	 * Devuelve la raiz cubica
	 * 
	 * @param num1
	 * @return double
	 */
	@Override
	public double raizCubica(double num1) {
	    if (num1 < 0.0) {
	        throw new IllegalArgumentException("No se puede calcular la raíz cubica de un número negativo.");
	    }
		return Math.cbrt(num1);
	}
}
