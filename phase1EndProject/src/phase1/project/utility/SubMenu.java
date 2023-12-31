package phase1.project.utility;

import java.io.File;
//import java.io.IOException;
import java.util.Scanner;

import phase1.project.exception.ProperOptionValue;

public class SubMenu {
public static void SubMenuOptions() throws Exception
{
	
	Scanner sc = new Scanner(System.in);
	String con="";
	
	do {
		System.out.println("*********************************");
		System.out.println("1: Create File");
		System.out.println("2: Delete File");
		System.out.println("3: Search File");
		System.out.println("4: Goto Main Menu");
		System.out.println("*********************************");
		System.out.println("Please Enter  Your Choice");
		Scanner ch = new Scanner(System.in);
		String choice = ch.next();
		File ff=new File("C:\\Users\\DEV-PC\\Desktop\\Workspace\\Phase1EndProject\\FileFolder");	
		if (choice.equals("1") || choice.equals("2") || choice.equals("3"))
		{
		Scanner sin = new Scanner(System.in);
		System.out.println("Please Enter the File Name");
		String fileName = sin.next();
		String newPath= ff.getPath()+ "\\"+ fileName;
		ff=new File (newPath);
		}
		switch (choice) {
		
		case "1": 
			
			if (ff.exists()) {
			System.out.println("File Already Exists");
		} else {
			
			ff.createNewFile();
			System.out.println("New File Created");
		} 
		
		break;
		
		case "2": 
			
			if (ff.exists()) {
			ff.delete();
			System.out.println("File Deleted Succesfully");
		} else {
			
			System.out.println("File Not Found with name " + ff.getName());
		} 
		
		break;
		
		case "3": 
			
			if (ff.exists()) {
			System.out.println("File Found");
		} else {
			
			
			System.out.println("File Not Found with name " + ff.getName());
		} 
		
		break;
		case "4" : MainMenu.MenuOptions();
		break;
		default :
			System.out.println("You have entered an invalid option");
		}
		System.out.println("Do you want to continue ? (y/n)");
		
		do {
			con=sc.next();
			if (con.equals("n"))
			{
			System.out.println("Program Terminated!");
			System.exit(0);
			}
		try {
		if ( !con.equals("y") && !con.equals("n")) {
		throw new ProperOptionValue("Please Enter y or n");		
		}
		}
	catch (ProperOptionValue e) {
	System.err.print(e);
	}
		}
		while (!con.equals("y") && !con.equals("n"));
	}	
	while (con.equalsIgnoreCase("y"));
	
}
}
