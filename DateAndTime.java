import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DateAndTime {

	private int day;
	private String month;
	private int year;
	private int min , hour , sec ;
	DateAndTime() 
	{
		day = -1;
		month = "";
		year = -1;
		sec=-1 ;
		min=-1 ;
		hour=-1 ;
	}

	DateAndTime(int d, String m, int y , int hours , int mins , int secc) 
	{
		day = d;
		month = m;
		year = y;
		sec=secc ;
		min=mins ;
		hour=hours ;
	}

//********setters*********//

	public void setDay(int d) {
		day = d;
	}

	public void setMonth(String m) {
		month = m;
	}
	public void setYear(int y) {
		year = y ;
	}
	public void setMinute(int m) {
		min = m;
	}
	public void setHour(int h) {
		hour = h;
	}
	public void setsec(int s) {
		sec = s ;
	}

//*******getters**********//	

	public int getDay() {
		return day;
	}

	public String getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return min;
	}
	public int getSecond() {
		return sec;
	}
	public void displayDateAndTime() {
		System.out.println("Date : " + day + ", " + month + ", " + year);
		System.out.println("Time : " + hour + ", " + min + ", " + sec);
	}
	/*public boolean checkTime(int flno) throws IOException
	{
		DateAndTime t1 = new DateAndTime() ;
		String st ;
		int i = 0 , tem ;
		File file = new File("Calander.txt");
	    BufferedReader br = new BufferedReader(new FileReader(file));
	    st = br.readLine();//flight
    	tem=Integer.parseInt(st);
	    do
	    {
	    	if(st==null)
	    		break ;
		    st = br.readLine();//day
	    	i=Integer.parseInt(st);
	    	t1.setDay(i);
	    	
	    	st = br.readLine();//month
	    	t1.setMonth(st);
	    	
	    	st = br.readLine();//year
	    	i=Integer.parseInt(st);
	    	t1.setYear(i);
	    	
	    	st = br.readLine();//hours
	    	i=Integer.parseInt(st);
	    	t1.setHour(i);
	    	
	    	st = br.readLine();//minutes
	    	i=Integer.parseInt(st);
	    	t1.setMinute(i);
	    	
	    	st = br.readLine();//seconds
	    	i=Integer.parseInt(st);
	    	t1.setsec(i);
	    	//st=br.readLine();
	    	br.readLine();
	    	//System.out.println(i);
	    	if(  (flno==tem) && (day==t1.getDay()) && (  month.equals(t1.getMonth())  ) && ( year == t1.getYear() ) && (  hour==t1.getHour() ) && (  min==t1.getMinute() ) && (  sec==t1.getSecond() )  )
	    	{
	    		System.out.println("date matched" + flno);
	    		br.close();
	    		return true ;
	    	}
	    	else
	    	{
	    		st = br.readLine();//flight
	    		if(st!=null)
	    			tem=Integer.parseInt(st);
	    		else
	    			break ;
	    	}
	    }while(true) ;
	    br.close();
	    return false ;
	}*/
	public void saveDate(int fl) throws IOException
	{
		FileWriter fw = new FileWriter("Calander.txt",true);
		Scanner sc = new Scanner(System.in) ;
             fw.write(fl+"\n");
             fw.write(day + "\n") ;
             fw.write( month + "\n") ;
             fw.write( year + "\n") ;
             fw.write( hour + "\n") ;
             fw.write( min + "\n") ;
             fw.write( sec + "\n\n") ;
        fw.close();
	}
}