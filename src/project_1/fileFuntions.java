package project_1;

import java.util.ArrayList;
import java.util.Scanner;

public class fileFuntions {
	
	 ArrayList<String> Files = new ArrayList<String> (); 
	 
	 	void Addfile() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the File you would like to add");
		
		try{
			String current_file = scan.nextLine();
			if (this.Files.contains(current_file)) {
				System.out.println("File is already in the System");
			}else
			{
			this.Files.add(current_file);
			System.out.println("*** File Added ***");
			}}
		catch(Exception e) {
				System.out.println("Please enter a File_name");
				Addfile();
			}
		AddAgain();
	}
		
		void AddAgain() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Would you like to add more Files?\n1.Yes\n2.No");
		try {
			int choice  = scan.nextInt();
			if ( choice == 1) {
				Addfile();
			}
		}catch(Exception e) {
			System.out.println("Input either 1 or 2");
			AddAgain();
		}
		}
	
		void DeleteFiles() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("What file would you like to delete");
			String Deletion_File = scan.nextLine();
		
		 if (this.Files.contains(Deletion_File))
		 {
			 this.Files.remove(Deletion_File);
			 System.out.println("** Files found and Deleted **");
		 }
		 else
		 {
			 System.out.println("File not Found");
		 }}catch(Exception e) {
			 System.out.println("Please enter a file name");
			 DeleteFiles();
		 }
		DeleteAgain();
	 }
		
		void DeleteAgain() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Would you like to Delete more Files?\n1.Yes\n2.No");
			try {
				int choice  = scan.nextInt();
				if ( choice == 1) {
					DeleteFiles();
				}
			}catch(Exception e) {
				System.out.println("Input either 1 or 2");
				DeleteAgain();
			}
			}
	 
	  void SearchFile () {
			Scanner scan = new Scanner(System.in);
			try {
				System.out.print("What file would you like to find");
				String Searching_File= scan.nextLine();
				
			 if (this.Files.contains(Searching_File)) {
				 
				 System.out.println("File Found");
			 }
			 else
			 {
				 System.out.println("There is no such File");
			 }} catch(Exception e) {
				 System.out.println("Exeception Caught in SearchFile");
				 
			 }
		 }
	 
	  void file_names() {
			
			if (this.Files.isEmpty()) {
				System.out.println("There are currently no files in the System");
			}else {
				System.out.println("these are the current files in the System.");
				System.out.println("------------------------------------------");
				for (String x:this.Files) {
					System.out.println(x);
				}
				System.out.println("------------------------------------------");
			}

		}
	

}
