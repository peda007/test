package test;

import static java.lang.annotation.ElementType.TYPE;

import java.io.IOException;
import java.lang.annotation.Target;

@Target({TYPE})
@interface ClassInfo{
	String value();
	int data() default 0;
}

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		
		
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
