/*
  	ISYS 320
  	Name(s): Samantha Rutherford
  	Date: 12/10/2017
*/

public class P11_TableMakerFlip {

	public static void main(String[] args) {
		for( int rowNumber = 5; rowNumber >= 1; rowNumber-- ) {
			for( int columnNumber = 1; columnNumber <= 10; columnNumber++ ) {
				System.out.print( (rowNumber * columnNumber ) + "\t");
			}
			System.out.println();
		}
	}

}
