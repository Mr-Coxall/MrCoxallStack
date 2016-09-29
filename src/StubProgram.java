/****************************************************************************
 *
 * Created by: Mr. Coxall
 * Created on: Sept 2016
 * This program is the stub program that uses the MrCoxallStack.  
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StubProgram {

	public static void main(String[] args) {
		// program lets users add items to the MrCoxallStack
		
		MrCoxallStack aStack = new MrCoxallStack();
		String anItem;
		
		InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
	    
	    System.out.println("Enter an item to the stack");
	    try {
			anItem = br.readLine();
			aStack.push(anItem);
			System.out.println(aStack);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
