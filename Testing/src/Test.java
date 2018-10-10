
public class Test {
	
	String[] array;
	int arraySize;
	int itemsInArray = 0;
	
	Test(int size){
		arraySize = size;
		array = new String[size];
	}
	
	public int hash(String entry) {
		int value = 0;
		for (int i=0; i<entry.length(); i++) {
			System.out.println((int)entry.charAt(i));
			value = value+(itemsInArray+1)*31 + (int)entry.charAt(i);
		}
		value = value % arraySize;
		System.out.println("Value: "+value);
		return value;
	}

	public static void main(String[] args) {
		String original = "a gnat a plan a canal panama";
		String[] words = original.split(" ");
		String altered = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j=word.length()-1; j>=0; j--) {
				reverseWord += word.charAt(j);
			}
			altered += reverseWord + " ";
		}
		System.out.println(altered);
		
		Test hashIt = new Test(10);
		
		String tester = "committee";
		System.out.println(tester);
		int index = hashIt.hash(tester);

	}	
		

}
