
public class LineEditor {
	
	public static String myLine;
	
	/** Inserts str into myLine at position index;
	 *  no characters from myLine are overwritten.
	 *  @param str the string to be inserted
	 *  @param index the position at which to insert str
	 *  	Precondition: 0 <= index <= myLine.length()
	 */
	public static void insert(String str, int index){
		myLine = myLine.substring(0, index) + str + myLine.substring(index);
	}
	
	/** If str is found in myLine the first occurrence of str has been
	 * removed from myLin; otherwise myLine is left unchanged.
	 * @param str the string to be removed
	 */
	public static void delete(String str){
		myLine = myLine.substring(0, myLine.indexOf(str)) + myLine.substring(myLine.indexOf(str) + str.length());
	}
	
	/** Removes all instances of str from myLine;
	 * 	myLine is otherwise unchanged.
	 *  @param str the string to be removed
	 */
	public static void deleteAll(String str){
		while(myLine.indexOf(str) != -1){
			myLine = myLine.substring(0, myLine.indexOf(str)) + myLine.substring(myLine.indexOf(str) + str.length()); 
		}
	}
}
