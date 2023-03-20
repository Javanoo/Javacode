/*This program, attempts to address the question that follows:
*****************************************************************************************
*(Population projection) The U.S. Census Bureau projects population based on the
*following assumptions:
*■ One birth every 7 seconds
*■ One death every 13 seconds
*■ One new immigrant every 45 seconds
*Write a program to display the population for each of the next five years. Assume the
*current population is 312,032,486 and one year has 365 days.
*****************************************************************************************
*/

//The program 
//fomula for the problem
//There 86400 seconds within a day, that means about 12342.9 births and about 6646.2 
// deaths with about 1920 immigrants per day.

public class Population{
	public static void main(String [] args){
		int totalBirths = 12343 * (365 * 5), totalDeaths = 6646 * (365 * 5), totalImmigrants = 1920 * (365 * 5);
		int totalPopulation = 312_032_486 + totalBirths + totalImmigrants - totalDeaths;
		System.out.println("The total Population after five years would be: " + totalPopulation);
	}
}
