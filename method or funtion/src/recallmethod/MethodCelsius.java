package recallmethod;

public class MethodCelsius { 
	static void getCelsiusFromFahrenheit(double fhn) {
		 System.out.println("Temperature in celsius is: "+((fhn-32)*5)/9);
	
}

	public static void main (String args[])  
    {  
          
          getCelsiusFromFahrenheit(45);
          getCelsiusFromFahrenheit(35.56);
          getCelsiusFromFahrenheit(38.45);
    }
}
 