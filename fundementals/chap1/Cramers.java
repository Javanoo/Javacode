//This program attempts to solve a linear equation problem using cramers rule.
//linear equation :
/* 3.4x + 50.2y = 44.5
*  2.1x + .55y = 5.9
*
* cramer's rule
*  ax + by = e
*  cx + dy = f 
* x can be found by :
* (ed - bf) / (ad - bc)
* Y can be found by :
* (af - ec) / (ad - bc)
*/
//implementation
public class Cramers{
	public static void main (String[] args){
		//based on pseudocode above
		double x = ((44.5 * .55) - (5.9 * 50.2)) / ((3.4 * .55) - (50.2 * 2.1));
		double y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1));
		System.out.println("The value of x is " + (int)(x * 100) / 100.0 + " and the value of y is " + (int)(y * 100) / 100.0);
	}
}
