/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslayer;

/**
 * validate
 *
 * @author fwu
 */
public class Validation {

    // This regular expression ensures that the password contains at least 3 letters and at least 6 characters long.
    private static final int password_MIN_LENGTH = 6;
    private static final String password_REGEX = "[A-Za-z]{3,}";
    
    // validate password format
    private void validatePassword(String password, String fieldName, boolean isNullAllowed) throws ValidationException {
		String trimPassword = password.trim();
		if (trimPassword == null && isNullAllowed) {

		} else if (trimPassword == null && !isNullAllowed) {
			throw new ValidationException(String.format("%s cannot be null", fieldName));
		} else if (trimPassword.length() == 0) {
			throw new ValidationException(String.format("%s cannot be empty or only whitespace", fieldName));
		} else if (trimPassword.length() < password_MIN_LENGTH) {
			throw new ValidationException(String.format("%s length must be %d", fieldName, password_MIN_LENGTH));
		} else if (!trimPassword.matches(password_REGEX)) {
			throw new ValidationException(String.format("%s should have at least 3 character and the length must greater than 6", fieldName));
		}
	}
    
    

    // validate customer input order must be integer.
}
