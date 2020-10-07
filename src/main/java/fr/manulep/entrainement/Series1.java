package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.tree.DefaultMutableTreeNode;

import java.util.regex.Matcher;

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
		;
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
		if ( longueur > 3){
			
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


		//System.out.println(word);
		//System.out.println(word.length());

		if (word.length()%2 == 0){
		return  word.substring(0,word.length()/2);
		} else {
			
			return  word.substring(0,word.length()/2+1);
		}
		
		
		
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
		int result = 0 ;
		for (int i : numbers){
			result = result + i;
				}

		return result  ;
	}

	public static float makeNegative(float number) {
		//15
		if (number < 0){
			return number;
		} else { 
			number = number - 2*number;
			return number;
		}
		
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9!]");
        Matcher matcher = pattern.matcher(string);
        boolean isStringContainsSpecialCharacter = matcher.find();

		return isStringContainsSpecialCharacter;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		System.out.println(word);
		String debut=Character.toString(word.charAt(0));
		System.out.println(debut);
		Pattern pattern = Pattern.compile("[bdfhjnptvzqBDFHJNPTQVZQ]");
		Matcher matcher = pattern.matcher(debut);
		boolean alors = matcher.find();
		System.out.println(alors);

		return alors;
	}

	public static String getDomainName(String email) {
		//18
		return null;
	}

	public static int[] letterPosition(String name) {
		//19
		String minus = name.toLowerCase();
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(minus);
		int[] position = new int[name.length()];
		for(int i=0; i < name.length(); i++){
			position[i]=alphabet.indexOf(minus.charAt(i))+1;
		}
	
		return position;
	}

	public static boolean isPeer(int number) {
		//20
		if ( number%2 != 0){
			return false;
		} else { return true;}
	}


}
