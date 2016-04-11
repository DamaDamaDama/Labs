

public class CoogieException extends Throwable{
	int numCats;
	
	public CoogieException(int numCats){
		super.toString();
		System.out.println(numCats + " is too many numCats!");
		numCats = this.numCats;
	}
}
