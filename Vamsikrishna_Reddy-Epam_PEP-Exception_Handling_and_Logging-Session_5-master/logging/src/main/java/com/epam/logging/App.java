package com.epam.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.logging.CompoundInterest;
import com.epam.logging.HouseConstruction;
import com.epam.logging.SimpleInterest;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
        LOGGER.info( "info" );
        LOGGER.debug( "debug" );
        LOGGER.warn( "warn" );
        LOGGER.error( "error" );
        LOGGER.fatal( "fatal" );
        
        
        //this is the CLIENT LOGGER program
    	
    	//Simple Interest
        SimpleInterest simpleInterest = new SimpleInterest(10000,3,10);
        LOGGER.info("Amount after Simple Interest = " + simpleInterest.getSimpleInterest());
        
        //Compound Interest
        CompoundInterest compoundInterest = new CompoundInterest(10000,3,10,4);
        LOGGER.info("\nAmount after Compound Interest = " + compoundInterest.getCompoundInterest());
        
        //House Construction Program
        int area = 1000;
        
        HouseConstruction house1 = new HouseConstruction(area,"standard");
        LOGGER.info("\n\nTotal house cost for " + house1.getMaterial() +" materials and area " + house1.getArea()+ " sqft = INR " + house1.getEstimatedCost());
        
        HouseConstruction house2 = new HouseConstruction(area,"above standard");
        LOGGER.info("\nTotal house cost for " + house2.getMaterial() +" materials and area " + house2.getArea()+ " sqft = INR " + house2.getEstimatedCost());
        
        HouseConstruction house3 = new HouseConstruction(area,"high standard");
        LOGGER.info("\nTotal house cost for " + house3.getMaterial() +" materials and area " + house3.getArea()+ " sqft = INR " + house3.getEstimatedCost());
        
        HouseConstruction house4 = new HouseConstruction(area,"high standard and automated");
        LOGGER.info("\nTotal house cost for " + house4.getMaterial() +" materials and area " + house4.getArea()+ " sqft = INR " + house4.getEstimatedCost());
        
        
    }
}
