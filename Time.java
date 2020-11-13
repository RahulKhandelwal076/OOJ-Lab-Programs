class Time{
	int hours;
	int minutes;
	int seconds;


	Time(){
	hours = 0;
	minutes = 0;
	seconds = 0;
	}

	Time (int hours, int minutes, int seconds){
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
	}

	void display(){
		System.out.println(hours+":"+minutes+":"+seconds);
	}

	public static Time add(Time time1, Time time2){
		Time finalTime = new Time();
		finalTime.hours = (time1.hours + time2.hours)%24;
		finalTime.minutes = (time1.minutes + time2.minutes)%60;
		finalTime.seconds = (time1.seconds + time2.seconds)%60;
		return finalTime;
	}
	

	public static void main(String [] args){
		Time time1 = new Time(24,59,60);
		Time time2 = new Time(1,1,1);
		Time finalTime = add(time1, time2);
		System.out.print("Time 1 = ");
		time1.display();
		System.out.print("Time 2 = ");
		time2.display();
		System.out.print("Final time = ");
		finalTime.display();
		
	}
}