package exchange.interview;

import java.util.ArrayList;
import java.util.List;

public class FrequentCharInAString {

	public static void main(String[] args) {
		String string = "Hello! Are you all fine? What are u doing today? Hey Guyz,Listen! I have a plan for today. Help!";

		System.out.println("Frequenct chars");
		for (char c : findMostFrequentCharInaString(string))
			System.out.println(c);

	}

	// Returns most frequent chars in a list
	private static List<Character> findMostFrequentCharInaString(String string) {
		List<Character> frequentCharList = new ArrayList<Character>();
		List<Character> checkedChar = new ArrayList<Character>();
		int occurence = 0, charoccurence = 0;

		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			charoccurence = 0;
			
			//Skips space and already checked chars
			if (c.equals(' ') || checkedChar.contains(c))
				continue;

			for (int j = 0; j < string.length(); j++) {
				if (c.equals(string.charAt(j)))
					charoccurence++;
			}
			checkedChar.add(c);// add this char to already checked char list
			
			if (charoccurence >= occurence) {
				if (charoccurence > occurence) {
					frequentCharList.clear();
				}
				occurence = charoccurence;
				frequentCharList.add(c);
			}
		}

		return frequentCharList;
	}

}
