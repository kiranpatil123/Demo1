package com.nir;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A {
	
	A(){
		System.out.println("inside default constructor");
	}
	int d;
	A(int d){
		//System.out.println("inside default constructor"); 
		this.d=d;
	}
}

class C extends A implements Serializable{
	int a;
	String b;
	//int d;

	C(int a,String b,int d){
		super(d);
		this.a=a;
		this.b=b;
	}
}

public class Subclass {

	public static void main(String[] args) {
		C c=new C(1,"nayana",20);
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("heelo.es");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			
			FileInputStream fis=new FileInputStream("heelo.es");
			ObjectInputStream ois=new ObjectInputStream(fis);
			C c1=(C)ois.readObject();
		System.out.println(	c1.a);
		System.out.println(	c1.b);
		
	
			
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
