package com.practice.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * @author Manish Singh
 *
 * 31-Jan-2024
 */
public class DemoFile {

	public static void main(String[] args) {

		//Code to create a new file
		/*
		File myFile = new File("newFile.txt");
		
		try {
			myFile.createNewFile();
			System.out.println("File created successfully");
		} catch (IOException e) {
			System.out.println("Unable to create this file");
		}
		
		
		// Code to write to a file
		try {
			FileWriter fileWriter = new FileWriter("newFile.txt");
			fileWriter.write("This is our first file in the java practice course\nOkay now bye");
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Unable to write to this file. File Not Found! ");
			e.printStackTrace();
		}
		
		
		
		// Code to read a file
		File myFile = new File("newFile.txt");
		try {
			Scanner sc = new Scanner(myFile);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		*/
		
		// code for deleting a file 
		
		File myFile = new File("newFile.txt");
		if (myFile.delete()) {
			System.out.println("File deleted successfully...");
			
		} else {
			System.out.println("Some problem occured while deleting the file!");
		}
	}

}
