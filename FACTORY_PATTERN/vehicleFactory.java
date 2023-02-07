package FACTORY_PATTERN;

public class vehicleFactory {

    Vehicle createVehicle(String ride) {
        if (ride.toLowerCase().equals("car")) {
            return new car();
        }

        else if (ride.toLowerCase().equals("auto")) 
        {
            return new auto();
        } 
        else if (ride.toLowerCase().equals("bike")) 
        {
            return new bike();
        } 
    
        else 
        {
            return null;
        }
    }

}
