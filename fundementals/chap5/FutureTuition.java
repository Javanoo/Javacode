//This program tries to answer the question that follows.
/*(Financial application: compute future tuition) Suppose that the tuition for a
* university is $10,000 this year and increases 5% every year. In one year, the 
* tuition will be $10,500. Write a program that computes the tuition in ten years
* and the total cost of four years’ worth of tuition after the tenth year.
*/
//code
import java.util.Scanner;

public class FutureTuition{
	public static void main(String[] args){
		final int timePeriod = 10;
		final double rate = 0.05;
		int year = 1;
		double increment = 0;
		double tuition = 10_000;
		double initialTuition = tuition;
		while(year <= 2){
			increment += tuition * rate;
			tuition += increment;
			year++;
		}
		System.out.println("After ten years the $" + initialTuition + " will be raised to $"  +  ((int)(tuition * 100)/100.0));
	}
}
