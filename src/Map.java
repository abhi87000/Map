import MapVehicleTypes.CalculateDistance;
import Enum.Vehicle;
import MapVehicleTypes.Default;
import Strategy.Impl.BikeStrategy;
import Strategy.Impl.CarStrategy;
import Strategy.Impl.DefaultStrategy;
import Strategy.Impl.WalkStrategy;
import Enum.VehicleConstant;

public class Map {
    DistanceCalculator distanceCalculator;
    Map(String vehicle)
    {
        setDistanceCalculator(vehicle);
    }

    private void setDistanceCalculator(String vehicle) {
        if(VehicleConstant.isPresent(vehicle)) {
            distanceCalculator = new DistanceCalculator(VehicleConstant.vehicleConstant.get(vehicle.toString()));
        }
        else
        {
            distanceCalculator=new DistanceCalculator(new Default());
        }
    }
    int cal()
    {
        return distanceCalculator.cal();
    }

}
