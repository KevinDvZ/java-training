package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

//import javax.swing.tree.DefaultMutableTreeNode;

import java.util.regex.Matcher;

public class Series1 {

	private Series1() {
		throw new IllegalStateException("Test class");
	}

	public static String helloWorld(String name) {
		// 1
		if (name == null || name == "") {
			return "Hello World";
		} else {
			return "Hello " + name;
		}
	}

	public static String[] removeNullElements(String[] array) {
		// 2

		ArrayList<String> arrayList = new ArrayList<String>();

		for (String element : array) {
			if (element != null) {

				arrayList.add(element);

			}
		}
		;
		String[] array2 = arrayList.toArray(new String[0]);
		return array2;

	}

	public static int[] addElementToBeginning(int[] array, int element) {
		// 3
		int longueur = array.length;
		int[] array2 = new int[longueur + 1];

		array2[0] = element;

		for (int i = 1; i < array2.length; i = i + 1) {
			array2[i] = array[i - 1];
		}
		return array2;
	}

	public static int[] allElementsExceptFirstThree(int[] array) {
		// 4
		int longueur = array.length;
		if (longueur > 3) {

			int[] array2 = new int[longueur - 3];
			for (int i = 3; i < array.length; i = i + 1) {
				array2[i - 3] = array[i];
			}
			return array2;
		} else {
			int[] array3 = {};
			return array3;
		}

	}

	public static String getFirstHalf(String word) {
		// 5

		// System.out.println(word);
		// System.out.println(word.length());

		if (word.length() % 2 == 0) {
			return word.substring(0, word.length() / 2);
		} else {

			return word.substring(0, word.length() / 2 + 1);
		}

	}

	public static String[] selectElementsStartingWithA(String[] array) {
		// 6
		ArrayList<String> wordList = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {

			System.out.println(array);
			if (array[i].startsWith("a") || array[i].startsWith("A")) {
				// wordList[y]= Array.get(array[], i);
				// wordList[y] = Array.get(array[i]);
				// String prefix = "a";

				wordList.add(array[i]);

			}

		}
		String[] array2 = wordList.toArray(new String[0]);
		return array2;
	}

	public static String[] selectElementsStartingWithVowel(String[] array) {
		// 7
		System.out.println(Arrays.toString(array) + "1");
		ArrayList<String> results = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {

			if (array[i] != null) {
				char fstLetter = array[i].charAt(0);
				if (fstLetter == 'a' || fstLetter == 'e' || fstLetter == 'i' || fstLetter == 'o' || fstLetter == 'u') {

					results.add(array[i]);
				}
			}
		}
		System.out.println(Arrays.toString(array) + "2");
		String[] resultfinal = results.toArray(new String[0]);

		return resultfinal;

	}

	public static String[] reverseOrderInArray(String[] array) {
		// 8

		String[] reversedArray = new String[array.length];
		int i = array.length - 1;
		// System.out.println(i);
		for (String mot : array) {
			reversedArray[i] = mot;
			i--;
			// System.out.println(i);
		}
		return reversedArray;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		// 9

		int[] nouvelArray = new int[array.length + 1];
		// int lol = nouvelArray.length;
		// System.out.println(element);
		// System.out.println(nouvelArray[2]);

		if (array.length == 0) {
			nouvelArray[0] = element;
		} else if (array.length % 2 == 0) {
			for (int i = 0; i < nouvelArray.length / 2; i++) {
				nouvelArray[i] = array[i];
				// System.out.println(nouvelArray[i]);

			}

			nouvelArray[array.length / 2] = element;
			// System.out.println(nouvelArray[array.length / 2]);

			for (int i = array.length / 2 + 1; i < nouvelArray.length; i++) {
				nouvelArray[i] = array[i - 1];
				// System.out.println(nouvelArray[i]);
			}

		} else {
			for (int i = 0; i < array.length / 2; i++) {
				nouvelArray[i] = array[i];
				// System.out.println(nouvelArray[i]);

			}
			nouvelArray[array.length / 2] = element;
			for (int i = array.length / 2 + 1; i < nouvelArray.length; i++) {
				nouvelArray[i] = array[i - 1];
				// System.out.println(nouvelArray[i]);
			}
		}
		System.out.println(Arrays.toString(nouvelArray));
		return nouvelArray;
	}

	public static String shortestWord(String text) {
		// 10
		System.out.println(text + '1');
		String[] motsIsoles = text.split(" ");

		System.out.println(Arrays.toString(motsIsoles) + "2");
		String motLePlusCourt = motsIsoles[0];
		System.out.println(motLePlusCourt);

		for (int i = 0; i < motsIsoles.length; i++) {
			if (motLePlusCourt.length() > motsIsoles[i].length()) {
				motLePlusCourt = motsIsoles[i];

			}

		}

		return motLePlusCourt;

	}

	public static String removeCapitals(String text) {
		// 11
		String wthCapitals = text.replaceAll("[A-Z]", "");
		return wthCapitals;
	}

	public static long addingTwoNumbers(long number1, long number2) {
		// 12
		long result;
		result = number1 + number2;
		return result;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		// 13
		long result;
		result = number1 + number2 + number3;
		return result;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		// 14
		int result = 0;
		for (int i : numbers) {
			result = result + i;
		}

		return result;
	}

	public static float makeNegative(float number) {
		// 15
		if (number < 0) {
			return number;
		} else {
			number = number - 2 * number;
			return number;
		}

	}

	public static boolean checkForSpecialCharacters(String string) {
		// 16
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9!]");
		Matcher matcher = pattern.matcher(string);
		boolean isStringContainsSpecialCharacter = matcher.find();

		return isStringContainsSpecialCharacter;
	}

	public static boolean checkIfStringStartsWithConsonant(String word) {
		// 17
		System.out.println(word);
		String debut = Character.toString(word.charAt(0));
		System.out.println(debut);
		Pattern pattern = Pattern.compile("[bdfhjnptvxzqBDFHJNPTQXVZQ]");
		Matcher matcher = pattern.matcher(debut);
		boolean alors = matcher.find();
		System.out.println(alors);

		return alors;
	}

	public static String getDomainName(String email) {
		// 18
		// anciens essais infructueux :
		// email.replaceAll(".*?\.(.*?\.[a-zA-Z]+)", "");
		// String DomainName = new String();
		// DomainName = email.replaceAll("(?<=@)[^.]+", "");
		// DomainName = email.substring()
		// Pattern pattern = Pattern.compile("(?<=@)[^.]+");
		// Matcher matcher = pattern.matcher(email);
		// DomainName = email.substring(email.indexOf("@") + 1);
		// System.out.println(matcher.DomainName);
		// return email.replaceAll("(?<=@)[^.]+", "");
		return email.replaceAll("(^.*@|.com$)", ""); // là c'est bon !

	}

	public static int[] letterPosition(String name) {
		// 19
		String minus = name.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(minus);
		int[] position = new int[name.length()];
		for (int i = 0; i < name.length(); i++) {
			position[i] = alphabet.indexOf(minus.charAt(i)) + 1;
		}

		return position;
	}

	public static boolean isPeer(int number) {
		// 20
		if (number % 2 != 0) {
			return false;
		} else {
			return true;
		}
	}

}
