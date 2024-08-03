package Enum;

import MapVehicleTypes.Bike;
import MapVehicleTypes.CalculateDistanceInterface;
import MapVehicleTypes.Car;
import MapVehicleTypes.Walk;

import java.util.HashMap;
import java.util.Map;

public class VehicleConstant {
    public static Map<String, CalculateDistanceInterface> vehicleConstant=new HashMap<String,CalculateDistanceInterface>(){{
        put("Car", new Car());
        put("Bike",new Bike());
        put("Walk",new Walk());
    }};

    public static void addVehicleConstant(String key, CalculateDistanceInterface calculateDistance)
    {
        vehicleConstant.put(key, calculateDistance);
    }
    public static Boolean isPresent(String vehicle)
    {
        return vehicleConstant.containsKey(vehicle);
    }
}
