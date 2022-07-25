package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class BytewiseOperation {

	public static void main(String[] args) throws Exception{
		// taking the value throug keyboard, and display on console 
	
//	DataInputStream dis = new DataInputStream(System.in);
//	PrintStream ps = System.out;
//	ps.println("Enter the name");
//	String name = dis.readLine();
//	ps.println("Your name is "+name);
		
		// Taking the value through keyboard and store the file 
		
//		DataInputStream dis = new DataInputStream(System.in);
//		FileOutputStream fos = new FileOutputStream("abc.txt");
//		int ch;
//		System.out.println("Enter the data");
//		while((ch = dis.read()) != '@' ) {
//				fos.write(ch);
//		}
//		fos.close();
//		System.out.println("Data Stored successfully");
		
		// copy from one file to another file 
//		FileInputStream fis = new FileInputStream("abc.txt");
//		FileOutputStream fos = new FileOutputStream("demo.txt");
//		int ch;
//		while((ch = fis.read()) != -1) {   //-1 is equal to EOF
//				fos.write(ch);
//		}
//		fis.close();
//		fos.close();
//		System.out.println("file copied");
		
		// copy one file to another file using buffer 
		FileInputStream fis = new FileInputStream("abc.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("demo1.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int ch;
		while((ch = bis.read()) != -1) {   //-1 is equal to EOF
				bos.write(ch);
		}
		
	//	bos.flush();
		fis.close();
		fos.close();
		System.out.println("file copied");
	}

}
