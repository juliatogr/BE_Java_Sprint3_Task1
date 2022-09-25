package n3_main;
/* The Command for turning off the device - ConcreteCommand #1 */
public class RunMotorCommand implements Command
{
    private IMotorable _switchable;

    public RunMotorCommand(IMotorable switchable)
    {
        _switchable = switchable;
    }

    public void Execute()
    {
        _switchable.run();
    }
}
