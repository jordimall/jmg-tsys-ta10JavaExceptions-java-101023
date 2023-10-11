package main;

/**
 * <li>int longitud
 * <li>String contrase�a
 * 
 * @author Jordi Mallafre
 */
public class Password {

	private int longitud;
	private String contrase�a;
	private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	private final int LONGITUDDEF = 8;

	public Password() {
		this.longitud = this.LONGITUDDEF;
		this.contrase�a = generarPassword(this.LONGITUDDEF);
	}

	/**
	 * @param longitud
	 * @param contrase�a
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generarPassword(longitud);
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * Genera una contrase�a aleatoria con una logitud maxima pasada por parametro
	 * 
	 * @param longitud
	 * @return String
	 */
	private String generarPassword(int longitud) {
		String password = "";

		for (int i = 0; i < longitud; i++) {
			int indice = (int) (Math.random() * this.CARACTERES.length());
			char caracter = CARACTERES.charAt(indice);
			password += caracter;
		}

		return password;
	}

	/**
	 * convierte la contrase�a en un array de caracteres y compara si el caracter
	 * esta en mayuscula, minuscula o es un n�mero. Si cumple con las condici�nes
	 * establecidas devuelve true, en caso contrario false
	 * 
	 * @return boolean
	 */
	public boolean esFuerte() {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;

		for (char caracter : this.contrase�a.toCharArray()) {
			if (Character.isUpperCase(caracter)) {
				mayusculas++;
			} else if (Character.isLowerCase(caracter)) {
				minusculas++;
			} else if (Character.isDigit(caracter)) {
				numeros++;
			}
		}

		return mayusculas >= 2 && minusculas >= 1 && numeros >= 5;
	}
}
