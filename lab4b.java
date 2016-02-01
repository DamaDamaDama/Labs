import java.util.*;


public class lab4b {
	public static void main(String[] args){
		int userLevel;
		Scanner level = new Scanner(System.in);
		
		System.out.println("Enter an integer corresponding to your current perceived level in Maslow's hierarchy of needs. (1-5)");
		userLevel = level.nextInt();
		
		switch(userLevel){
			case 5: System.out.println("Your levels include:");
					System.out.println("Self-actualization (achieving your total potential)");
			
			case 4: System.out.println("Your levels include:");
					System.out.println("Esteem (e.g., respect from others, self-respect)");
			
			case 3: System.out.println("Your levels include:");
					System.out.println("Love and Belonging (e.g., friendship and family)");
			
			case 2: System.out.println("Your levels include:");
					System.out.println("Safety (e.g., personal and financial security)");
			
			case 1: System.out.println("Your levels include:");
					System.out.println("Physiological (e.g., oxygen, food, water)");
		}
	}
}
