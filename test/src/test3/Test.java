package test3;

import org.apache.commons.codec.binary.Base64;

public class Test {

	public static void main(String[] args) {
		String text = "abcd:1234";
		
		byte[] encoded = Base64.encodeBase64(text.getBytes());
		String test = new String(encoded);
		byte[] decoded = Base64.decodeBase64(test);
		
		System.out.println(text);
		System.out.println(new String(encoded));
		System.out.println(new String(decoded));
	}

}
