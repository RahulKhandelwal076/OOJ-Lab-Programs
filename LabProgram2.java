import java.util.Scanner;

class Student{

	private String USN;
	private String name;
	private double SGPA = 0;	
	private int n; // n=no. of subjects
	private int totalCredits = 0;
	
	
 	void accept(){
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the USN: ");
	USN = scan.nextLine();
	System.out.print("Enter the name: ");
	name = scan.nextLine();
	System.out.print("Enter the no of subjects: ");
	n = scan.nextInt();
	int  credits[] = new int[n];
	double marks[] = new double[n];
	System.out.println("Enter the details of the subjects: ");
	for(int i=0; i<n; i++)
		{
			System.out.print("Enter the number of credits of subject "+( i +1)+":");
			credits[i] = scan.nextInt();
			System.out.print("\nEnter the marks of subject "+(i+1)+":");
			marks[i] = scan.nextInt();
			calculate(credits [i], marks [i], i);
		}
		}

	void calculate(int credit, double mark, int j){

		totalCredits = totalCredits + credit;

		if (mark >= 90 && mark <= 100)
		SGPA = SGPA + (10*credit);	
		else if (mark >= 80 && mark <= 89)
		SGPA = SGPA + (9*credit);
		else if (mark >= 70 && mark <= 79)		
		SGPA = SGPA + (8*credit);
		else if (mark >= 60 && mark <= 69)
		SGPA = SGPA + (7*credit);
		else if (mark >= 50 && mark <= 59)
		SGPA = SGPA + (6*credit);
		else if (mark >= 40 && mark <= 49)
		SGPA = SGPA + (5*credit);
		else
		System.out.println("Student has failed in subject" + (j+1));
		}
		


	void display(){
	System.out.println("Details of the student are: ");
	System.out.println("Name: " + name);
	System.out.println("USN: " +USN);
	System.out.println("SGPA: " +(SGPA/totalCredits));
		}
}

public class LabProgram2{
	public static void main(String [] args){
		Student stu = new Student();
		stu.accept();
		stu.display();
		}
}



	
	
			
			
	

	