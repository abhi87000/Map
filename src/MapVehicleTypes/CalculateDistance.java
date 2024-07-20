package MapVehicleTypes;

import Strategy.CalStrategy;
import Enum.Vehicle;

public class CalculateDistance {
    CalStrategy calStrategy;

    public CalculateDistance(CalStrategy calStrategy)
    {
        this.calStrategy = calStrategy;
    }

    public int cal()
    {

        return calStrategy.cal();
    }
}
