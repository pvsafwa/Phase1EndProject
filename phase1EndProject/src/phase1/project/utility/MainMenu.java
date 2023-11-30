package phase1.project.utility;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import phase1.project.exception.ProperOptionValue;

public class MainMenu {
static File rootPath = new File("C:\\Users\\DEV-PC\\Desktop\\Workspace\\Phase1EndProject\\FileFolder");
public static void MenuOptions () throws Exception {
Scanner sc=new Scanner(System.in); 	
String con="";
do {
	System.out.println("*********************************");
	System.out.println("1: Display in Ascending Order");
	System.out.println("2: Sub Menu");
	System.out.println("3: Exit");
	System.out.println("*********************************");
	System.out.println("Enter Your Choice");
	String choice=sc.next();
	switch (choice) {
	case "1" : String listofFiles [] = rootPath.list();
				Arrays.sort(listofFiles);
				for (String name:listofFiles ) {
				System.out.println(name);	
	} break;
	case "2" : SubMenu.SubMenuOptions();
		//System.out.println("Hello I am option 2");
	break;
	case "3" : 
			System.out.println("Programm Terminated!");
			System.exit(0);
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

