package n3_main;
/* The Command for turning off the device - ConcreteCommand #1 */
public class RunMotorCommand implements Command
{
    private IMotorable _motorable;

    public RunMotorCommand(IMotorable motorable)
    {
        _motorable = motorable;
    }

    public void Execute()
    {
        _motorable.run();
    }
}
