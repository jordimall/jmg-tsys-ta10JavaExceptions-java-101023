package main;

import exceptions.ExceptionsCustoms;

/**
 * En esta clase se implementan la malloria de metodos
 * 
 * @author Jordi Mallafre
 */
public class Utils {

	/**
	 * A traves de un bucle y el resultado de generar un numero random se lanza una
	 * excepción distinta
	 */
	public static void ProbocarExcepcion() {
		for (int i = 0; i < 5; i++) {
			try {
				if (Math.round(Math.random()) == 0) {
					throw new ExceptionsCustoms(111);
				} else {
					throw new ExceptionsCustoms(222);
				}
			} catch (ExceptionsCustoms ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
