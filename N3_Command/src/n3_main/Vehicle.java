package n3_main;
/* The Receiver class */
public class Vehicle implements IMotorable
{
    public void run()
    {
        System.out.println("The vehicle is running");
    }

    public void stop()
    {
        System.out.println("The vehicle is stopping");
    }
    
    public void start()
    {
        System.out.println("The vehicle is starting");
    }
}
