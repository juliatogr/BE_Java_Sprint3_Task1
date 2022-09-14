package n1_singleton;

import java.util.ArrayList;
import java.util.Stack;

//La clase Base de datos define el método `obtenerInstancia`
// que permite a los clientes acceder a la misma instancia de
// una conexión de la base de datos a través del programa.

public class Undo {
	// El campo para almacenar la instancia singleton debe
	// declararse estático.
	private static Undo instance = null; 
	private static Stack<String> commands;
	// El constructor del singleton siempre debe ser privado
	// para evitar llamadas de construcción directas con el
	// operador `new`.
	private Undo() {
	// Algún código de inicialización, como la propia
	// conexión al servidor de una base de datos.
	// ...
		commands = new Stack<String>();
	
	// El método estático que controla el acceso a la instancia
	// singleton.
	}
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
	// Garantiza que la instancia aún no se ha
	// inicializado por otro hilo mientras ésta ha
	// estado esperando el desbloqueo.
    private synchronized static void createInstance() {
        if (instance == null) {
            // Solo se accede a la zona sincronizada
            // cuando la instancia no está creada
            synchronized(Undo.class) {
                // En la zona sincronizada sería necesario volver
                // a comprobar que no se ha creado la instancia
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
