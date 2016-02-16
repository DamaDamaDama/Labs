import java.io.*;
import java.util.*;

public class TapeDispenser {
	double nTapes = 50;
	
	public TapeDispenser(double numberTapes){
		nTapes = numberTapes;
	}
	
	public TapeDispenser(){
		
	}
	
	public String howManyTapes(TapeDispenser TapeDispenser){
		if(nTapes == 0){
			return "empty.";
		}
		else if(nTapes > 0 && nTapes < 15){
			return "almost empty.";
		}
		else if(nTapes >= 15 && nTapes < 35){
			return "about halfway full.";
		}
		else if(nTapes >= 35 && nTapes < 45){
			return "almost full.";
		}
		else{
			return "full.";
		}
	}
	
	public boolean tape(TapeDispenser TapeDispenser, double xPapers){
		if(nTapes - (xPapers * 0.25) >= 0){
			nTapes = nTapes - (xPapers * 0.25);
			return true;
		}
		else{
			return false;
		}
	}
	
	public void fillTape(){
		nTapes = 50;
	}
}
