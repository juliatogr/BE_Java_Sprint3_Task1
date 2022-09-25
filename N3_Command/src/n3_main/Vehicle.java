package n3_main;
/* The Receiver class */
public class Vehicle implements IMotorable
{
	private double speed = 0;
	private boolean isStarted = false;
	
    public void run()
    {
    	if (!isStarted) {
    		System.out.println("The vehicle hasn't started up yet");
    	} else {
    		speed += 10;
    		System.out.println("The vehicle is running at speed " + speed + "km/h");
    	}
    }

    public void stop()
    {
    	if (!isStarted) {
    		System.out.println("The vehicle hasn't started up yet");
    	}
    	else if (speed == 0) {
    		System.out.println("The vehicle is stopped");
    	} else {
    		speed = 0;
    		System.out.println("The vehicle has stopped");
    	}
    }
    
    public void start()
    {
    	if (speed == 0 && !isStarted) {
    		isStarted = true;
    		System.out.println("The vehicle has started up");
    	} else {
    		System.out.println("The vehicle has yet started");
    	}
    }
}
