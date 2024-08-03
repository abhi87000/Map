package MapVehicleTypes;

import Strategy.Impl.BikeStrategy;

public class Bike extends CalculateDistance {

    public Bike(){
        super(new BikeStrategy());
    }

}
