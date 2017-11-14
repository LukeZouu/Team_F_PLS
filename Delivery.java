package Delivery_Component;
import java.io.*; 
import java.text.*; 
import java.util.*;
public abstract class Delivery implements ComponentInterface
{
    private int DeliveryId = 0;
    private String dateformat = "HH:mm dd-MM-yy ";
    public int getID()
    {
        return DeliveryId;
    }
    public void setID(int DelivertId)
    {
        this.DeliveryId=DeliveryId;
    }
    public String getDate()
    {
        return dateformat;
    }
    public void setDate(String dateformat)
    {
        this.dateformat=dateformat;
    }
    public Delivery(int DeliveryId,String dateformate)
    {
        this.DeliveryId=DeliveryId;
        this.dateformat=dateformate;
    }
    public String toString() 
    {    
        return "Deliver [id=" + DeliveryId + ", date=" + dateformat; 
    } 
}
