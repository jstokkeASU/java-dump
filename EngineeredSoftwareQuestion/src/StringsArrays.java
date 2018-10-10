import java.util.StringTokenizer;

public class StringsArrays {

	public static void main(String[] args) {
		String str = "Abcdefgahijk lmnopcqrstuvwxyz";
		String strTwo = "Abcdefgahijk lmnopqrstuvwxyz";
		
		StringsArrays tester = new StringsArrays();
		
		boolean answerOne = tester.isUniqueChars(str);
		boolean answerTwo = tester.isUniqueChars(strTwo);
		System.out.println(answerOne);
		System.out.println(answerTwo);
		int alphaSize = Character.getNumericValue('z') - Character.getNumericValue('a');
		System.out.println(alphaSize);
		System.out.println(Character.getNumericValue('z'));
		String palOne = "abcd efgh i hgfe dcba";
		String palTwo = "My bonnie lies over the ocean.";
		System.out.println(tester.isPermOfPalindrome(palOne));
		System.out.println(tester.isPermOfPalindrome(palTwo));
		
		StringBuilder result = new StringBuilder();
	    StringTokenizer st = new StringTokenizer("Welcome to the new house", " ");
	    while (st.hasMoreTokens()) {
	        StringBuilder thisToken = new StringBuilder(st.nextToken());
	        result.append(thisToken.reverse() + " ");
	    }
	    String resultString = result.toString();
	    
	    System.out.println("Last: "+resultString);
	    
	    String s = "12:45:25AM";
	    String arr[] = s.split(":|A|P|M");
	    
	    Integer hour = Integer.parseInt(arr[0]);
        String hr = "";
        if (s.contains("P") && hour != 12) {
        	hour += 12;
        	//System.out.println("1. "+hour);
        }
        if (hour == 12 && s.contains("A")) {
	    	hr = "00";
	    	//System.out.println("2. "+hr);
	    }
        else if (hour < 10) {
	    	hr = "0"+hour.toString();
	    	//System.out.println("3. "+hr);
	    }
	    else {
	    	hr = hour.toString();
	    	//System.out.println("4. "+hr);
	    }
	    String output = hr+":"+arr[1]+":"+arr[2];
	    System.out.println(5 % 2);

	    //System.out.println(s+t);  // prints "[             ]" (13 spaces)
	    //System.out.format("[%1$3s]%n", ""); // prints "[   ]" (3 spaces)
	    
	    tester.oddNumbers(1,8);

	}
	
	public boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i=0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println("val: "+val+", Character: "+str.charAt(i));
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public boolean isPermOfPalindrome(String phrase) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') -
		                      Character.getNumericValue('a') + 1];
		for (char c: phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
				System.out.println("Char:"+c+", Table:"+table[x]);
				if (table[x] % 2 == 1) {
					countOdd++;
				}
				else {
					countOdd--;
				}
				System.out.println("Count of Odd:"+countOdd);
			}
		}
		return countOdd <= 1;
	}
	
	public int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
	static int[] oddNumbers(int l, int r) {
        int[] odds = new int[(r-l)/2+1];
        System.out.println("Array Length: "+odds.length);
        int counter = 0;
        for (int i=l; i<=r; i++){
            if (i % 2 == 1){
                odds[counter] = i;
                counter++;
            }
        }
        return odds; 
    }
	
}
