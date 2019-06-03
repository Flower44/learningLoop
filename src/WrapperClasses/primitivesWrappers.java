package WrapperClasses;

public class primitivesWrappers {
	
	public static void main (String[] args) {
		
		int num=55;
		Integer num2=new Integer(12);
		long    num3=234567;
		Long    num4=new Long(54555);
		
		int num5=num2;//Integer to int -> Unboxinng
		Integer num6=num5;//int to Integer -> Autoboxing
		
		String number="123";
		Integer number1= Integer.valueOf(number);// converting String to Integer
		int number2=Integer.parseInt(number); //converting String to int 
		
		Double number3=Double.valueOf(number);
		double number4=Double.parseDouble(number);
		
		
	}

}
