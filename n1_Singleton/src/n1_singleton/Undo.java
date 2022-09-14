package n1_singleton;

import java.util.ArrayList;
import java.util.Stack;

//La clase Base de datos define el m�todo `obtenerInstancia`
// que permite a los clientes acceder a la misma instancia de
// una conexi�n de la base de datos a trav�s del programa.

public class Undo {
	// El campo para almacenar la instancia singleton debe
	// declararse est�tico.
	private static Undo instance = null; 
	private static Stack<String> commands;
	// El constructor del singleton siempre debe ser privado
	// para evitar llamadas de construcci�n directas con el
	// operador `new`.
	private Undo() {
	// Alg�n c�digo de inicializaci�n, como la propia
	// conexi�n al servidor de una base de datos.
	// ...
		commands = new Stack<String>();
	
	// El m�todo est�tico que controla el acceso a la instancia
	// singleton.
	}
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciaci�n m�ltiple 
	// Garantiza que la instancia a�n no se ha
	// inicializado por otro hilo mientras �sta ha
	// estado esperando el desbloqueo.
    private synchronized static void createInstance() {
        if (instance == null) {
            // Solo se accede a la zona sincronizada
            // cuando la instancia no est� creada
            synchronized(Undo.class) {
                // En la zona sincronizada ser�a necesario volver
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
