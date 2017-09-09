package com.sharu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//import com.patil.Ki;

class Pat implements Serializable{
	int a;
	String b;
	Test t;
	Pat(int a, String b,Test t){
		this.a=a;
		this.b=b;
		this.t=t;
	}
	
}

class Test implements Serializable{
	int a;
	int b;
	Test(int a, int b){
		this.a=a;
		this.b=b;
	}
	
}

public class Seeri {

	
	public static void main(String[] args) {
		Test t1=new Test(5,10);
		Pat pa=new Pat(5,"hi",t1);
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("heelo.es");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(pa);
			oos.close();
			
			FileInputStream fis=new FileInputStream("heelo.es");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Pat p1=(Pat)ois.readObject();
			
			System.out.println(p1.a);
			System.out.println(p1.b);
			System.out.println(p1.t.a);
			System.out.println(p1.t.b);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
