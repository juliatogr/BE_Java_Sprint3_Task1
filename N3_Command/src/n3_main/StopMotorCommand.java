package n3_main;

/* The Command for stopping the vehicle */
public class StopMotorCommand implements Command
{
    private IMotorable motorable;

    public StopMotorCommand(IMotorable motorable)
    {
        this.motorable = motorable;
    }

    public void execute()
    {
        this.motorable.stop();
    }
}