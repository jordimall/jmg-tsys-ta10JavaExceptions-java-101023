package main;

import exceptions.ExceptionsCustoms;

/**
 * En esta clase se implementan la malloria de funciones
 * 
 * @author Jordi Mallafre
 */
public class Util {

	public static void generarRandom()  {
		int rango = (100-1)+1;
		int random = (int) (Math.random() *rango) +1;
		System.out.println("Generando número aleatorio...");
		System.out.println("El número generado es: " + random);
		try {
			if(random % 2 ==0) {
				throw new ExceptionsCustoms(222);
			} else {
				throw new ExceptionsCustoms(111);
			}
		} catch (ExceptionsCustoms e) {
			System.out.println(e.getMessage());
		}
		
	}
}
