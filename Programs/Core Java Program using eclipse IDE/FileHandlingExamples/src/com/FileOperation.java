package com;

import java.io.File;

public class FileOperation {

	public static void main(String[] args) throws Exception{
	//File ff = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\test.txt");
		File ff = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\MyFolder");
	System.out.println(ff.getPath());
	System.out.println(ff.getName());
	System.out.println(ff.canRead());
	System.out.println(ff.canWrite());
	System.out.println(ff.canExecute());
	System.out.println(ff.length());
	ff.list();
	ff.exists();
	ff.delete();
	ff.createNewFile();
	
	
	}

}
