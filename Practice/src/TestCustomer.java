import java.io.*;
import java.util.*;

public class TestCustomer {
	public static void main(String[] args) throws IOException {
		TestCustomer t = new TestCustomer();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Add customer feedback \n 2. View customer Feedback \n 3. Quite");
		int condition=sc.nextInt();
		if(condition==1) {
			addFeedback();
		}
		else if(condition==2) {
			viewFeedback();
		}
		else {
			System.out.println("Thank you!!!");
		}
		sc.close();
	}
	
	public static  Customer addFeedback() throws IOException {
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Enter the Customer name :");
			String name=sc.next();
			System.out.println("Enter the Customer Mobile Number :");
			String mobileNo=sc.next();
			System.out.println("Enter the Customer Rating :");
			Double feedbackRating=sc.nextDouble();
			sc.close();
			if(feedbackRating > 0 && feedbackRating < 6)
			{
				System.out.println("successfully added");	
			}
			else
			{
				System.out.println("Rating must be below 6");
			}
			System.out.println("Do you want to continue : y / n ");
			String s = br.readLine();
			if(s.startsWith("y"))
			{
				continue;
			}
			else if(s.startsWith("n")) {
				System.out.println("Thanks for your Feedback Rating!!!");
				break;
			}			
		}while(true);
		return customer;
		}
	
	public static void viewFeedback()
	{
		 ArrayList<Customer> t1=new ArrayList<Customer>();
	        for(Customer i:t1)
	        {
	            if(i.getName().equals(t1))
	            t1.add(i);
	        }
	        return;
//		ArrayList <Customer> al = new ArrayList<Customer>();
//		al.add(customer);
//		Iterator<Customer> itr = al.iterator();
//		while(itr.hasNext()) {
//			System.out.println("Name : " + TestCustomer.getName()); 
//			System.out.println("Number : " + customer.getMobileNo());
//			System.out.println("Rating : " + customer.getFeedbackRating()); 
//		}
	}
}