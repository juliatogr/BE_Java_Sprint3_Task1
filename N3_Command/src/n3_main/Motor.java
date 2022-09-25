package n3_main;

/* The Invoker class */
public class Motor
{
    Command runCommand;
    Command stopCommand;
    Command startCommand;

    public Motor(IMotorable v)
    {
        this.runCommand = new RunMotorCommand(v);
        this.stopCommand = new StopMotorCommand(v);
        this.startCommand = new StartMotorCommand(v);
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
    
    public void start()
    {
        this.startCommand.Execute();
    }
}