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
	 * En funci�n del codigo de error lanzado devuelve un mensaje diferente
	 * 
	 * @return String
	 */
	public String getMessage() {
		String message = "";
		switch (codigoException) {
		case 111:
			message = "Exception 111: El n�mero generado aleatoriamente es 0";
			break;
		case 222:
			message = "Exception 222: El n�mero generado aleatoriamente es 1";
			break;
		}

		return message;
	}

}
