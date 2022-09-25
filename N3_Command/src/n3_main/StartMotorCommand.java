package n3_main;

/* The Command for turning on the device - ConcreteCommand #2 */
public class StartMotorCommand implements Command
{
    private IMotorable _motorable;

    public StartMotorCommand(IMotorable switchable)
    {
        _motorable = switchable;
    }

    public void Execute()
    {
        _motorable.start();
    }
}