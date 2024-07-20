package MapVehicleTypes;

import Strategy.Impl.BikeStrategy;

public class Bike extends CalculateDistance {

    Bike(){
        super(new BikeStrategy());
    }

}
