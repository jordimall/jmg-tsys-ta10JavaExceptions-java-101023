package main;

/**
 * <li>int longitud
 * <li>String contraseña
 * 
 * @author Jordi Mallafre
 */
public class Password {

	private int longitud;
	private String contraseña;
	private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	private final int LONGITUDDEF = 8;

	public Password() {
		this.longitud = this.LONGITUDDEF;
		this.contraseña = generarPassword(this.LONGITUDDEF);
	}

	/**
	 * @param longitud
	 * @param contraseña
	 */
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword(longitud);
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	/**
	 * Genera una contraseña aleatoria con una logitud maxima pasada por parametro
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
	 * convierte la contraseña en un array de caracteres y compara si el caracter
	 * esta en mayuscula, minuscula o es un número. Si cumple con las condiciónes
	 * establecidas devuelve true, en caso contrario false
	 * 
	 * @return boolean
	 */
	public boolean esFuerte() {
		int mayusculas = 0;
		int minusculas = 0;
		int numeros = 0;

		for (char caracter : this.contraseña.toCharArray()) {
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
