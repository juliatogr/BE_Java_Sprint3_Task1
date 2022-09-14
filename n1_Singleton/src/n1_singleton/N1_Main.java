package n1_singleton;

import java.util.Scanner;

public class N1_Main {

	public static void main(String[] args) {
		Undo undo = Undo.getInstance();
		Scanner sc = new Scanner(System.in);
		String input = "";

		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("\nIntrodueix una commanda\n");
			System.out.println("Escriu --history per veure les 10 �ltimes comandes introduides.");
			System.out.println("Escriu --undo per desfer l'�ltima comanda");
			System.out.println("Escriu --exit per sortir");
			
			input = sc.nextLine();
			
			switch(input) {
			case "--history":
				undo.printLastCommands();
				break;
			case "--undo":
				undo.undoCommand();
				undo.addCommand(input);
				break;
			case "--exit":
				exit = true;
				break;
			case "\n":
				break;
			default:
				undo.addCommand(input);
				break;
			}
		}
		
		sc.close();
		System.out.println("Ad�u!");
	}

}
