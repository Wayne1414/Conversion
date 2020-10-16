import java.io.*;
import java.io.IOException; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

public class ConverterServiceImp implements ConverterService {
	
	
	//create instance variables
	private double celcius;
	private double kelvin;
	double kmCal;
	double mCal;
	private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	LogManager logM = LogManager.getLogManager();        
    Logger logger = logM.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Override
	public double ktoc(int k) {
	

		
		//get the current seconds
		long startTime = System.currentTimeMillis();
		//perform calculation
		celcius = k - 273;
		//get the curent time in seconds
		long finishTime = System.currentTimeMillis();
		//calculate finished time
		long totalTime = startTime - finishTime;

		logger.log(Level.INFO, "Execution Duration"+"\n"+ "start time: " + startTime + "\n"+ "finish time: " +finishTime );

		
		return celcius;
	}

	@Override
	public double ctok(double c) {
		


		//get the current seconds
		long startTime = System.currentTimeMillis();
		//perform calculation
		
		if(c < 0.0) {
			
			kelvin  = c + 273;
			
		}else {
			
			kelvin =  273 - c;
			
		}
		//get the curent time in seconds
		long finishTime = System.currentTimeMillis();
		

		//calculate finished time
		long totalTime = finishTime - startTime;

		logger.log(Level.INFO, "Execution Duration"+"\n"+ "start time: " + startTime + "\n"+ "finish time: " +finishTime );
		
		return kelvin;
	}

	@Override
	public double mtok(int mile) {

		//get the current seconds
		long startTime = System.currentTimeMillis();
		//perform calculation
	    kmCal = mile * km;
		//get the curent time in seconds
		long finishTime = System.currentTimeMillis();
		//calculate finished time
		long totalTime =    finishTime - finishTime;
		
		logger.log(Level.INFO, "Execution Duration"+"\n"+ "start time: " + startTime + "\n"+ "finish time: " +finishTime );

	    return kmCal;
	}

	@Override
	public double ktom(double kilometer) {

		//get the current seconds
		long startTime = System.currentTimeMillis();
		//perform calculation
		mCal = kilometer / km;
		//get the curent time in seconds
		long finishTime = System.currentTimeMillis();
		//calculate finished time
		long totalTime = finishTime - startTime;
		
		logger.log(Level.INFO, "Execution Duration"+"\n"+ "start time: " + startTime + "\n"+ "finish time: " +finishTime +"\n"+"totalTime: " + totalTime);
		
		return mCal;
	}
	
	public static void main(String ...args) {
		
		ConverterServiceImp service = new ConverterServiceImp();
		
		System.out.println("celcius "+service.ktoc(300));//26.85
		
		System.out.println();
		System.out.println("Kelvin " + service.ctok(25.0));//298

		System.out.println();
		System.out.println("km " + service.mtok(50));//50
		
		System.out.println();
		System.out.println("m " + service.ktom(80));//12.4274
		
		
	}

}
