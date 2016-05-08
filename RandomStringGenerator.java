package model;

import java.util.Random;

/**
 * Class with methods for generating strings with random chars.
 * 
 * @author Gianluca Maiorino
 */
public class RandomStringGenerator {

	private static final String STRING 			= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String SPECIAL_STRING 	= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzàèéìòù,;.:-_ç@°#([{}])+*/|!£$%&/()=?^~¡¢€£¤¥¦§¨©ª«¬­®¯°±²³´µ¶·¸¹º»¼½¾¿ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚÛÜÝÞßàáâãäåæçèéêëìíîïðñòóôõö÷øùúûüýþÿ";
	private static Random random = new Random();
	
	/**
	 * Generate a string with random chars, numbers and, eventually, special chars (e.g. punctuation chars).
	 * This random generator is based on {@link Random}.
	 * 
	 * <p>The invocation of this method is equivalent to {@code getRandomString(length, false)}.</p>
	 * 
	 * @param length specify the length of the result string
	 * @return a {@link String} with random alphanumeric content 
	 * 
	 * @see #getRandomString(int, boolean)
	 */
	public static String getRandomString(int length) {
		return getRandomString(length, false);
	}
	
	/**
	 * Generate a string with random chars, numbers and, eventually, special chars (e.g. punctuation chars).
	 * This random generator is based on {@link Random}.
	 * 
	 * @param length specify the length of the result string
	 * @param specialChars if true returns a string containing special chars, false otherwise
	 * @return a {@link String} with random alphanumeric content 
	 */
	public static String getRandomString(int length, boolean specialChars) {
		StringBuilder sb = new StringBuilder(length);
		String string = (specialChars) ? SPECIAL_STRING : STRING;
		int size = string.length();
		
		for(int i = 0; i < length; i++)
			sb.append(string.charAt(random.nextInt(size)));			
		
		return sb.toString();
	}
}
