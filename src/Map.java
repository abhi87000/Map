import MapVehicleTypes.CalculateDistance;
import Enum.Vehicle;
import Strategy.Impl.BikeStrategy;
import Strategy.Impl.CarStrategy;
import Strategy.Impl.WalkStrategy;

public class Map {
    DistanceCalculator distanceCalculator;
    Vehicle vehicle;

    Map(Vehicle vehicle)
    {
        distanceCalculator=new DistanceCalculator(vehicle);

    }
    int cal()
    {
        return distanceCalculator.cal();
    }
}
