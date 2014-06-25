import java.util.*;
import java.lang.*;
import java.io.*;

class LabString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		ArrayList<String> st = new ArrayList<String>(); //Array List
		st = getWords(); //Get Entries for getWords() method as specified in assignment
		System.out.println("Original list"); //Print out the original list as shown in sample output
		for(int j = 0; j < st.size() ; j++){
			System.out.println(st.get(j));
		}
		updateExercise(st); //Call updateExercise
	}
	
	//private getWords method as shown in the assignment
	private static ArrayList<String> getWords()
	{
		ArrayList<String> words = new ArrayList<String>();
		words.add("Exercise: Strings");
		words.add("Lab Generics");
		words.add("Exercise: List<E> ");
		words.add("Assignment A03");
		words.add("Lab paint");
		words.add("Exercise: Inheritance");
		words.add("Exercise: Polymorphism \t");
		words.add("Assignment A05");
		return words;
	}
	
	private static void updateExercise(ArrayList<String> wordList)
	{
		System.out.println("Updated List");
		for(int l = 0; l < wordList.size() ; l++){ //loop through each entry in wordList
			StringBuilder builder = new StringBuilder(); //We will need StringBuilder to build the new String entry
			String entry = wordList.get(l); //Retrieve each entry one by one
			entry = entry.replace(":",""); //Get rid of :
			String[] parts = entry.split(" "); //Store as an array of string
			int len = parts.length;
			if(parts[0].equals("Exercise")) //if first word is Exercise
			{
				for(int k = 1; k < len; k++) { //Build new string with remaining words
	    			builder.append(parts[k]);
				}
				builder.append(" exercise"); //And add exercise at the end
				//Use trim() and replaceAll methods to make sure that there is only single blank before word "exercise"
				System.out.println(builder.toString().trim().replaceAll("\\s+"," ")); 
			}
			else
			{
				System.out.println(entry.trim().replaceAll("\\s+"," "));
			}
		}
	}
}