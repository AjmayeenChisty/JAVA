package interfaces;
import java.lang.*;
import classes.*;
public interface ParkingAreaOperations 
{
    String getName();
    
    boolean insertCar(Car c);
    boolean removeCar(Car c);
    void searchCar(String ownerName);
    void showAllCars();

    boolean insertBike(Bike b);
    boolean removeBike(Bike b);
    void searchBike(String ownerName);
    void showAllBikes();
}
