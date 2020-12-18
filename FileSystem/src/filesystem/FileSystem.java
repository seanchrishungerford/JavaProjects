/*
* Author: Sean Hungerford
* Note: This application was written on a Mac, and must be run on a Mac computer.
* Change the directory name for the application, for it to work properly, if needed.
*/
package filesystem;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileSystem {
	
	static void fileFinder(String fname, File theFile) {
        File[] listOfFiles = theFile.listFiles();
        if(listOfFiles!=null)
        for (File fi : listOfFiles)
        {
            if (fi.isDirectory())
            {
                fileFinder(fname,theFile);
            }
            else if (fname.equalsIgnoreCase(fi.getName()))
            {
                System.out.println(fi.getParentFile() + "/" + fname);
            }
        }
	}
	//Works Cited: https://stackoverflow.com/questions/15624226/java-search-for-files-in-a-directory
	public static void main(String[] args) throws IOException {
		
		File f = new File("/Users/seanhungerford/Desktop/Testing");

		int option = 0;
		Scanner sc = new Scanner(System.in);
		File dir = new File("/Users/seanhungerford/Desktop/Testing");
		File[] files = f.listFiles();
		while(option != 6) {
			
			System.out.println("Welcome to FileSystem!");
			System.out.println("Developer: Sean Hungerford.");
			System.out.println("You can select between 6 options, shown below with their respective fuctionality:\n");
			
			System.out.println("1) Retrieve file names in ascending order.");
			System.out.println("2) Add a file.");
			System.out.println("3) Delete a file.");
			System.out.println("4) Search for a file.");
			System.out.println("5) Return to main menu. ");
			System.out.println("6) Close the application. ");
			
			System.out.println("Select from above options: ");
			option = sc.nextInt();
			
			
			f = new File("/Users/seanhungerford/Desktop/Testing");
			if(!f.exists()){
				f.mkdir();}
			f.createNewFile();
			
			if(option == 1) {

				f = new File("/Users/seanhungerford/Desktop/Testing");
				if(!f.exists()){
					f.mkdir();}
				f.createNewFile();
				
				ArrayList<File> alFiles = new ArrayList<File>();
				 files = f.listFiles(); //Used to sort the files.
		         for(File eachFile : files) { 
		             alFiles.add(eachFile);
		          }

				Collections.sort(alFiles); //Sort.
				//Display:
				System.out.println("The files in the directory are: ");
				
					System.out.println(alFiles);
	
			}
			if(option == 2) {
				
				System.out.println("Enter file name to add: ");
				Scanner fileSc = new Scanner(System.in);
				String s = fileSc.nextLine();
				f=new File(dir + "/" +s);
				
				if (f.createNewFile()) {
				    System.out.println("File created.");
				} else {
				    System.out.println("File already exists.");
				}
				files = f.listFiles();
			}
			if(option == 3) {
				Scanner scnr2 = new Scanner(System.in);
				System.out.println("Which file would you like to delete: ");
				String fileToDelete = scnr2.nextLine();
				try
				{
				    File f2=new File(dir + "/" + fileToDelete);
				    boolean deleted = f2.delete();
				    f = f2;
				} catch(Exception e) {
					System.out.println("File is not valid");
				}
				
				
			}
			if(option == 4) {
				
				System.out.println("Enter a file you would like to search for: ");
				Scanner s3 = new Scanner(System.in);
				String fileToSearch = s3.nextLine();
				
				fileFinder(fileToSearch, dir);	
				
			}
			if(option == 5) {
				continue;
			}
			if(option == 6) {
				//Do nothing
			}
			
		}
			System.out.println("Thank you for using FileSystem. Goodbye.");
	}
}
