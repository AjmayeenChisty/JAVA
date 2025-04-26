package classes;
import java.lang.*;
import interfaces.*;
public class ParkingArea implements ParkingAreaOperations
{
    private String name;
    Car cars[]=new Car[200];
    Bike bikes[]=new Bike[300];
    
     public void setName(String name)
	{
     this.name=name;
    }
     public String getName()
	{
     return this.name;
    }
     public boolean insertCar(Car c)
	{
        for(int i=0;i<cars.length;i++)
		{
             if(cars[i]==null)
			{
             cars[i]=c;
             System.out.println("\n"+c.getCarNum()+" Num Car was successfully Inserted into Parking Area");
             return true;
            }
        }
         System.out.println("\n-------------------------------------");
         System.out.println("  Could not insert");
         System.out.println("-------------------------------------\n");
         return false;
    }

     public boolean removeCar(Car c)
	{
         for(int i=0;i<cars.length;i++)
		{
             if(cars[i]!=null && cars[i].getOwnerName().equals(c.getOwnerName()))
			{
             cars[i]=null;
             System.out.println("\n-------------------------------------------------");
             System.out.println("Owner Name "+c.getOwnerName()+" Car has been Removed");
             System.out.println("-------------------------------------------------\n");
             return true;
            }
        }
         System.out.println("\n-----------------------------------");
         System.out.println("Could not Remove");
         System.out.println("-----------------------------------\n");
         return false;
    }
     public void searchCar(String ownerName)
	{
         boolean flag=true;
         for(int i=0;i<cars.length;i++)
		{
             if(cars[i]!=null )
			{
                 if(ownerName.equals(cars[i].getOwnerName()))
				{
                 System.out.println("\n--Car Found--");
                 cars[i].showDetails();
                 flag=true;
                 break;
                }
                 else
				{
                 flag=false;
                }
            }
        }
         if(flag==false)
		{
         System.out.println("\n------------------");
         System.out.println("Car Was Not Found");
         System.out.println("------------------\n");
        }
    }

     public void showAllCars()
	{
         for (int i=0;i<cars.length;i++)
        {
             if(cars[i]!=null)
			{
             System.out.println("\n");
             cars[i].showDetails();
            }
        }
    }

     public boolean insertBike(Bike b)
	{
         for(int i=0;i<bikes.length;i++)
		{
             if(bikes[i]==null)
			{
             bikes[i]=b;
             System.out.println("\n"+b.getBikeNum()+" Num Bike was successfully Inserted into Parking Area");
             return true;
            }
        }
         System.out.println("\n--------------------------------------");
         System.out.println("  Could not insert");
         System.out.println("--------------------------------------\n");
         return false;
    }
     public boolean removeBike(Bike b)
	{
         for(int i=0;i<bikes.length;i++)
		{
             if(bikes[i]!=null && bikes[i].getOwnerName().equals(b.getOwnerName()))
			{
             bikes[i]=null;
             System.out.println("\n-------------------------------------------------");
             System.out.println("Owner Name "+b.getOwnerName()+" Bike has been Removed");
             System.out.println("-------------------------------------------------\n");
             return true;
            }
        }
         System.out.println("\n------------------------------------");
         System.out.println("Could Not Remove");
         System.out.println("------------------------------------\n");
         return false;
    }
     public void searchBike(String ownerName)
	{
         boolean flag=true;
         for(int i=0;i<bikes.length;i++)
		{
             if(bikes[i]!=null )
			{
                 if(ownerName.equals(bikes[i].getOwnerName()))
				{
                 System.out.println("\n--Bike Found--");
                 bikes[i].showDetails();
                 flag=true;
                 break;
                }
                 else
				{
                 flag=false;
                }
            }
        }
         if(flag==false)
		{
         System.out.println("\n-------------------");
         System.out.println("Bike Was Not found");
         System.out.println("-------------------\n");
        }
    }

     public void showAllBikes()
	{
         for (int i=0;i<bikes.length;i++)
		{
             if(bikes[i]!=null)
            {
             System.out.println("\n");
             bikes[i].showDetails();
            }
        }
    }
}
