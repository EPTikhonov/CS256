/** 
 * Lab 17; Problem #8.13 in Deitel
 * @author erictikhonov
 */
public class IntegerSet {

	private final int SETSIZE = 101;
	private boolean[] set;

	public IntegerSet() {
		set = new boolean[SETSIZE];
	}

	public IntegerSet(int array[]) {
		set = new boolean[SETSIZE];
		// takes array from argument inserts all elements
		for (int i = 0; i < array.length; i++) {
			add(array[i]);
		}
	}

	public IntegerSet union(IntegerSet IntegerSet) {
		IntegerSet temp = new IntegerSet();

		for(int count = 0; count < SETSIZE; count++) {
			temp.set[count] = (set[count] || IntegerSet.set[count]);
		}
		return temp;
	}

	public IntegerSet intersection(IntegerSet IntegerSet) {
		IntegerSet temp = new IntegerSet();
		for (int count = 0; count < SETSIZE; count++) {
			temp.set[count] = (set[count] && IntegerSet.set[count]);
		}
		return temp;
	}

	// inserts a new integer k into a set (by setting a[k] to true).
	public void add(int insertInteger) {
		if (validEntry(insertInteger)) {
			set[insertInteger] = true;
		}
	}

	// deletes integer m (by setting a[m] to false).
	public void remove(int deleteInteger) {
		if (validEntry(deleteInteger)) {
			set[deleteInteger] = false;
		}
	}

	public String toString() {
		boolean empty = true;
		String setString = "{ ";

		for (int count = 0; count < SETSIZE; count++) {
			if (set[count]) {
				setString += count + " ";
				empty = false;
			}
		}

		if(empty) {
			setString += "---";

		}
		setString += "}";

		return setString;
	}

	// determines whether two sets are equal.
	public boolean isEqualTo(IntegerSet integerSet) {

		for (int count = 0; count < 100; count++) {
			if (set[count] != integerSet.set[count]) {
				return false;
			}
		}
		return true;
	}

	public boolean validEntry (int input) {
		return input >= 0 && input < SETSIZE;
	}

}
