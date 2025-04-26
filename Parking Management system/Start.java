import java.lang.*;
import java.io.FileWriter;
import java.util.Scanner;
import interfaces.*;
import classes.*;
import fileio.*;


public class Start
{
    public static void main(String[]args)
    {
     Scanner input = new Scanner(System.in);
    
     String user,pass;
    
     System.out.println("Enter your user name please : ");
     user = input.next();
     System.out.println("Enter your password please : ");
     pass = input .next();
   
     if(user.equals("Admin") && user.equals("Admin"))
   {
     System.out.println("Your login is successfully.");
   }
     else
   {
     System.out.println("Sorry! Your password is incorrect. ");
   }
  
    {
        try
        {   
         FileWriter IM = new FileWriter("ParkingHistory.txt");
         Scanner sc = new Scanner(System.in);
         Scanner sc1= new Scanner(System.in);
		 FileReadWriteDemo frwd = new FileReadWriteDemo();
         ParkingArea p = new ParkingArea();

            
         System.out.println("\n\t\t************************************************");
         p.setName("\t\t    PARKING SYSTEM ACTIVATED ");
         System.out.println(p.getName());
	     System.out.println("\t\t************************************************");
          
            boolean repeat = true;

             while (repeat)
			{
             System.out.println("\nMain Menu :");
             System.out.println("____________\n");
             System.out.println("1. Bike - Press 1 For Bike");
             System.out.println("2. Car - Press 2 For Car");
             System.out.println("3. Show All Entries (Bikes & Cars) - Press 3 To Show All");
             System.out.println("4. Exit - Press 4 To Exit");
             System.out.print("\nEnter Your Choice: ");

              int choice = sc.nextInt();

              switch (choice)
			{
              case 1:

             System.out.println("\n\n1. Do you want to Insert a Bike? - press 1");
             System.out.println("2. Do you want to Search a Bike? - press 2");
             System.out.println("3. Do you want to Remove a Bike? - press 3");
             System.out.println("4. Do you want to Print All The Inserted Bikes? - press 4");
             System.out.println("5. Do you want to Go to Main Menu? - Press 5");
             System.out.print("\nEnter Your Choice: ");

             int option1 = sc.nextInt();

                  switch (option1)
			   {
                case 1:

                    Bike bi = new Bike();
                    System.out.print("\nSet Bike Number: ");
                    bi.setBikeNum(sc1.nextLine());
                    System.out.print("Set Owner Name: ");
                    bi.setOwnerName(sc1.nextLine());
                    System.out.print("Set Owner Contact Number: ");
                    bi.setOwnerContactNum(sc1.nextLine());
                    System.out.print("Set Parking Date: ");
                    bi.setDate(sc1.nextLine());
                    System.out.print("Set Parking Time: ");
                    bi.setTime(sc1.nextLine());
                    p.insertBike(bi);
                    IM.write("Bike Num : "+bi.getBikeNum()+" Insert\n");
                    IM.flush();                    
                    break;

                case 2:

                    System.out.print("\nType Bike Owner's Name: ");
                    p.searchBike(sc1.nextLine());
                    break;

                case 3:

                    p.showAllBikes();
                    System.out.print("\nType Bike's Owner Name Which You Want to Remove: ");
                    Bike searched = new Bike();
                    searched.setOwnerName(sc1.nextLine());
                    p.removeBike(searched);
                    break;

                case 4:

                    p.showAllBikes();
                    break;

                case 5:

                    System.out.println("\n----------");
                    System.out.println("Going Back");
                    System.out.println("----------");
                    break;

                default:

                    System.out.println("\n--------------");
                    System.out.println("Invalid Option");
                    System.out.println("--------------");
                    break;
                }
                break;

            case 2:

                System.out.println("\n\n1. Do you want to Insert a Car? - press 1");
                System.out.println("2. Do you want to Search a Car? - press 2");
                System.out.println("3. Do you want to Remove a Car? - press 3");
                System.out.println("4. Do you want to Print All The Inserted Cars? - press 4");
                System.out.println("5. Do you want to Go to Main Menu? - Press 5");
                System.out.print("\nEnter Your Choice: ");

                int option2 = sc.nextInt();
                switch (option2)
				{
                case 1:

                  Car ca = new Car();
                  System.out.print("\nSet Car Number: ");
                  ca.setCarNum(sc1.nextLine());
                  System.out.print("Set Owner Name: ");
                  ca.setOwnerName(sc1.nextLine());
                  System.out.print("Set Owner Contact Number: ");
                  ca.setOwnerContactNum(sc1.nextLine());
                  System.out.print("Set Parking Date: ");
                  ca.setDate(sc1.nextLine());
                  System.out.print("Set Parking Time: ");
                  ca.setTime(sc1.nextLine());
                  p.insertCar(ca);
                  IM.write("Car Num : "+ca.getCarNum()+" Insert\n");
                  IM.flush();
                  break;

                case 2:

                  System.out.print("\nType Car Owner Name: ");
                  p.searchCar(sc1.nextLine());
                  break;

                case 3:

                  p.showAllCars();
                  System.out.print("\nType Car's Name Which You Want to Remove: ");
                  Car searched = new Car();
                  searched.setOwnerName(sc1.nextLine());
                  p.removeCar(searched);
                  break;

                case 4:

                  p.showAllCars();
                  break;

                case 5:

                  System.out.println("\n----------");
                  System.out.println("Going Back");
                  System.out.println("----------");
                  break;

                default:

                  System.out.println("\n--------------");
                  System.out.println("Invalid Option");
                  System.out.println("--------------");
                  break;
                }

              break;

            case 3:

             p.showAllBikes();
             p.showAllCars();
             break;

            case 4:

             System.out.println("\n----------------------");
             System.out.println("Program Closed");
             System.out.println("----------------------");
             IM.close();
             repeat = false;
             break;

             default:

             System.out.println("\n--------------");
             System.out.println("Invalid Choice");
             System.out.println("--------------");
             break;
            }
        }
    }
	      catch (Exception e)
	    {
          System.out.println("\n\nWrong Input");
      }
  }
}
}