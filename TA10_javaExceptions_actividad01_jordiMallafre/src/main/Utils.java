package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase se implementan la malloria de metodos
 * 
 * @author Jordi Mallafre
 */
public class Utils {

	/**
	 * se crea un usuario y un numero aleatorio y se pasan al metodo jugar
	 */
	public static void empezarJuego() {
		Usuario user = new Usuario();
		JuegoAdivinarNumero numAleatorio = new JuegoAdivinarNumero();
		jugar(user, numAleatorio);
	}

	/**
	 * Se le pide al usuario en bucle que escriva un número y se le muestra por
	 * consola un mensaje diferente en funcion del resultado de compararlo con el
	 * número generado aleatoriamente
	 * 
	 * @param user
	 * @param numAleatorio
	 */
	public static void jugar(Usuario user, JuegoAdivinarNumero numAleatorio) {
		int numUsuario = 0;
		int resultado = 0;
		boolean condition = true;
		Scanner sc = new Scanner(System.in);
		System.out.println();
		do {
			numUsuario = comprovarNumeroEntradoUsuario("Introduce un número entero entre el 1 y el 500", sc, user);
			resultado = numAleatorio.comprovarNumero(numUsuario);

			if (resultado == -1) {
				System.out.println();
				System.out.println("El número que tienes que adivinar es menor");
			} else if (resultado == 1) {
				System.out.println();
				System.out.println("El número que tienes que adivinar es mayor");
			} else {
				System.out.println();
				System.out.println("Has acertado");
				condition = !condition;
			}
			System.out.println("Llevas " + user.getNumIntentos() + " intento/s");
		} while (condition);
		sc.close();
		System.out.println(numAleatorio);
		System.out.println(user);
		System.out.println("Felicidades");

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
	public static int comprovarNumeroEntradoUsuario(String txt, Scanner sc, Usuario user) {
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
			} finally {
				user.setNumIntentos(user.getNumIntentos() + 1);
			}
		}
		return res;
	}
}
