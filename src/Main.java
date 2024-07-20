import MapVehicleTypes.Car;
import Enum.Vehicle;
import static java.lang.System.out;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                /*
                Class Diag:- https://miro.com/welcomeonboard/
                VmI5ZEFsYUpLM1ViaWJMMnI1ODQ2aFFoQjRvSEQ3SjN5VDZEU0YzQ2hTMno3N0JzOG1Qd3VzbWppd3JURk9haHwzNDU4NzY0NTkxOTI2ODIzNjQ0fDI=?
                share_link_id=927630941005
                   */

        Map map=new Map(Vehicle.BIKE);
        out.println(map.cal());
    }
}