
public class Lab3 {
	public static void main(String[] args){
		double distance = 10;
		int i;
		int steps = 0;
		
		for (i = 0; i < distance;){
			distance = distance / 2.0;
			steps++;
			System.out.println(distance);
		}
		System.out.println("# of steps: " + steps);
	}
}
