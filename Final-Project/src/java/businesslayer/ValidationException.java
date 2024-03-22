/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

/**
 *
 * @author fwu
 */
public class ValidationException extends Exception {
    
    public ValidationException() {
		super("Data not in valid format");
	}

	public ValidationException(String message) {
		super(message);
	}

	public ValidationException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public ValidationException(Throwable throwable) {
		super(throwable);
	}
}
