package selenium_course;

public class TemperatureScale {
   public static void main(String[] args) {
	
	   double temp = 60.5;
	   
	   double temp_F = (1.8 * temp) + 32;
	   
	   double temp_K = temp + 273;
	   
	   System.out.println("Temperature in celsius is:" +temp);
	  
	   System.out.println(temp + " Celsius = " + temp_F + " Fahrenheit" );
	   
	   System.out.println(temp +" Celsius = "+ temp_K + " Kelvin");
	   
}
}
