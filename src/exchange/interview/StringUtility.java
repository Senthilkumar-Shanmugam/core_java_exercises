package exchange.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtility {

	public static void main(String[] args) {
		String string = "This is a method to find most occurening charcter in a string t";

		System.out.println("Frequenct chars");
		for (char c : findMostFrequentCharInaString(string))
			System.out.println(c);


	}

	// Returns most frequent chars in a list
	private static List<Character> findMostFrequentCharInaString(String string) {
		List<Character> frequentCharList = new ArrayList<Character>();
		Map<Character, Integer> inputMap = new HashMap<Character, Integer>();
		int maxOccurence = 1, charoccurence = 0;

		for (int i = 0; i < string.length(); i++) {
			Character c = string.charAt(i);
			charoccurence = 0;

			// Skips space
			if (c.equals(' '))
				continue;

			if (inputMap.containsKey(c)) {// if that char is already in input
											// map
				charoccurence = inputMap.get(c) + 1;
				inputMap.put(c, charoccurence);

			} else// new occurrence
			{
				charoccurence = 1;
				inputMap.put(c, 1);
			}

			if (charoccurence >= maxOccurence) {
				if (charoccurence > maxOccurence) {
					frequentCharList.clear();
				}
				maxOccurence = charoccurence;
				frequentCharList.add(c);
			}
		}

		return frequentCharList;
	}

}
