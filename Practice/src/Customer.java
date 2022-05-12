import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Customer { 
	public static void main(String[] args) throws IOException {
		customerInfo();
	}
	
	private static String name;
	private static String mobileNo;
	private static double feedbackRating;

	
	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Customer.name = name;
	}

	public static String getMobileNo() {
		return mobileNo;
	}

	public static void setMobileNo(String mobileNo) {
		Customer.mobileNo = mobileNo;
	}

	public static double getFeedbackRating() {
		return feedbackRating;
	}

	public static void setFeedbackRating(double feedbackRating) {
		Customer.feedbackRating = feedbackRating;
	}
	
	public void customerInfo() throws IOException {
		Scanner sc = new Scanner(System.in);
		Customer customer1 = new Customer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.println("Enter the Customer name :");
			String name=sc.next();
			
			System.out.println("Enter the Customer Mobile Number :");
			String mobileNo=sc.next();
			
			System.out.println("Enter the Customer Rating :");
			Double feedbackRating=sc.nextDouble();
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
			Customer.setName(name);
			Customer.setMobileNo(mobileNo);
			Customer.setFeedbackRating(feedbackRating);
			
			ArrayList<Customer> al = new ArrayList<Customer>();
			al.add(customer1);
			if(s.startsWith("n"))
			{
				System.out.println("Thanks for your Feedback Rating!!!");
				break;
			}			
		}while(true);
		
		System.out.println("1. to see customer feedback \n 2.to quit!");
		int condition=sc.nextInt();
		if(condition==1) {
		Iterator<Customer> itr=al.iterator();
		while(itr.hasNext()) {
//			Object obj=itr.next();
			Customer cu= (Customer)itr.next();
			System.out.print("name :"+Customer.getName());
			System.out.print("  mobile Number :"+Customer.getMobileNo());
			System.out.print("  feedback rating :"+Customer.getFeedbackRating());
			System.out.println();
		}
		}
		else if(condition==2) {
			
		}
		else {
			System.out.println("enter valid number!");
		}
		
		sc.close();
	}
	
}
