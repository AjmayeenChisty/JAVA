package classes;
import java.lang.*;

public abstract class Parking
{
    private String ownerName;
    private String ownerContactNum;
	private String date;
	private String time;

    Parking(){

    }

     public void setOwnerName(String ownerName)
	{
     this.ownerName = ownerName;
    }
     public String getOwnerName()
	{
     return this.ownerName;
    }
     public void setOwnerContactNum(String ownerContactNum)
	{
     this.ownerContactNum = ownerContactNum;
    }
     public String getOwnerContactNum()
	{
     return this.ownerContactNum;
    }
     public void setDate(String date)
	{
     this.date = date;
    }
     public String getDate()
	{
     return this.date;
    }
     public void setTime(String time)
	{
     this.time = time;
    }
     public String getTime()
	{
     return this.time;
    }
     public void setBikeNum(String bikeNum)
	{

    }
     public String getBikeNum()
	{
     return "";
    }
     public void setCarNum(String carNum)
	{

    }
     public String getCarNum()
	{
     return "";
     
    }
    public abstract  void showDetails();

}
