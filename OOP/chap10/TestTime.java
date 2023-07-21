public class TestTime{
	public static void main(String[] args){
		Time firstObject =  new Time();
		Time secondObject = new Time(555_550_000);
		System.out.println("The time for the first time is " + 
			firstObject.getHour() + ":" + firstObject.getMinute() + ":" + 
			firstObject.getSecond());
		System.out.println("The time for the second time is " + 
			secondObject.getHour() + ":" + secondObject.getMinute() + ":" + 
			secondObject.getSecond());
	}
}

class Time{
	private long hour = 0;
	private long minute = 0;
	private long second = 0;
	
	//three overloaded constructors
	Time(){
		second = System.currentTimeMillis() / 1_000;
		//exclude days
		second %= 86_400;
		//time
		hour = second / 3_600;
		//remainder
		second %= 3_600;
		minute = second / 60;
		//remainder
		second %= 60; 
	}
	Time(long num){
		second = num / 1_000;
		//exclude days
		second %= 86_400;
		//time
		hour = second / 3_600;
		//remainder
		second %= 3_600;
		minute = second / 60;
		//remainder
		second %= 60; 
	}
	Time(long hr, long min, long sec){
		hour = hr;
		minute =  min;
		second = sec;  
	}
	//getter methods
	public long getHour(){
		return hour;
	}
	public long getMinute(){
		return minute;
	}
	public long getSecond(){
		return second;
	}
	//mutator
	public void setTime(long elapsedTime){
		second = elapsedTime;
		//exclude days
		second %= 86_400;
		//time
		hour = second / 3_600;
		//remainder
		second %= 3_600;
		minute = second / 60;
		//remainder
		second %= 60; 
	}
}
