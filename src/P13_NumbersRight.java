/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 12/10/2017
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		for (int i=1; i<6; i++) { 
			for (int j=6; j>0;j--) {
				System.out.print(i < j ? " " : i); // if i < j is true, i is called.
												   // so as long i is less than j then it will
												   // print out the right angled triangle.
			}
		System.out.println();
			
	}

}
