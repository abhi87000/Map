import MapVehicleTypes.CalculateDistance;
import Strategy.Impl.BikeStrategy;
import Strategy.Impl.CarStrategy;
import Strategy.Impl.WalkStrategy;
import Enum.Vehicle;

public class DistanceCalculator {
    CalculateDistance calculateDistance;

    public DistanceCalculator(Vehicle vehicle) {
        if(vehicle== Vehicle.CAR)
            this.calculateDistance=new CalculateDistance(new CarStrategy());
        else if(vehicle== Vehicle.BIKE)
            this.calculateDistance=new CalculateDistance(new BikeStrategy());
        else if(vehicle== Vehicle.WALK)
            this.calculateDistance=new CalculateDistance(new WalkStrategy());
        else this.calculateDistance=new CalculateDistance(new WalkStrategy());
    }

    public int cal() {
        return calculateDistance.cal();
    }
}
