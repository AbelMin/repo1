/*
 * Class: CMSC203 
 * Instructor: Professor Kuijt
 * Description: A program for the purpose of encrypting and decrypting user input
 * Due: 10/08/2023
 * Platform/compiler:
 * I pledge that I have completed the programming  assignment independently. 
 *  I have not copied the code from a student or any source. 
 *  I have not given my code to any student.
 *  Print your Name here: Abel Mintesnot
*/
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Abel Mintesnot
 * @version 10/08/2023
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		boolean inBounds = true;
		int i = 0;
		while (i < plainText.length()) {
			if (plainText.charAt(i) < LOWER_RANGE || plainText.charAt(i) > UPPER_RANGE)
				inBounds = false;
			i++;
		}
		return inBounds;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		StringBuilder encryptedText = new StringBuilder();
		char encryptedChar;
		
		if (isStringInBounds(plainText) == true) {
			for (int i = 0; i < plainText.length(); i++) {
				encryptedChar = plainText.charAt(i);
				encryptedChar = (char) (encryptedChar + key);
				
				while (encryptedChar > UPPER_RANGE) {
					encryptedChar = (char) (encryptedChar - RANGE);
				}
				encryptedText.append(encryptedChar);
			}
			return encryptedText.toString();
		}
		else
			return "The selected string is not in bounds, try again";
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		StringBuilder encryptedText = new StringBuilder();
		char encryptedChar;
		
		if (isStringInBounds(plainText) == true) {
			for (int i = 0, j = 0; i < plainText.length(); i++) {
				if (j >= bellasoStr.length())
					j = 0;
				encryptedChar = plainText.charAt(i);
				encryptedChar = (char) (encryptedChar + bellasoStr.charAt(j));
				
				while (encryptedChar > UPPER_RANGE) {
					encryptedChar = (char) (encryptedChar - RANGE);
				}
				encryptedText.append(encryptedChar);
				j++;
			}
			return encryptedText.toString();
		}
		else
			return "The selected string is not in bounds, try again";
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		StringBuilder decryptedText = new StringBuilder();
		char decryptedChar;
		
		if (isStringInBounds(encryptedText) == true) {
			for (int i = 0; i < encryptedText.length(); i++) {
				decryptedChar = encryptedText.charAt(i);
				decryptedChar = (char) (decryptedChar - key);
				
				while (decryptedChar < LOWER_RANGE) {
					decryptedChar = (char) (decryptedChar + RANGE);
				}
				decryptedText.append(decryptedChar);
			}
			return decryptedText.toString();
		}
		else
			return "The selected string is not in bounds, try again";
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
		StringBuilder decryptedText = new StringBuilder();
		char decryptedChar;
		
		if (isStringInBounds(encryptedText) == true) {
			for (int i = 0, j = 0; i < encryptedText.length(); i++) {
				if (j >= bellasoStr.length())
					j = 0;
				decryptedChar = encryptedText.charAt(i);
				decryptedChar = (char) (decryptedChar - bellasoStr.charAt(j));
				
				while (decryptedChar < LOWER_RANGE) {
					decryptedChar = (char) (decryptedChar + RANGE);
				}
				decryptedText.append(decryptedChar);
				j++;
			}
			return decryptedText.toString();
		}
		else
			return "The selected string is not in bounds, try again";
	}
}
