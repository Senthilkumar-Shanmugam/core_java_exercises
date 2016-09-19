package algorithms;

public class StringUniqueCheck {

	public static void main(String[] args) {

		String input = "senthile";
		System.out.println("Isunique>>" + isUniqueChars2(input));
	}

	public static boolean isUniqueChars2(String str) {
		if (str.length() > 256)
			return false;

		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			System.out.println(">>"+str.charAt(i)+">>"+val);
			if (char_set[val]) { // Already found this char in string
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
}
