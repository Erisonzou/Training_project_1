package project_1;

import java.util.*;
import java.io.*;

public class main extends fileFuntions{

	 
	 private void ExecuteChoice() {
		 Scanner scan = new Scanner(System.in);
		 
		 try {
			 System.out.println(" 1. Add File \n 2. Delete File \n 3. Find File \n 4. Main menu");
			 int choice = scan.nextInt();
			 if (choice == 1) {
				this.Addfile();
			 }else if (choice == 2) {
				this.DeleteFiles();
			 }else if (choice == 3) {
				 this.SearchFile();
			 }else if (choice == 4) {
				 System.out.println("Returning to Main Menu");
				 runMachine();
			 }else {
				 System.out.println("Please Select one of the Three Choices");
				 ExecuteChoice();
			 }
			 
		 }catch(Exception e) {
			 System.out.println("Please Select one of the Three Choices");
			 ExecuteChoice();
		 }
	 }

	 void runMachine() {
		
		boolean running =true;
		Scanner scan = new Scanner(System.in);
		
		while (running == true)
		{
			try
			{
				System.out.println("------------------------------------------------------------------");
				System.out.println("LockedMe.Com");
				System.out.println("Erison Zou\r");
				System.out.println("Main Menu");
				System.out.println("Hi what would you like to do today\r");
				System.out.println(" 1. Show all current Files\n 2. User Interface\n 3. End Application");
				System.out.println("------------------------------------------------------------------");
				int choice =  scan.nextInt();
				
				if (choice == 1) {
					this.file_names();
				}else if (choice == 2) {
					this.ExecuteChoice();
					Collections.sort(this.Files);
				}else if (choice == 3) {
					System.out.println("Thank you for using this application!!");
					System.out.println("System is exiting");
					running = false;
				}else {
					System.out.println("Please enter a number between the range 1-3 to signify your choice: ");
					runMachine();
					
				}
				
			}catch (Exception e) {
				
				System.out.println("Please enter a numeric input between the range 1-3 to signify your choice:");
				runMachine();
				
			}
		}
	}
	
	public static void main(String[] args)
	{

		main current_files =  new main();
		
		current_files.runMachine();
			
	}

}

