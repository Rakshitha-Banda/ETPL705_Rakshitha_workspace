package com.evergent.corejava.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ExceptionDemo15 {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			//attempt to open a file does not exist
			File file=new File("c:/myData1/myinfo.txt");
			Scanner sc=new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			//handle the filenotfoundexception
			System.out.println("file not found exception"+e);
			//e.printStackTrace();
		}

	}

}
