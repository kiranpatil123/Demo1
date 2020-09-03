package com.patil;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*hi hello*/
class Ki  implements Serializable{
	 static int a;
	transient String b;

	Ki(int a, String b) {
		System.out.println("inside default constructor");
		this.a=a;
		this.b=b;
	}
}

public class Seria {

	public static void main(String[] args) {
		
		Ki k=new Ki(12,"kiran");
		try {
			FileOutputStream fos=new FileOutputStream("heelo.es");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(k);
			oos.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
