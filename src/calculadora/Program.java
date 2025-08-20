package calculadora;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;



public class Program {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("CALCULATOR \nCHOOSE A OPTION");
		 System.out.println("1: +");
		 System.out.println("2: -");
		 System.out.println("3: /");
		 System.out.println("4: *");
		 
		 int choice = scanner.nextInt();
		 
		 System.out.println("ENTER A NUMERBER: ");
		 double n1 = scanner.nextDouble();
		 
		 System.out.println("ENTER A NUMBER: ");
		 double n2 = scanner.nextDouble();
				 
				 
;
		 
		 
		 
		 
		 
		 switch(choice){
		 case 1: System.out.println(n1+n2);;
		 break;
		 
		 case 2: System.out.println(n1-n2);
		 break;
		 
		 case 3: System.out.println(n1/n2);;
		 break;
		 
		 case 4: System.out.println(n1*n2);;
		 break;
		 
		 default: System.out.println("It's not possible make this acount");
		 
		 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 scanner.close();
		 
		 
		 

    }
	

}


