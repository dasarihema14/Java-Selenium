package Day3;

public class ex {
	private int Salary;
	
	public void setSalary(int s) {
		
		if(s>2000) {
			Salary=s;
		}else {
			System.out.println("Not Credited");
		}
	}
	public int getSalary() {
		return Salary;	
	}

}
