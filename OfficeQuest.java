import java.io.*;
import java.util.*;

public class OfficeQuest {
	static int turnCounter = 0;
	
	public static void main(String[] args){
		
		String userChoice = "";
		double xPapers = 0;
		int xDelivery = 5;
		Scanner choice = new Scanner(System.in);
		boolean turn = true;
		boolean answer = true;
		Random rngPaper = new Random();
		Random rngDelivery = new Random();
		
		System.out.println("Welcome to Office Quest");
		Stapler Stapler = new Stapler(10);
		TapeDispenser TapeDispenser = new TapeDispenser(50);
		while(turn){
			answer = true;
			xPapers = rngPaper.nextInt(59) + 1;
			System.out.println("Turn " + turnCounter);
			turnTime(turnCounter);
			
			
			System.out.println("The stapler feels... " + Stapler.howManyStaples(Stapler));
			
			System.out.println("The tape dispenser looks... " + TapeDispenser.howManyTapes(TapeDispenser));
			
				if(turnCounter > 0){
					xDelivery = rngDelivery.nextInt(99) + 1;
				}
				if(turnCounter == 0){
					System.out.printf("%.0f papers have been dropped off by the delivery man! %n", xPapers);
				}
				if(userChoice.equals("T") || userChoice.equals("t") || userChoice.equals("S") || userChoice.equals("s")){
					if(xDelivery >= 1 && xDelivery <= 5){
						System.out.println("The delivery man dropped off tape refills!");
						TapeDispenser.fillTape();
						answer = false;
						turnCounter++;
					}
					else if(xDelivery >= 6 && xDelivery <= 10){
						System.out.println("The delivery man dropped off 10 staples!");
						Stapler.fillStapler();
						answer = false;
						turnCounter++;
					}
					else{
						System.out.printf("%.0f papers have been dropped off by the delivery man! %n", xPapers);
					}
				}

			
				
			while(answer){
				
				System.out.println("[S]taple or [T]ape the papers?");
				
				userChoice = choice.nextLine();
				
				if(userChoice.equals("S") || userChoice.equals("s")){
					turn = false;
					turnCounter++;
					if(Stapler.staple(Stapler, xPapers)){
						answer = false;
						turn = true;
						System.out.println("-------------------------------");
						System.out.println("                               ");
						System.out.println("You staple the papers together.");
					}
					else{
						System.out.println("You lose, good game! (Not enough staples to continue)");
						System.exit(0);
					}



				}
				else if(userChoice.equals("T") || userChoice.equals("t")){
					turn = false;
					turnCounter++;
					if(TapeDispenser.tape(TapeDispenser, xPapers)){
						answer = false;
						turn = true;
						System.out.println("-------------------------------");
						System.out.println("                               ");
						System.out.println(" You tape the papers together.");
					}
					else{
						System.out.println("You lose, good game! (Not enough tapes to continue)");
						System.exit(0);
					}


				}
				else{
					System.out.println("Please enter a valid input");
				}
			}
			
		}
		
	}
	
	public static void turnTime(int turnCounter){
		String time = "";
		
		switch (turnCounter){
		
		case 0: time = "8 hours, 0 minutes to go";
				System.out.println(time);
				break;
		case 1: time = "7 hours, 40 minutes to go";
				System.out.println(time);
				break;
		case 2: time = "7 hours, 20 minutes to go";
				System.out.println(time);
				break;
		
		case 3: time = "7 hours, 0 minutes to go";
				System.out.println(time);
				break;
		
		case 4: time = "6 hours, 40 minutes to go";
				System.out.println(time);
				break;
				
		case 5: time = "6 hours, 20 minutes to go";
				System.out.println(time);
				break;
		
		case 6: time = "6 hours, 0 minutes to go";
				System.out.println(time);
				break;
		
		case 7: time = "5 hours, 40 minutes to go";
				System.out.println(time);
				break;
		
		case 8: time = "5 hours, 20 minutes to go";
				System.out.println(time);
				break;
		
		case 9: time = "5 hours, 0 minutes to go";
				System.out.println(time);
				break;
		
		case 10: time = "4 hours, 40 minutes to go";
				System.out.println(time);
				break;
				 
		case 11: time = "4 hours, 20 minutes to go";
		 		System.out.println(time);
		 		break;
		 
		case 12: time = "4 hours, 0 minutes to go";
		 		System.out.println(time);
		 		break;
		 
		case 13: time = "3 hours, 40 minutes to go";
		 		System.out.println(time);
		 		break;
		 
		case 14: time = "3 hours, 20 minutes to go";
		 		System.out.println(time);
		 		break;
		 
		case 15: time = "3 hours, 0 minutes to go";
		 		System.out.println(time);
		 		break;
		 
		case 16: time = "2 hours, 40 minutes to go";
				System.out.println(time);
				break;
		 
		case 17: time = "2 hours, 20 minutes to go";
		 		System.out.println(time);
		 		break;
		 
		case 18: time = "2 hours, 0 minutes to go";
		 		System.out.println(time);
		 		break;
		 		
		case 19: time = "1 hours, 40 minutes to go";
 				System.out.println(time);
 				break;
 		
		case 20: time = "1 hours, 20 minutes to go";
 				System.out.println(time);
 				break;
 		
		case 21: time = "1 hours, 0 minutes to go";
 				System.out.println(time);
 				break;
 		
		case 22: time = "0 hours, 40 minutes to go";
 				System.out.println(time);
 				break;
 		
		case 23: time = "0 hours, 20 minutes to go";
 				System.out.println(time);
 				break;
 		
		case 24: time = "You won Office Quest!";
 				System.out.println(time);
 				System.exit(0);
 				break;
		}
	}

}
