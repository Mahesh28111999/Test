package Assign7;

//SHOW AN EXAMPLE OF STATIC IMPORT

import static java.lang.System.*;
class Amp{
	public void meth() {
		out.println("Print meth from meth"); 

	}
}


public class StatImp {
public static void main(String[] args) {
	Amp amp=new Amp(); // CREATING OBJECT
	amp.meth();
}
}
