package n3_main;

/* The Command for turning on the device - ConcreteCommand #2 */
public class StopMotorCommand implements Command
{
    private IMotorable _motorable;

    public StopMotorCommand(IMotorable switchable)
    {
        _motorable = switchable;
    }

    public void Execute()
    {
        _motorable.stop();
    }
}