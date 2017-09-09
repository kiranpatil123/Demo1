package com.patil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deseria {

	
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("heelo.es");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Ki k1=(Ki)ois.readObject();
			System.out.println(k1.a);
			System.out.println(k1.b);
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
