
public interface ConverterService {
	
	//store the constants to be used
	final double kDegree0 = 273.15;
	final double km = 1.6;
	
	//Create an abstract method ktok that accepts an integer as input
	//	parameter
	public double ktoc(int k);
	
	//Create an abstract metho ctok that takes an argument of 
	//	and returns an integer
	public double ctok(double c);
	
	//create a method that takes an integer and returns double
	public double mtok(int mile);
	
	//create a method tha takes in a  an double as an argument
	//	and return an integer
	public double ktom(double kilometer);
	
	

}
