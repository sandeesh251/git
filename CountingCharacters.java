
package programs;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountingCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = sc.nextLine();
		sc.close();
		charCount(str);
		System.out.println("Adding new text.....");
		

	}

	public static void charCount(String str) {
		char[] char1 = str.toCharArray();
		TreeMap<Character, Integer> char2 = new TreeMap<Character, Integer>();
		for (Character uniq : char1) {
			if (!char2.containsKey(uniq)) {
				char2.put(uniq, 1);
			} else {
				char2.put(uniq, char2.get(uniq) + 1);
			}
		}
		Set<Character> set = char2.keySet();
		for (Character key : set) {
			System.out.println(key + ":" + char2.get(key));
		}
	}

}
