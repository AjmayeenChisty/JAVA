package classes;
import java.lang.*;
import interfaces.*;

public class Bike extends Parking
{
     private String bikeNum;

     public void setBikeNum(String bikeNum)
	{
     this.bikeNum = bikeNum;
    }
     public String getBikeNum()
	{
     return this.bikeNum;
    }
     public void showDetails()
	{
     System.out.println("-----Bike-----");
     System.out.println("Bike Number : " + this.getBikeNum());
     System.out.println("Bike Owner Name : " + this.getOwnerName());
     System.out.println("Bike Onwer Number : " + this.getOwnerContactNum());
     System.out.println("Parking Date : " + this.getDate());
     System.out.println("Parking Time : " + this.getTime());
     System.out.println("\n");
    }
}
