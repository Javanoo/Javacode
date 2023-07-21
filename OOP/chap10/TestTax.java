public class TestTax{
	public static void main(String[] args){
		double[][] tax =  new double[4][10];
		Tax _2001 =  new Tax();
		//for 2009
		int[][] _09 = new int[][]{{8_350, 33_950, 82_250, 171_550, 372_950},
								{16_700, 67_900, 137_050, 208_850, 372_950},
								{8_350, 33_950, 68_525, 104_425, 186_475},
								{11_950, 45_500, 117_450, 190_200, 372_950}};
		double[] _09rate =  new double[]{0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		Tax _2009 = new Tax(0, _09, _09rate, 0.0);
		//display calculated taxes
		displayTaxTable(_2001, "2001");
		displayTaxTable(_2009, "2009");
	}
	
	public static void displayTaxTable(Tax obj, String year){
		//table title
		 System.out.println("\nTax table for " + year);
		  System.out.println("-----------------------------------------------" +
		 	"----------------------------------------------------------------" +
		 	"-------------");
		 //Table headers 
		 System.out.printf("%s %-10d %-10d %-10d %-10d %-10d %-10d %-10d" + 
		 " %-10d %-10d %-10d %-10d %s", "Filer", 50_000, 51_000, 52_000, 53_000,
		 54_000, 55_000, 56_000, 57_000, 58_000, 59_000, 60_000,"\n\n");
		 //contents
		 for (int i = 0; i < 4; i++){
		 	obj.setFilingStatus(i);
		 	System.out.print(i + "     ");
		 	for(obj.setTaxableIncome(50_000); obj.getTaxableIncome() <= 60_000;
		 		obj.setTaxableIncome((obj.getTaxableIncome()) + 1_000)){
		 			System.out.printf("%-10.2f ", obj.getTax());
		 	}
		 	System.out.println("");
		 }
		 System.out.println("-----------------------------------------------" +
		 	"----------------------------------------------------------------"+
		 	"-------------");
	}
}

class Tax {
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER_ = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;
	private int[][] brackets = new int[4][];
	private double[] rates = new double[6];
	private double taxableIncome = 0.0;
	private int filingStatus = 0;
	
	Tax(){
		//defaults are from 2001 
		brackets = new int[][] {{27_050, 65_550, 136_750, 297_350}, //single
					    {45_200, 109_250, 166_500, 297_350}, //married joint
					    {22_600, 54_625, 83_250, 148_675}, //married separately
					    {36_250, 93_650, 151_650, 297_350}}; //household head
		rates = new double[] {0.15, 0.275, 0.305, 0.355, 0.391};
		taxableIncome = 0.0;
		filingStatus = SINGLE_FILER;
	}
	
	Tax(int status, int[][] brackets, double[] rates, double taxableIncome){
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
		this.filingStatus = status; 
	}
	//muttator
	public void setBrackets(int[][] brackets){
		this.brackets = brackets;
	}
	public void setRates(double[] rates){
		this.rates = rates;
	}
	public void setTaxableIncome(double income){
		taxableIncome = income;
	}
	public void setFilingStatus(int status){
		filingStatus = status;
	}
	//getter
	public int[][] getBrackets(){
		return brackets;
	}
	public double[] getRates(){
		return rates;
	}
	public double getTaxableIncome(){
		return taxableIncome;
	}
	public int getFilingStatus(){
		return filingStatus;
	}
	//calculate tax according to the filing status
	public double getTax(){
		double tax = 0.0;
		int j =  this.getFilingStatus();
		switch((this.getRates()).length - 1){
			case 4:{
				if(this.getTaxableIncome() <= brackets[j][0])
					tax = this.getTaxableIncome() * rates[0];
				else if(this.getTaxableIncome() <= brackets[j][1])
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1];
				else if(this.getTaxableIncome() <= brackets[0][2]) 			
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2];
				else if(this.getTaxableIncome() <= brackets[j][3])
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2] +
					(brackets[j][3] - brackets[j][2]) * rates[3];
				else
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2] +
					(brackets[j][3] - brackets[j][2]) * rates[3] +
					(this.getTaxableIncome() - brackets[j][3]) * rates[4];
					break;
			}
			case 5:{
				if(this.getTaxableIncome() <= brackets[j][0])
					tax = this.getTaxableIncome() * rates[0];
				else if(this.getTaxableIncome() <= brackets[j][1])
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1];
				else if(this.getTaxableIncome() <= brackets[0][2]) 			
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2];
				else if(this.getTaxableIncome() <= brackets[j][3])
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2] +
					(brackets[j][3] - brackets[j][2]) * rates[3];
				else if(this.getTaxableIncome() <= brackets[j][3] )
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2] +
					(brackets[j][3] - brackets[j][2]) * rates[3] +
					(brackets[j][4] - brackets[j][3]) * rates[4];
				else
					tax = brackets[j][0] * rates[0] + 
					(brackets[j][1] - brackets[j][0]) * rates[1] + 
					(brackets[j][2] - brackets[j][1]) * rates[2] +
					(brackets[j][3] - brackets[j][2]) * rates[3] +
					(brackets[j][4] - brackets[j][3]) * rates[4] + 
					(this.getTaxableIncome() - brackets[j][4]) * rates[5];
					break;
			}
			default : tax = 0.0;
		}    
		return tax;
	}
}
