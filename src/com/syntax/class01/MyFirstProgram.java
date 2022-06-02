import java.util.Scanner; 
class Main {
public static void main(String[] args){
  
Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the roll number of the Child");
		int number = scan.nextInt();
		String name;
		switch(number) {
		
		case 101:
			name = "Ramesh";
			break;
		case 102:
			name = "Mahesh";
			break;
		case 103:
			name = "Mukesh";
			break;
		
        default:
    System.out.println("Not found Student name: in Class");
		
    }
		System.out.println("Student name: " + name);
		
    scan.close();
	}}