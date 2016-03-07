import java.util.*;
import java.io.*;

public class lab8 {
	
	public static void main(String[] args) throws IOException{
		int[] gardenMartin = createGarden();
		int[] gardenPangloss = createGarden();
		int stuff = 0;
		Random rutabaga = new Random();
		int x = 0;
		int seasonCounter = 1;
		                   
		while(seasonCounter < 41){
			x = rutabaga.nextInt(4);
			System.out.println("Season " + seasonCounter + ", " + x + " Rutabaga(s).");
			
			while(stuff + x > gardenMartin.length){
				gardenMartin = updateGardenMartin(gardenMartin);
			}
			while(stuff + x > gardenPangloss.length){
				gardenPangloss = updateGardenPangloss(gardenPangloss);
			}
			for(int i = 0; i < x; i++){ //this is working now
				gardenMartin[stuff + i] = x;
				gardenPangloss[stuff + i] = x;
			}
			stuff += x;
			seasonCounter++;
			
		}
		
		printArray(gardenMartin, stuff); 
		System.out.println("Martin Garden size: " + gardenMartin.length);
		printArray(gardenPangloss, stuff); 
		System.out.println("Pangloss Garden size: " + gardenPangloss.length);
		
	}
	
	public static void printArray(int[] arr, int numItems) { //print a garden for both
	    System.out.print("[ ");
	    for(int j=0; j < (arr.length - 1); j++){
	        if(j >= numItems){
	        System.out.print("***, ");
	        }
	        else{
	        System.out.print(arr[j] + ", ");
	        }
	    }
	    if((arr.length -1) >= numItems){
	        System.out.println("*** ]");
	    } 
	    else{
	        System.out.println(arr[arr.length - 1] + " ]");
	    }
	}
	
	public static int[] createGarden(){ //create a garden for both
		int size = 5;
		int[] garden = new int[size];
		return garden;
	}
	
	public static int[] updateGardenMartin(int[] array){ //resize garden for martin
		int newL = array.length + 2;
		int[] newGarden = new int[newL];
		for(int i = 0; i < array.length; i++){
			newGarden[i] = array[i];
		}
		System.out.println("Resized Martin's garden to " + newL);
		return newGarden;
	}
	
	public static int[] updateGardenPangloss(int[] array){ //resize garden for pangloss
		int newL = array.length * 2;
		int[] newGarden = new int[newL];
		for(int i = 0; i < array.length; i++){
			newGarden[i] = array[i];
		}
		System.out.println("Resized Pangloss' garden to " + newL);
		return newGarden;
	}
	
}
