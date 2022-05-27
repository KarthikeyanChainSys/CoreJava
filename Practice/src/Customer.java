public class Customer { 
	
	private String name;
	private String mobileNo;
	private  double feedbackRating;
	
	public Customer() {
		System.out.println("Customer created");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public double getFeedbackRating() {
		return feedbackRating;
	}

	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
}