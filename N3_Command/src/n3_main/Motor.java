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

    public void run()
    {
       this.runCommand.execute();
    }

    public void stop()
    {
        this.stopCommand.execute();
    }
    
    public void start()
    {
        this.startCommand.execute();
    }
}