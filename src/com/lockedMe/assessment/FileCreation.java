package com.lockedMe.assessment;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;



public class FileCreation {
	
	
protected void fileCreate() {
	String paath = "C:\\Merin\\";
	Scanner sc = new Scanner(System.in);
	System.out.println(" ");
	System.out.print("Enter the file name: ");
	String x = sc.nextLine();

	Path path = Paths.get(paath + x);
	
	try
	{
		Path p = Files.createFile(path); // creates file at specified location
		System.out.println("File Created at Path: " + p);
	}
	catch(IOException e)
	{System.out.println(" ");
		System.out.println("File exists");
		System.out.println(" ");
		System.out.println("enter a different name");
		fileCreate();

	}
}
}
