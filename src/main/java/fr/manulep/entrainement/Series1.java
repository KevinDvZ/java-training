package fr.manulep.entrainement;

import java.util.ArrayList;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		if ( name == null || name == ""){
			return "Hello World";
		}
		else {
			return "Hello " + name;
		}
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		
		ArrayList<String> arrayList= new ArrayList<String>();
		

		for (String element : array) {
			if (element != null) { 

				arrayList.add(element);

			} 
		}
		//array2 = arrayList.toArray(array2);
		String[] array2 = arrayList.toArray(new String[0]);
		return array2;

		
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		int longueur = array.length;
		int[] array2 = new int[longueur+1];

		array2[0] = element;

		for (int i = 1 ; i < array2.length ; i = i + 1){
			array2[i] = array[i-1];
		}
		return array2;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int longueur = array.length;
		if (longueur > 3){
			
			int[] array2 = new int[longueur-3];
			for (int i=3 ; i < array.length; i=i+1){
				array2[i-3]=array[i];
			}
			return array2;
		} else { 
			int[] array3 = {} ;
			return array3;
	}
		

	
	}
	
	public static String getFirstHalf(String word) {
		//5
		int longueur= word.length;
		return null;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
		return null;
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		return null;
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		return null;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		return null;
	}

	public static String shortestWord(String text) {
		//10
		return null;
	}

	public static String removeCapitals(String text) {
		//11
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		long result;
		result = number1 + number2 ;
		return result;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		long result;
		result = number1 + number2 + number3;
		return result;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		return -1;
	}

	public static float makeNegative(float number) {
		//15
		return 0;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		return false;
	}

	public static String getDomainName(String email) {
		//18
		return null;
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		//20
		return false;
	}


}
