package test5;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		String test = "asd##";
		
		String[] result = test.split("##");
		for( String r : result ){
			System.out.println( r );
		}
		
		System.out.println("::::::::::: length = "+result.length);
	}

}
