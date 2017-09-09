package com.kiran;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//import javax.sql.rowset.spi.TransactionalWriter;

//import sun.awt.image.FileImageSource;

class Kiran implements Serializable {

	transient int a;
	 String c;

	Kiran() {
		System.out.println("inside default constructor");
	}

	Kiran(int a, String c) {
		System.out.println("inside parameterised constructor");

		this.a = a;
		this.c = c;
	}

}

public class Serial {

	public static void main(String[] args) {

		try {

			Kiran k = new Kiran(10, "hai");
			FileOutputStream fos = new FileOutputStream("heelo.es");

			ObjectOutputStream ois = new ObjectOutputStream(fos);

			ois.writeObject(k);
			ois.close();

			FileInputStream fis = new FileInputStream("heelo.es");
			ObjectInputStream oos = new ObjectInputStream(fis);
			Kiran k1 = (Kiran) oos.readObject();

			System.out.println(k1);
			System.out.println(k);

			System.out.println(k1.a);
			System.out.println(k1.c);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
