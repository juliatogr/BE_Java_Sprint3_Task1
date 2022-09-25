package n3_main;

import java.util.Scanner;

public class N3_Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean exit = false;
		
		while (!exit) {
			String argument = sc.nextLine();

	        IMotorable lamp = new Vehicle();
	
	        // Pass reference to the lamp instance to each command
	        Command switchClose = new RunMotorCommand(lamp);
	        Command switchOpen = new StopMotorCommand(lamp);
	
	        // Pass reference to instances of the Command objects to the switch
	        Motor s = new Motor(switchClose, switchOpen);
	
	        if (argument.equalsIgnoreCase("s"))
	        {
	            // Switch (the Invoker) will invoke Execute() on the command object.
	            s.stop();
	        }
	        else if (argument.equalsIgnoreCase("r"))
	        {
	            // Switch (the Invoker) will invoke the Execute() on the command object.
	            s.run();
	        }
	        else if (argument.equalsIgnoreCase("e"))
	        {
	        	exit = true;
	        	System.out.println("Bye");
	        }
	        else
	        {
	            System.out.println("Argument not valid");
	        }
		}

	}
}
