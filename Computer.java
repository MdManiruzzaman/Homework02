package homework2;


public class Computer {
	public String brandName;
	public String operatingSystem;
	public int price;
	public boolean madeInUsa;
	public static int reviewPoint;
	
	public Computer() {// Default constructor
		System.out.println("This is my computer");
	}
	
	public Computer (String brandName) {
		this.brandName = brandName;
		System.out.println("Computer Brand is: "+ brandName);
	}
	
	public Computer (String brandName, String operatingSystem, int price) {
		this.brandName = brandName;
		this.operatingSystem = operatingSystem;
		this.price = price;
		
		System.out.println("This computer details are" + brandName + " " + operatingSystem+ " " +price);
		System.out.println("Computer Brand is: "+ brandName);
	}
	
	public void setReviewPoint(int reviewPoint) {
		Computer.reviewPoint = reviewPoint;
	}
	
	public int getReviewPoint() {
		return reviewPoint;
	}
}

