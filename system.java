import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class system {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//data types to be used
		flight f1 ;
		DateAndTime date ;
		Scanner sc = new Scanner(System.in) ;
		int choice , i=0 ;
		String text , text1;
		String st1 , st2 , st3 , st4 ;
		double temp ;
		boolean pass = false , enter = false ;
            do
            {
	            System.out.println("PLease Enter Your Choice:");
	            System.out.println("1-Administrator");
	            System.out.println("2-Passanger");
	            choice=sc.nextInt() ;
            }while(choice<1 || choice>2) ;
            
            if(choice==1)														//administrator
            {
	            do
	            {
	            	do
	            	{
		            	System.out.println("Please Enter :");
		            	System.out.println("1- To Add A New Flight Details");
		            	System.out.println("0- To Exit");
		            	choice=sc.nextInt() ;
	                }while(choice<0 || choice>2) ;
	            	if(choice==1)
	            	{
	            		//validate dmin
	            		sc = new Scanner(System.in) ;
	            		System.out.println("PLease Enter User name :");
	            		text=sc.nextLine() ;
	            		System.out.println("PLease Enter Password :");
	            		text1=sc.nextLine() ;
	            		//*************
	            		File file = new File("Admin.txt");
	            	    BufferedReader br = new BufferedReader(new FileReader(file));
	            	        
	            	        do{
	            	        	st1 = br.readLine();
	            	        	st2 = br.readLine() ;
	            	        	if( st1.equals(text) && st2.equals(text1))
	            	        	{
	            	        		System.out.println("Logged into the System Successfully!!!");
	            	        		pass=true ;
	            	        	}
	            	        }while (  st1.equals(null) || st2.equals(null));
	            		//*************
	            		
	            		
	            		
	            		if(pass==true)
	            		{
		            	   f1 = new flight() ;
		            	   //FileWriter fw = new FileWriter("flights.txt",true);
		            	   sc = new Scanner(System.in) ;
		            	   
		            	   System.out.println("Please Enter :") ;
		            	   
		                        System.out.println("Flight Number :");
		                        i=sc.nextInt() ;
		                        f1.setFlightNO(i);
		                        sc = new Scanner(System.in) ;
		                        
		                        System.out.println("Origin :");
		                        text=sc.nextLine() ;
		                        f1.setOrigin(text);
		                        text="" ;
		                        sc = new Scanner(System.in) ;
		                        
		                        System.out.println("Destination :");
		                        text=sc.nextLine() ;
		                        f1.setDestination(text);
		                        sc = new Scanner(System.in) ;
		                        
		                        System.out.println("Ticket Price :");
		                        temp=sc.nextDouble() ;
		                        f1.setTicketPrice(temp);
		                        sc = new Scanner(System.in) ;
		                        
		                        System.out.println("Plane Type :");
		                        text=sc.nextLine() ;
		                        f1.setPlaneType(text);
		                        sc = new Scanner(System.in) ;
		                        
		                        System.out.println("Capacity :");
		                        i=sc.nextInt() ;
		                        f1.setCapacity(i);
		                        
		                        //*************************
		                        //getting date and time
			                        date = new DateAndTime() ;
			                        do//**************************************************date
			                        {
				                        System.out.println("Day :");
				                        i=sc.nextInt() ;
			                        }while(i<1 || i>31) ;
			                        date.setDay(i) ;
			                        
			                        do {
			                        System.out.println("Month :");
			                        text=sc.next() ;
			                        }while( !( text.equals("January") || text.equals("February") || text.equals("March") ||  text.equals("April") || text.equals("May") || text.equals("June") || text.equals("July") || text.equals("August") || text.equals("September") || text.equals("November") || text.equals("December") ) ) ;
			                        date.setMonth(text) ;
			                        
			                        
			                        date.setYear(2021);
			                        System.out.println("Time :");//**************************time
			                        do
			                        {
				                        System.out.println("Hour :");
				                        i=sc.nextInt() ;
			                        }while(i<0 || i>23) ;
			                        date.setHour(i);
			                        
			                        do
			                        {
				                        System.out.println("Min :");
				                        i=sc.nextInt() ;
			                        }while(i<0 || i>59) ;
			                        date.setMinute(i);
			                        
			                        
			                        do
			                        {
				                        System.out.println("Sec :");
				                        i=sc.nextInt() ;
			                        }while(i<0 || i>23) ;
			                        date.setsec(i);
			                        
			                        f1.setDateTime(date);
		                        
		                        //*************************
		                       f1.saveInfo();
		                   //fw.close() ;
	            	}//add new end
	            	
	            }
            }while(choice!=0) ;									//ending administrator
            
        }
        if(choice==2)
        {
        	
        	do
        	{
        		pass=false ;
            	enter = false ;
	        	System.out.println("Welcome to Air ReserVation System :");
	        	System.out.println("Press : ");
	        	System.out.println("1- To Creat Account");
	        	System.out.println("2- To Login");
	        	System.out.println("0- To Exit");
	        	sc = new Scanner(System.in) ;
	        	choice=sc.nextInt();
	        	sc = new Scanner(System.in) ;
		        	switch(choice)
		        	{
		        		case 1 :
		        			System.out.println("Please enter user name : ");
		        			st1=sc.nextLine();
		        			System.out.println("Please enter Password : ");
		        			st2=sc.nextLine();
		        			File file = new File("logins.txt");
		            	    BufferedReader br = new BufferedReader(new FileReader(file));
		            	    st3 = br.readLine();
	            	    	st4 = br.readLine();
		            	    while(true)
		            	    {
		            	    	if(st3==null || st4==null)
		            	    		break ;
		            	    	else if(st3.equals(st1))
		            	    	{
		            	    		System.out.println("Account Already exists!!!");
		            	    		pass=true ;
		            	    			break ;
		            	    	}
		            	    	else
		            	    	{
			            	    	st3 = br.readLine();
			            	    	st4 = br.readLine();
		            	    	}

		            	    }
		            	    br.close();
		            	    if(pass==false)
		            	    {
		            	    	System.out.println("Account opened successfully!!!\n\n");
		            	    	FileWriter fw2 = new FileWriter("logins.txt",true);
		            	        fw2.write(st1+"\n");
		            	        fw2.write(st2+"\n");
		            	        enter=true ;
		            	        fw2.close();
		            	    }
		            	    	break ;
		        		case 2 :
		        			System.out.println("Please enter user name : ");
		        			st1=sc.nextLine();
		        			System.out.println("Please enter Password : ");
		        			st2=sc.nextLine();
		        			File file1 = new File("logins.txt");
		            	    BufferedReader br1 = new BufferedReader(new FileReader(file1));
		            	    st3 = br1.readLine();
	            	    	st4 = br1.readLine();

	            	    	while(st3!=null)
		            	    {
		            	    	if(st3.equals(st1) && st4.equals(st2))
		            	    	{
		            	    			enter = true ;
		            	    			System.out.println("Logged in Successfully!!!\n\n");
		            	    			break ;
		            	    	}
		            	    	st3 = br1.readLine();
		            	    	st4 = br1.readLine();
		            	    }
		        			break ;
		        	}
		        	if(enter)
		        		break ;
        	}while(choice!=0) ;//**********************************************************
        	if(enter==true)
        	{
        			
        		do
        		{
	        		System.out.println("If You want to Check the Schedule Press 1");
	        		System.out.println("If You want to Check the days with less fare press 2");
	        		System.out.println("If You want to Enter information press 3");
	        		System.out.println("If You want to Quiet press  0");
	        		choice=sc.nextInt() ;
		        		switch(choice)
		        		{
		        		case 1 :
		        			File file = new File("flights.txt");
				    	    BufferedReader br = new BufferedReader(new FileReader(file));
				    	    st1 = br.readLine();

				    	    System.out.println("***********************************************");
				        	System.out.println("Flight#" + st1);
				    	    System.out.println("***********************************************");
				    	        do{
				    	   
				    	        	st1 = br.readLine();//					origin
				    	        	System.out.println("Origin : " + st1);
				    	        	
				    	        	st1 = br.readLine();//					destination
				    	        	System.out.println("Destination : " + st1);
				    	        	
				    	        	st1 = br.readLine();//					plane type
				    	        	System.out.println("Plane Type : " + st1);
				    	        	
				    	        	st1 = br.readLine();//					ticket price
				    		        System.out.println("Ticket Price : " + st1);
				    		        
				    	        	st1 = br.readLine();//					capacity	
				    	        	System.out.println("Capacity" + st1);
				    	        	
				    	        	st1 = br.readLine();//
				    	        		st1 = br.readLine();//					flight number
				    	        		if(st1!=null)
				    	        		{

								    	    System.out.println("***********************************************");
				    	        			System.out.println("\n\n\nFlight#" + st1);
								    	    System.out.println("***********************************************");
				    	        		}
				    	        		else
				    	        			break ;
				    	        }while (  true );
				    	        br.close();
				    	        break ;
		        		case 2 :
		        			File file2 = new File("fares.txt");
				    	    BufferedReader br2 = new BufferedReader(new FileReader(file2));
				    	    st1 = br2.readLine();
				    	    System.out.println("***********************************************");
				    	    System.out.println("Following are the days in which Fares are Low: ");
				    	    System.out.println("***********************************************");
				    	    while(st1!=null)
				    	    {
				    	    	System.out.println(st1);
				    	    	st1 = br2.readLine();
				    	    }

				    	    System.out.println("***********************************************");
		        			break ;
		        		}
	        		}while(choice!=0);
	    	        
        	}
        }
	}//main ending

}//class emding
