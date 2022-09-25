package n3_main;

/* The Command for speeding up the vehicle */
public class RunMotorCommand implements Command
{
    private IMotorable motorable;

    public RunMotorCommand(IMotorable motorable)
    {
        this.motorable = motorable;
    }

    public void execute()
    {
    	this.motorable.run();
    }
}
