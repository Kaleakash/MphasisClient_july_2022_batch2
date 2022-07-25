package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharacterwiseOperation {

	public static void main(String[] args) throws Exception{
		// taking the value through keyboard, character wise and display on console 
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the name");
//		String name  = br.readLine();
//		System.out.println("enter the id");
//		int id = Integer.parseInt(br.readLine());
//		System.out.println("Enter the salary");
//		float salary = Float.parseFloat(br.readLine());
//		System.out.println("Your name is "+name);
//		System.out.println("Your id is "+id);
//		System.out.println("Your salary is "+salary);
		
		// copy from one file to another file 
		FileReader fr = new FileReader("abc.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("demo2.txt");
		String ch="";
		
		while(((ch= br.readLine()) != null)){
				fw.write(ch);
				//System.out.println(ch);
		}
	
		fw.close();
		fr.close();
		System.out.println("file copied");
	}

}
