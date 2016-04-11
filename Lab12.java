import java.util.*;
import java.io.*;

public class Lab12 {
	public static void main(String[] args) {
		try{
			throw (new NoogieException());
		}
		catch(NoogieException ne){
			System.out.println(ne.toString());
		}
		
		try{
			throw (new CoogieException(3));
		}
		catch (CoogieException ce){
			System.out.println(ce.toString());
		}
		
		try{
			File f = new File("fakefilethatdoesntexist.txt");
			Scanner read = new Scanner(f);
		}
		catch (FileNotFoundException fnfe){
			System.out.println(fnfe.toString());
		}
		
		try{
			String[] arr = new String[6];
			arr[7] = "3";
		}
		catch (ArrayIndexOutOfBoundsException aioobe){
			System.out.println(aioobe.toString());
		}
		
		try{
			int impossible = 10 / 0;
		}
		catch (ArithmeticException ae){
			System.out.println(ae.toString());
		}
		
		try{
			String[] arr2 = new String[-5];
		}
		catch (NegativeArraySizeException nase){
			System.out.println(nase.toString());
		}
		
		try{
			String c = "char";
			char z = c.charAt(5);
		}
		catch (StringIndexOutOfBoundsException sioobe){
			System.out.println(sioobe.toString());
		}
		
		try{
			String test = "x";
			Integer.parseInt(test);
		}
		catch (NumberFormatException nfe){
			System.out.println(nfe.toString());
		}
		
		try{
			Object obj = null;
			obj.getClass();
		}
		catch (NullPointerException npe){
			System.out.println(npe.toString());
		}
		System.out.println("All exceptions caught, program terminated sucessfully.");
	}
}
