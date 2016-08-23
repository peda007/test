package test;

import static java.lang.annotation.ElementType.TYPE;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Target({TYPE})
@interface ClassInfo{
	String value();
	int data() default 0;
}

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		
		StringBuffer obj = new StringBuffer();
		List<String> list = new ArrayList<String>();
		
		String temp = null;
		try{
			FileReader fr = new FileReader("C:/user_datas/ips.dat");
			int c;
			while( true ){
				c = fr.read();
				temp = String.valueOf((char)c);
				if( Pattern.matches("\r", temp) || Pattern.matches("\n", temp) || Pattern.matches("\r\n", temp) ){
					list.add( obj.toString().replaceAll("\r","").replaceAll("\n","").replaceAll("\r\n","") );
					obj = new StringBuffer();
				} else { 
					obj.append( temp );
				}
				
				System.out.print( temp );
				if( c == -1 ){
					break;					
				}
			}			
		} catch(Exception e) {
			
		}
		System.out.println();
		System.out.println( list.size() );
		System.out.println();
		
		//*
		
		Pattern pattern = Pattern.compile("[0-9]{1,}[.][0-9]{1,}[.][0-9]{1,}[.][0-9]{1,}(:[0-9]{4})?");
		Matcher match = null;

		System.out.println("::::::::::::::::::::::::::::::::::");
		System.out.println("::::::::::::::::::::::::::::::::::");
		
		List<String> result = new ArrayList<String>();
		String res = null;
		for (int i = 0; i < list.size(); i++) {
			match = pattern.matcher(list.get(i));
			try{
				if( match.find() ){
					res = list.get(i).substring(match.start(), match.end());
					if( !result.contains(res) ){
						result.add( res );
					}
					//System.out.println( res );
				}
			} catch(Exception e) {
				continue;
			}
		}//*/
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println( result.get(i) );
		}
		/*
		Member t_mem = new Member();
		t_mem.setName("eminem");
		t_mem.setHobby("rap");
		t_mem.writeMenberObject(t_mem);
		Member result_mem = t_mem.readMemberObject();
		System.out.println(result_mem.getName());
		System.out.println(result_mem.getHobby());
		//*/
		
		
		//*/
	}
}
