package Day6;

class TicketBookingSystem
{
	int availableSeats=1;
public synchronized void bookTicket(String name)
{
	if(availableSeats>0)
	{
		System.out.println(name + " is booking ticket...");
		try {
			Thread.sleep(1000);
		    }
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	System.out.println(name +" successfully booked the ticket!");
	availableSeats--;
	}
	else
	{
	System.out.println(" sorry "+ name +" , seat already booked!");
 
	}
	}
	}
class User extends Thread
{
	TicketBookingSystem booking;
	String userName;
	public User (TicketBookingSystem booking, String userName)
	{
		this.booking=booking;
		this.userName=userName;
	}
	public void run()
	{
		booking.bookTicket(userName);
	}
}
 
public class TicketBooking {
 
	public static void main(String[] args) throws InterruptedException
	{
		TicketBookingSystem booking=new TicketBookingSystem();
		
		User user1=new User(booking,"Renu");
		User user2=new User(booking,"Sai");
		User user3=new User(booking,"Mahasa");
        user1.start();
        user1.join();
        
        user2.start();
        user2.join();
        
        user3.start();
        user3.join();
	}
 
}
