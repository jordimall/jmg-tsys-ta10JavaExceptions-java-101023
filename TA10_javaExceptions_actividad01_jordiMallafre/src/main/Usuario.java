package main;

import java.util.Scanner;

/**
 * En esta clase se genera y se controla los usuarios y el número de intentos
 * 
 * @author Jordi Mallafre
 */
public class Usuario {
	private String nombreDeUsuario;
	private int numIntentos;

	private final int NUMINTENTOSDEF = 0;

	/**
	 * @param nombreDeUsuario
	 * @param numIntentos
	 */
	public Usuario() {
		this.nombreDeUsuario = pedirNombreUsuario();
		this.numIntentos = NUMINTENTOSDEF;
	}

	public int getNumIntentos() {
		return numIntentos;
	}

	public void setNumIntentos(int numIntentos) {
		this.numIntentos = numIntentos;
	}

	@Override
	public String toString() {
		return nombreDeUsuario + " has necesitado " + numIntentos + " intentos para adivinar el número";
	}

	/**
	 * Se comprueba que el usuario no introduzca el nombre en blanco
	 * 
	 * @return String
	 */
	public String pedirNombreUsuario() {
		String entrada_texto = "";
		String nombreUsuario = "";
		boolean condition = true;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca un nombre de usuario");
			entrada_texto = sc.nextLine();
			if (entrada_texto.isEmpty()) {
				System.out.println("El nombre de usuario no puede estar en blanco");
			} else {
				nombreUsuario = entrada_texto;
				condition = !condition;
			}
		} while (condition);

		sc.close();

		return nombreUsuario;
	}

}
