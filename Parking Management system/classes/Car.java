package classes;
import java.lang.*;
import interfaces.*;

public class Car extends Parking
{
     private String carNum;

     public void setCarNum(String carNum)
	{
     this.carNum = carNum;
    }
     public String getCarNum()
	{
     return this.carNum;
    }
     public void showDetails()
	{
     System.out.println("-----Car-----");
     System.out.println("Car Number : " + this.getCarNum());
     System.out.println("Car Owner Name : " + this.getOwnerName());
     System.out.println("Car Onwer Number : " + this.getOwnerContactNum());
     System.out.println("Parking Date : " + this.getDate());
     System.out.println("Parking Time : " + this.getTime());
     System.out.println("\n");
    }
}
