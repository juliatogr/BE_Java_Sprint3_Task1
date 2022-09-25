package n3_main;

/* The Invoker class */
public class Motor
{
    Command runCommand;
    Command stopCommand;

    public Motor(Command runCommand, Command stopCommand)
    {
        this.runCommand = runCommand;
        this.stopCommand = stopCommand;
    }

    // Close the circuit / power on
    public void run()
    {
       this.runCommand.Execute();
    }

    // Open the circuit / power off
    public void stop()
    {
        this.stopCommand.Execute();
    }
}