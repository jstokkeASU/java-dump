
public class Counter {
	int count = 0;
	
	public int getOnes(int num) {
		if (Math.abs(num % 2) == 1) {
			count++;
			//System.out.println(count);
		}
		num = Math.abs(num/2);
		System.out.println("GetOnes: "+num+" Count: "+count);
		if (num == 1) {
			count++;
			return count;
		}
		else
			getOnes(num);
		return count;
	}

	public static void main(String[] args) {
		/*for (int i=1; i<101; i++) {
			if (i==35) {
				System.out.println("FizzBuzz");
			}
			else if (i==53) {
				System.out.println("BuzzFizz");
			}
			else if ((i > 29 && i < 40) || (i % 10 == 3)){
				System.out.println("Fizz");
			}
			else if ((i > 49 && i < 60) || (i % 10 == 5)) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}*/
		BinarySearchTree firstTree = new BinarySearchTree();
		firstTree.insert(5);
		firstTree.insert(6);
		firstTree.insert(2);
		firstTree.insert(19);
		firstTree.insert(-5);
		
		firstTree.inOrder();
		System.out.println(firstTree.containsValue(firstTree.root, 2));
		System.out.println(firstTree.containsValue(firstTree.root, 10));
		System.out.println("Total Objects: "+firstTree.getCount());
		Counter newCount = new Counter();
		System.out.println(newCount.getOnes(-85));
	}
	
}
