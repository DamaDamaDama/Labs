import java.util.*;

public class lab4a {
	public static void main(String[] args){
		String userName = "";
		Scanner user = new Scanner(System.in);
		int nPeople = 0;
		Scanner option = new Scanner(System.in);
		Scanner people = new Scanner(System.in);
		int nOption;
		int nUtil = 0;
		int totalUtil = 0;
		boolean menu = true;
		boolean dead = false;
		boolean q2 = true;
		
		System.out.println("What is your name?");
		userName = user.nextLine();
		
		while(menu){
		System.out.println("Select a number");
		System.out.println("1 - Buy people ice cream");
		System.out.println("2 - Steal ice cream from people");
		System.out.println("3 - Dream about people eating ice cream");
		System.out.println("4 - Die");
		nOption = option.nextInt();
		q2 = true;
		
		while(q2){
			switch(nOption){
				case 1: nUtil = 3;
						System.out.println("How many people affected?");
						nPeople = people.nextInt();
						totalUtil = totalUtil + (nPeople * nUtil);
						menu = true;
						q2 = false;
						break;
				
				case 2: nUtil = -5;
						System.out.println("How many people affected?");
						nPeople = people.nextInt();
						totalUtil = totalUtil + (nPeople * nUtil);
						menu = true;
						q2 = false;
						break;
			
				case 3: nUtil = 0;
						System.out.println("How many people affected?");
						nPeople = people.nextInt();
						totalUtil = totalUtil + (nPeople * nUtil);
						menu = true;
						q2 = false;
						break;
				
				case 4: dead = true;
						q2 = false;
			}
			
			if(dead){
				if(nUtil == 0){
					System.out.println(userName + " caused " + totalUtil + " utils of happiness.");
					System.out.println("You are dead. You lived a morally neutral life");
					menu = false;
				}
				if(nUtil < 0){
					System.out.println(userName + "caused " + totalUtil + " utils of happiness.");
					System.out.println("You are dead. You lived a morally negative life");
					menu = false;
				}
				if(nUtil > 0){
					System.out.println(userName + "caused " + totalUtil + " utils of happiness.");
					System.out.println("You are dead. You lived a morally positive life");
					menu = false;
				}
			}
		}
		
		
		}
		
	}
}
