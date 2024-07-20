package MapVehicleTypes;

import Strategy.Impl.CarStrategy;

public class Car extends CalculateDistance {
    public Car() {
        super(new CarStrategy());
    }
}
