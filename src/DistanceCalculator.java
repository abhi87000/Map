import MapVehicleTypes.CalculateDistance;
import MapVehicleTypes.CalculateDistanceInterface;
import Strategy.Impl.BikeStrategy;
import Strategy.Impl.CarStrategy;
import Strategy.Impl.WalkStrategy;
import Enum.Vehicle;

public class DistanceCalculator {
    CalculateDistanceInterface calculateDistance;

    public DistanceCalculator(CalculateDistanceInterface calculateDistance) {
        this.calculateDistance=calculateDistance;
    }

    public int cal() {
        return calculateDistance.cal();
    }
}
