package n3_main;

/* The Command for starting up the vehicle */
public class StartMotorCommand implements Command
{
    private IMotorable motorable;

    public StartMotorCommand(IMotorable motorable)
    {
        this.motorable = motorable;
    }

    public void execute()
    {
    	this.motorable.start();
    }
}