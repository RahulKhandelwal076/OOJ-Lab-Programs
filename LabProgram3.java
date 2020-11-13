import java.util.Scanner;

class Books{
	String name;
	String author;
	int price;
	int num_pages;

	Books(String name, String author, int price, int num_pages){
		this.name = name;
		this.author = author;
		this.price = price;
		this.num_pages = num_pages;

	}

	public String toString(){
		return "\nThe name of the book is: " +name+"\nName of author is: "+author+"\nPrice of the book is: "+price+"\nNumber of pages: "+num_pages;
	}
}


class LabProgram3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of books: ");
		n = s.nextInt();
		Books[] B = new Books[n];
		String nam;
		String auth;
		int pric;
		int numpages;
		for (int i=0; i<n; i++){
			System.out.println("\nEnter the name of the book:");
			nam = s.next();
			System.out.println("Enter the name of the Author:");
			auth = s.next();
			System.out.println("Enter the price of the book:");
			pric = s.nextInt();
			System.out.println("Enter the number of pages:");
			numpages = s.nextInt();
			B[i] = new Books(nam,auth,pric,numpages);
		}

			System.out.println("Enter the number of book of which you want to see the details: ");
			int k;
			k = s.nextInt();
			System.out.println(B[k-1].toString());
		}

		
	}

