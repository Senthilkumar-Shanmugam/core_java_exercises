package algorithms;

import java.util.Arrays;

public class StringAnagramCheck {

	public static void main(String[] args) {

		// String input = "senthile";
		String input1 = "god";
		String input2 = "doge";
		System.out.println("Isunique>>" + permutation2(input1, input2));
	}

	public static String sort(String input) {
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

	public static boolean permutation(String input1, String input2) {
		if (input1.length() != input2.length())
			return false;

		return sort(input1).equals(sort(input2));
	}

	public static boolean permutation2(String input1, String input2) {
		if (input1.length() != input2.length())
			return false;

		int[] letters = new int[256];

		char[] s_array = input1.toCharArray();

		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < input2.length(); i++) {
			int c = (int) input2.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}

		return true;
	}
}
