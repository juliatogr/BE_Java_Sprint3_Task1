package n1_singleton;

import java.util.Stack;

public class Undo {
	
	private static Undo instance = null; 
	// Save the commands on a stack to delete the last one easily
	private static Stack<String> commands; 

	private Undo() {

		commands = new Stack<String>();
	}

    private synchronized static void createInstance() {
    	
        if (instance == null) {
        	
        	// we add a synchronized zone where we can create the new instance 
        	// to avoid synchronization problems
        	
            synchronized(Undo.class) {
                // We need a second check to confirm there is no instance already created
                if (instance == null) { 
                	instance = new Undo();
                }
            }
        }
    }
    
	public static Undo getInstance() {
		
		if (instance == null) {
			createInstance();
		}
		
		return Undo.instance;
	}
	
	public void printLastCommands() {
		
		final int MAX_COMMANDS = 10;
		
		int numCommands = commands.size();
		int counter = 0;
		
		while (counter < numCommands && counter < MAX_COMMANDS) {
			System.out.println(commands.get(counter));
			counter++;
		}	
	}
	
	public void addCommand(String c) {
		commands.add(c);
	}
	
	public void undoCommand() {
		commands.pop();
	}
}
