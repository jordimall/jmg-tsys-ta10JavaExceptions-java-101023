package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase se implementaran la malloria de metodos para el buen
 * funci�namiento de la aplicaci�n
 * 
 * @author Jordi Mallafre
 */
public class Util {

	/**
	 * Se genera una contrase�a por defecto y se comprueva si es fuerte o no
	 */
	public static void generarContrase�aDefecto() {
		Password pass = new Password();
		System.out.println("La contrase�a generada es: " + pass.getContrase�a());
		comprobarContrase�a(pass);
	}

	/**
	 * Se le pide al usuario una longitud para generar una contrase�a y se comprueva
	 * si es fuerte o no
	 */
	public static void generarContrase�aUsuario() {
		int longitud = comprovarNumeroEntradoUsuario("Escribe la longitud que quieres que tenga la contrase�a");
		Password pass = new Password(longitud);
		System.out.println("La contrase�a generada es: " + pass.getContrase�a());
		comprobarContrase�a(pass);
	}

	/**
	 * A traves de la funci�n esFuerte del objeto Password se obtiene un boleano con
	 * el cual mostramos por consola un mensaje diferente
	 * 
	 * @param pass
	 */
	public static void comprobarContrase�a(Password pass) {
		if (pass.esFuerte()) {
			System.out.println("La contrase�a generada es fuerte");
		} else {
			System.out.println("La contrase�a generada no es fuerte");
		}
	}

	/**
	 * Se comprueba en bucle que la informaci�n introducida por el usuario es un
	 * n�mero
	 * 
	 * @param txt
	 * @param sc
	 * @param user
	 * @return int
	 */
	public static int comprovarNumeroEntradoUsuario(String txt) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		boolean condition = true;
		while (condition) {

			try {
				System.out.print(txt + "\n");
				res = sc.nextInt();
				condition = !condition;
			} catch (InputMismatchException e) {
				System.out.println("No se ha reconoci� la entrada. Debes introducir un n�mero");
				sc.next();
			}
		}
		sc.close();
		return res;
	}
}
