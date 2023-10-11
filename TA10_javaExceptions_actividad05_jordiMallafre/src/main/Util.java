package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase se implementaran la malloria de metodos para el buen
 * funciónamiento de la aplicación
 * 
 * @author Jordi Mallafre
 */
public class Util {

	/**
	 * Se genera una contraseña por defecto y se comprueva si es fuerte o no
	 */
	public static void generarContraseñaDefecto() {
		Password pass = new Password();
		System.out.println("La contraseña generada es: " + pass.getContraseña());
		comprobarContraseña(pass);
	}

	/**
	 * Se le pide al usuario una longitud para generar una contraseña y se comprueva
	 * si es fuerte o no
	 */
	public static void generarContraseñaUsuario() {
		int longitud = comprovarNumeroEntradoUsuario("Escribe la longitud que quieres que tenga la contraseña");
		Password pass = new Password(longitud);
		System.out.println("La contraseña generada es: " + pass.getContraseña());
		comprobarContraseña(pass);
	}

	/**
	 * A traves de la función esFuerte del objeto Password se obtiene un boleano con
	 * el cual mostramos por consola un mensaje diferente
	 * 
	 * @param pass
	 */
	public static void comprobarContraseña(Password pass) {
		if (pass.esFuerte()) {
			System.out.println("La contraseña generada es fuerte");
		} else {
			System.out.println("La contraseña generada no es fuerte");
		}
	}

	/**
	 * Se comprueba en bucle que la información introducida por el usuario es un
	 * número
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
				System.out.println("No se ha reconoció la entrada. Debes introducir un número");
				sc.next();
			}
		}
		sc.close();
		return res;
	}
}
