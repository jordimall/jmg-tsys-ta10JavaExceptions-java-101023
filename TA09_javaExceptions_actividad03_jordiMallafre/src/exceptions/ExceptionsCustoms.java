package exceptions;

/**
 * En esta clase se crean excepciones personalicadas
 * 
 * @author Jordi Mallafre
 */
public class ExceptionsCustoms extends Exception {

	private int codigoException;

	public ExceptionsCustoms() {
		super();
	}

	/**
	 * @param codigoException
	 */
	public ExceptionsCustoms(int codigoException) {
		super();
		this.codigoException = codigoException;
	}

	/**
	 * En función del codigo de error lanzado devuelve un mensaje diferente
	 * 
	 * @return String
	 */
	public String getMessage() {
		String message = "";
		switch (codigoException) {
		case 111:
			message = "El número generado es impar";
			break;
		case 222:
			message = "El número generado es par";
			break;
		}

		return message;
	}

}
