import java.io.*;
import java.util.*;

public class Stapler {
	int nStaples = 0;
	
	public Stapler(int numberStaples){
		nStaples = numberStaples;
	}
	
	public Stapler(){
		
	}
	public String howManyStaples(Stapler Stapler){
		if(nStaples == 0){
			return "really light.";
		}
		else if(nStaples > 0 && nStaples <= 5){
			return "light.";
		}
		else if(nStaples > 5 && nStaples <= 10){
			return "heavy.";
		}
		else{
			return "really heavy.";
		}
	}
	
	public boolean staple(Stapler Stapler, double xPapers){
		if(nStaples <= 0){
			return false;
		}
		else if(nStaples > 0 && xPapers <= 50){
			nStaples = nStaples - 1;
			return true;
		}
		else if(nStaples >= 3 && xPapers > 50){
			System.out.println("Stapler jam! You wasted 3 staples.");
			nStaples = nStaples - 3;
			return true;
		}
		else{
			return false;
		}
	}
	
	public void fillStapler(){
		nStaples += 10;
	}
}
