import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opt=0;
		int num1=0;
		int num2=0;
		do {
			for(int i=0;i<40;i++)
			{
				System.out.printf("\n");
			}
			
			System.out.println("BJ-JP TABLE");
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			
			
			try {
				opt=scan.nextInt();
				scan.nextLine();
			} catch (Exception e) {
				System.out.println("input numbers only");
				scan.nextLine();
			}
			
//			System.out.println(opt);
			if(opt==1) //start simul
			{
				do {
					System.out.println("Input the first number [1 - 100](inclusive): ");
					
					try {
						num1=scan.nextInt();
						scan.nextLine();
					} catch (Exception e) {
						System.out.println("input numbers only");
						scan.nextLine();
					}
				}while(num1<1||num1>100);
				
				do {
					System.out.println("Input the second number [1 - 100](inclusive): ");
					try {
						num2=scan.nextInt();
						scan.nextLine();
					} catch (Exception e) {
						System.out.println("input numbers only");
						scan.nextLine();
					}
				}while(num2<1||num2>100);
				
				System.out.println("Basic Java Data Types");
				float bagi=(float)num1/(num2);
				System.out.println("+================================================================================================================+");
				System.out.println("+ + (String Type) | (Character Type ) | * (Integer Type) | / (Floating Type) | input 1 == input 2 (Boolean Type) +");                              
				System.out.println("+================================================================================================================+");
				System.out.printf("+     " + "%d" + " + " + "%-7d" + "|" + "        %c %-8c" + "|" + "         %-9d" + " | " + "%-18f" + " |         " + (num1==num2) +"                   |+\n" ,num1,num2, num1 ,num2 , num1*num2, bagi);
				System.out.println("Press enter to proceed");
				scan.nextLine();
				
				Integer numint1=num1;
				Integer numint2=num2;
				System.out.printf("\n\n");
				System.out.println("Basic Arithmetic Operations");
				System.out.println("| + | - | *  | / | % |");
				System.out.printf("%d   %d  %d  %d   %d\n", numint1+numint2, numint1-numint2, numint1*numint2, numint1/numint2, numint1%numint2);
				System.out.println("Press enter to proceed");
				scan.nextLine();
				
				// BOOLEAN VALUE
				boolean p1=true;
				
				do {
					
					System.out.println("Give me value for p1 [true | false]: ");
					try {
						p1=scan.nextBoolean();
						scan.nextLine();
					} catch (Exception e) {
						System.out.println("input numbers only");
						scan.nextLine();
					
					}
					
				}while(p1 != true && p1 != false);
				
				boolean p2 = true;
				
				do {
					
					System.out.println("Give me value for p2 [true | false]: ");
					try {
						p2=scan.nextBoolean();
						scan.nextLine();
					} catch (Exception e) {
						System.out.println("input numbers only");
						scan.nextLine();
					}
					
				}while(p2!=true && p2!=false);
				System.out.println("=================================================================");
				System.out.println("Logical Table");
				System.out.println("=================================================================");
				System.out.printf("P1 = %s, P2 = %s\n", p1==true ? "T":"F" , p2==true ? "T":"F");
				System.out.println("|\t!P1\t||\t!P2\t||\t&&\t||\t||\t|");
				System.out.println("|\t"+!p1+"\t|"+"|\t"+!p2+"\t|"+"|\t"+(p1==true && p2==true)+"\t|"+"|\t"+(p1==true||p2==true)+"\t|");
				System.out.println("=================================================================");
				System.out.println("Press enter to proceed");
				scan.nextLine();
			}
			else if(opt==2) // exit program
			{
				System.out.println("Thank you for using the app!");
			}
			
		}while(opt!=2 );
		
		
	}



}
