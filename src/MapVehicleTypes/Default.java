package MapVehicleTypes;

import Strategy.Impl.DefaultStrategy;

public class Default extends CalculateDistance {
    public Default() {
        super(new DefaultStrategy());
    }
}
