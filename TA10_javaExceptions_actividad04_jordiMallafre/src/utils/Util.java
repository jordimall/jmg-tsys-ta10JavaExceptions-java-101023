package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import controller.CalculadoraBasicController;

/**
 * Clase donde se implementant la mayoria de metodos basicos para el correcto
 * funcionamiento de la aplicación
 * 
 * @author Jordi Mallafre
 */
public class Util {
	/**
	 * Controla la opción introducida por el usuario y redirige al metodo pertinente
	 */
	public static void iniciarCalculadora() {
		CalculadoraBasicController calController = new CalculadoraBasicController();
		double num1 = 0;
		double num2 = 0;
		String opcion = "";
		boolean condition = true;
		Scanner sc = new Scanner(System.in);

		do {
			mostrarMenu();
			System.out.println();
			System.out.println("Escoje una opción");
			opcion = sc.next();
			System.out.println();
			switch (opcion) {
			case "1":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el primer valor", sc);
				System.out.println();
				num2 = comprobarEntreadaTextoEsNumero("Introduce el segundo valor", sc);
				sumar(num1, num2, calController);
				break;

			case "2":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el primer valor", sc);
				System.out.println();
				num2 = comprobarEntreadaTextoEsNumero("Introduce el segundo valor", sc);
				restar(num1, num2, calController);
				break;

			case "3":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el primer valor", sc);
				System.out.println();
				num2 = comprobarEntreadaTextoEsNumero("Introduce el segundo valor", sc);
				division(num1, num2, calController);
				break;

			case "4":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el numerador valor", sc);
				System.out.println();
				num2 = comprobarEntreadaTextoEsNumero("Introduce el denominador valor", sc);
				division(num1, num2, calController);
				break;

			case "5":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el valor", sc);
				raizCuadrada(num1, calController);
				break;

			case "6":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el valor", sc);

				raizCubica(num1, calController);
				break;

			case "7":
				num1 = comprobarEntreadaTextoEsNumero("Introduce el valor de base", sc);
				System.out.println();
				num2 = comprobarEntreadaTextoEsNumero("Introduce el exponente", sc);
				potencia(num1, num2, calController);
				break;

			case "8":
				System.out.println("Adios, que tengas un buen dia");
				sc.close();
				condition = !condition;
				break;

			default:
				System.out.println();
				System.out.println("Opción no valida");
				break;
			}

		} while (condition);

	}

	/**
	 * Llama a la función sumar del controlador CalculadoraBasicControles, guarda el
	 * resultado y lo muestra por pantalla
	 * 
	 * @param num1
	 * @param num2
	 * @param calController
	 */
	public static void sumar(double num1, double num2, CalculadoraBasicController calController) {
		double resultado = calController.suma(num1, num2);
		System.out.println();
		System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + resultado + "\n");
	}

	/**
	 * Llama a la función restar del controlador CalculadoraBasicControles, guarda
	 * el resultado y lo muestra por pantalla
	 * 
	 * @param num1
	 * @param num2
	 * @param calController
	 */
	public static void restar(double num1, double num2, CalculadoraBasicController calController) {
		double resultado = calController.resta(num1, num2);
		System.out.println();
		System.out.println("El resultado de restar " + num1 + " - " + num2 + " es: " + resultado + "\n");
	}

	/**
	 * Llama a la función multiplicar del controlador CalculadoraBasicControles,
	 * guarda el resultado y lo muestra por pantalla
	 * 
	 * @param num1
	 * @param num2
	 * @param calController
	 */
	public static void multiplicar(double num1, double num2, CalculadoraBasicController calController) {
		double resultado = calController.multiplicacion(num1, num2);
		System.out.println();
		System.out.println("El resultado de multiplicar " + num1 + " * " + num2 + " es: " + resultado + "\n");
	}

	/**
	 * Llama a la función division del controlador CalculadoraBasicControles, guarda
	 * el resultado y lo muestra por pantalla. En caso de error muestra el mensage
	 * de la excepción
	 * 
	 * @param num1
	 * @param num2
	 * @param calController
	 */
	public static void division(double num1, double num2, CalculadoraBasicController calController) {
		try {
			double resultado = calController.division(num1, num2);
			System.out.println();
			System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es: " + resultado + "\n");
		} catch (ArithmeticException e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Llama a la función raizCuadrada del controlador CalculadoraBasicControles,
	 * guarda el resultado y lo muestra por pantalla. En caso de error muestra el
	 * mensage de la excepción
	 * 
	 * @param num1
	 * @param calController
	 */
	public static void raizCuadrada(double num1, CalculadoraBasicController calController) {
		try {
			double resultado = calController.raizCuadrada(num1);
			System.out.println();
			System.out.println("La raiz cuadrada de " + num1 + " es: " + resultado + "\n");
		} catch (IllegalArgumentException e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Llama a la función raizCubica del controlador CalculadoraBasicControles,
	 * guarda el resultado y lo muestra por pantalla. En caso de error muestra el
	 * mensage de la excepción
	 * 
	 * @param num1
	 * @param calController
	 */
	public static void raizCubica(double num1, CalculadoraBasicController calController) {
		try {
			double resultado = calController.raizCubica(num1);
			System.out.println();
			System.out.println("La raiz cubica de " + num1 + " es: " + resultado + "\n");
		} catch (IllegalArgumentException e) {
			System.out.println();
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Llama a la función potencia del controller CalculadoraBasicControles, guarda
	 * el resultado y lo muestra por pantalla
	 * 
	 * @param num1
	 * @param num2
	 * @param calController
	 */
	public static void potencia(double num1, double num2, CalculadoraBasicController calController) {
		double resultado = calController.potencia(num1, num2);
		System.out.println();
		System.out.println("El resultado de elevar " + num1 + "  a la  " + num2 + " es: " + resultado + "\n");
	}

	/**
	 * Muestra por consola un seguido de opciones
	 */
	public static void mostrarMenu() {
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		System.out.println("5) Raiz cuadrada");
		System.out.println("6) Raiz Cubica");
		System.out.println("7) Elevar");
		System.out.println("8) Salir");
	}

	/**
	 * Comprueba que la información introducida por el usuario es un número
	 * 
	 * @param txt
	 * @param sc
	 * @return double
	 */
	public static double comprobarEntreadaTextoEsNumero(String txt, Scanner sc) {
		boolean condition = true;
		double num = 0;

		do {
			try {
				System.out.println(txt);
				num = sc.nextDouble();
				condition = !condition;
			} catch (InputMismatchException e) {
				System.out.println("No se ha reconoció la entrada. Debes introducir un número");
				sc.next();
			}
		} while (condition);

		return num;
	}

}
