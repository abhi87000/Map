package MapVehicleTypes;

import Strategy.Impl.WalkStrategy;

public class Walk extends CalculateDistance {
    public Walk() {
        super(new WalkStrategy());
    }
}
