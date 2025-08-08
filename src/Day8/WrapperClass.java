package Day8;

public class WrapperClass {
	
	public static void main(String[] args) {
		String age = "23";
		String Marks="30.6";
		
		int ageIn = Integer.parseInt(age);
		if(ageIn > 18) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
		double Mar=Double.parseDouble(Marks);
		if(Mar < 50 && Mar >30) {
			System.out.println("Print MArks: " + Marks);
		}else {
			System.out.println("Not Valid");
		}
	}

}
