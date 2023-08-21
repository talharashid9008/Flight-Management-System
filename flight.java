import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class flight {
	private String origin;
	private String destination;
	private String planeType;
	private double ticketPrice;
	private int flightNo;
	private int capacity ;
	DateAndTime date ;

	flight() {
		
	}

	flight(String orig, String dest, String planeT, double price, DateAndTime d) {
		origin = orig;
		destination = dest;
		planeType = planeT;
		ticketPrice = price;
		date = d;

	}

//*****setters********//
	public void setCapacity(int i)
	{
		capacity=i ;
	}
	public void setOrigin(String o) {
		origin = o;
	}

	public void setDestination(String d) {
		destination = d;
	}

	public void setPlaneType(String p) {
		planeType = p;
	}

	public void setTicketPrice(double p) {
		ticketPrice = p;
	}
	public void setFlightNO(int fl) {
		flightNo = fl;
	}
	public void setDateTime(DateAndTime d)
	{
		date = d ;
	}

//*****getters*********//

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public String getPlaneType() {
		return planeType;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public DateAndTime getDate() {
		return date;
	}
	public int getFlightNo()
	{
		return flightNo ;
	}
	//**********************
	public void saveInfo() throws IOException
	{
		int i , temp  , count=0 ;
		String st , st1 ;
		Double db ;
		flight f1 = new flight() ;
		boolean found = false ;
		//***************************
		File file = new File("flights.txt");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    st = br.readLine();//					flight number
    	i=Integer.parseInt(st);
    	System.out.println(i);
    	f1.setFlightNO(i);
	        do{
	   
	        	st = br.readLine();//					origin
	        	f1.setOrigin(st);
	        	System.out.println(st);
	        	
	        	st = br.readLine();//					destination
	        	f1.setDestination(st);
	        	System.out.println(st);
	        	
	        	st = br.readLine();//					plane type
	        	f1.setPlaneType(st);
	        	System.out.println(st);
	        	
	        	st = br.readLine();//					ticket price
	        	db = Double.parseDouble(st);
		        f1.setTicketPrice(db);
		        System.out.println(db);
		        
	        	st = br.readLine();//					capacity	
	        	i=Integer.parseInt(st);
	        	f1.setCapacity(i);
	        	System.out.println(st);
	        	
	        	st = br.readLine();//
	        	if( flightNo==f1.getFlightNo() && origin.equals(f1.getOrigin()) && (  destination.equals(f1.getDestination()) )&&  (  ticketPrice == f1.getTicketPrice() )  && (  planeType.equals(f1.getPlaneType()) )  )
		          {
		        	  System.out.println("Same Flight Found With Flight Number : " + f1.getOrigin());
		        	  found=true ;
		        	  break ;
		          }
	        	else
	        	{
	        		st = br.readLine();//					flight number
	        		if(st!=null)
	        		{
	        			i=Integer.parseInt(st);
	        			f1.setFlightNO(i);
	        			System.out.println(st+"sp");
	        		}
	        		else
	        			break ;
	        		
	        	}
	        }while (  true );
		//*************
		br.close();      
		//****************************
          if(found==false)
          {
			FileWriter fw = new FileWriter("flights.txt",true);
			Scanner sc = new Scanner(System.in) ;
	             fw.write(flightNo+"\n");
	             fw.write(origin + "\n");
	             fw.write(destination + "\n");
	             fw.write(planeType + "\n");
	             fw.write(ticketPrice + "\n");
	             fw.write(capacity + "\n\n");
	             date.saveDate(flightNo);
	             fw.close() ;
          }
	}
	
}