public class FooCorporation{
	public static void main (String[] args){
		CalculatePay(35,(float)7.50);
		CalculatePay(47,(float)8.20);
		CalculatePay(73,(float)10.00);
	}

	public static void CalculatePay(int hours, float wage){
		// check for error conditions
		// 1) hours must not be greater than 60
		// 2) wage must not be less than $8.00 an hour
	
		if(wage < 8.00){
			System.out.println("Employee's hourly wage of $" + wage + " is less than state minimum of $8.00/hour");
			return;
		}
		if(hours > 60){
			System.out.println("Employee hours (" + hours + ") exceed 60 hour per week maxiumum");
			return;
		}	

		// compute take home pay
		float pay = 0;

		if(hours > 40){
			pay = pay + ((hours - 40) * wage * (float)1.5);
		}
		pay = pay + (hours * wage);
	
		System.out.println("Employee take home pay is: $" + pay);
	}
}
