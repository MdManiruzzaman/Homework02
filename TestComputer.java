package homework2;

public class TestComputer {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.brandName = "Dell";
		c1.operatingSystem = "Windows10";
		c1.price = 1350;
		c1.madeInUsa = true;
		c1.setReviewPoint(9);
		System.out.println(c1.brandName);
		System.out.println("Brand OS and Price are: "+c1.brandName+ " "+ c1.operatingSystem+ " "+ c1.price);
		System.out.println("Customer review of this computer is "+ c1.getReviewPoint());
	}
	
	

}