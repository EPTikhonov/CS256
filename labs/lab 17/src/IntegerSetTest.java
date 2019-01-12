/** 
 * Lab 17; Problem #8.13 in Deitel
 * @author erictikhonov
 */
public class IntegerSetTest {

	public static void main(String[] args) {
		int[] A = { 9, 59, 15 };
		int[] B = { 15, 67, 79 };
		IntegerSet set1 = new IntegerSet(A);
		IntegerSet set2 = new IntegerSet(B);


		System.out.println( "\nSet A contains elements:" );
		System.out.println( set1.toString() );

		System.out.println( "\nSet B contains elements:" ); 
		System.out.println( set2.toString() );

		IntegerSet union = set1.union( set2 );
		System.out.println("\nUnion of Set A and Set B:" );
		System.out.println( union.toString() ); 

		IntegerSet intersection = set1.intersection( set2 );
		System.out.println("\nIntersection of Set A and Set B:" );
		System.out.println( intersection.toString() );

		if ( set1.isEqualTo( set2 ) ) {
			System.out.println( "\nSet A is equal to set B" );
		}
		else {
			System.out.println( "\nSet A is not equal to set B" );
		}

		System.out.println( "\nAdding 99 into set A..." ); 
		set1.add( 99 ); 

		System.out.println( "\nSet A now contains elements:" ); 
		System.out.println( set1.toString() ); 


		System.out.println( "\nRemoving 99 from set A..." ); 
		set1.remove( 99 ); 

		System.out.println( "\nSet A now contains elements:" ); 
		System.out.println( set1.toString() ); 

	}

}
