package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private String address;
    private String hobby;
    private transient int age;
    
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void writeMenberObject(Member m) throws IOException {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("mem.obj") );
			oos.writeObject(m);
		} finally {
			if( oos != null ){
				oos.close();
			}
		}
    }

	public Member readMemberObject() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = null;
		Member m = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("mem.obj") );
			m = (Member)ois.readObject();
		} finally {
			ois.close();
		}
		return m;
	}

}

