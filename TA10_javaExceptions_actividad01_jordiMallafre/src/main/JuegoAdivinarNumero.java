package main;

/**
 * En esta clase se genera un numero aleatoria en un rango entre el 1 al 500 y
 * se comprueba si el número pasado por parametro es el mismo que el generado
 * aleatoriamente
 * 
 * @author Jordi Mallafre
 */
public class JuegoAdivinarNumero {
	private int numAleatorio;

	private final int NUMMINIMO = 1;
	private final int NUMMAXIMO = 500;

	public JuegoAdivinarNumero() {
		this.numAleatorio = generarNumeroAleatorio();
	}

	public int getNumAleatorio() {
		return numAleatorio;
	}

	@Override
	public String toString() {
		return "El número generado aleatoriamente es: " + numAleatorio;
	}

	/**
	 * genera un número aleatorio entre el 1 y el 500
	 * 
	 * @return int
	 */
	public int generarNumeroAleatorio() {

		int rango = this.NUMMAXIMO - this.NUMMINIMO + 1;
		int numRandom = (int) (Math.random() * rango) + this.NUMMINIMO;

		return numRandom;
	}

	/**
	 * Comprueba si el valor pasado por parametro es igual al generado
	 * aleatoriamente Devuelve -1 si el número pasado por parametro es mas grande
	 * Devuelve 1 si el número pasado por parametro es mas pequeño Devuelve 0 si el
	 * número pasado por parametro es mas igual
	 * 
	 * @param num
	 * @return int
	 */
	public int comprovarNumero(int num) {
		int resultado = Integer.MIN_VALUE;

		if (this.numAleatorio < num) {
			resultado = -1;
		} else if (this.numAleatorio > num) {
			resultado = 1;
		} else {
			resultado = 0;
		}

		return resultado;
	}

}
