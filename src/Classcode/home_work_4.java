package Classcode;

import java.util.Arrays;

public class home_work_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println("Answer#1:");
			String threeWordSentence_1 = "hApPy nEW yeAr";
	        System.out.println("Before code : " +threeWordSentence_1);     // "hApPy nEW yeAr"

			
			//first I split the words into array using split method 
			//2nd I used substing method and case method to change the letters to the correct format 
			String [] splitWords = threeWordSentence_1.split(" ");
			//System.out.println(Arrays.toString(splitWords));
			
			String firstWordUpperLowerCase= splitWords[0].substring(0, 1).toUpperCase()+splitWords[0].substring(1).toLowerCase();
			String SndWordUpperLowerCase= splitWords[1].substring(0, 1).toUpperCase()+splitWords[1].substring(1).toLowerCase();
			String TrdWordUpperLowerCase= splitWords[2].substring(0,1).toUpperCase()+splitWords[2].substring(1).toLowerCase();
			
			threeWordSentence_1=  firstWordUpperLowerCase + " " + SndWordUpperLowerCase + " " + TrdWordUpperLowerCase;
			
	        // code
	       System.out.println("After code : " + threeWordSentence_1);      // "Happy New Year" 
		
		
	   System.out.println("Answer#2:");

	       String threeWordSentence_2 = "very gOOD MorNING";
	       String[] splitWord_2= threeWordSentence_2.split(" ");
	    
	    //System.out.println(Arrays.toString(splitWord_2));
	    
	      String firstWordUpperLowerCase_1 = splitWord_2[0].substring(0, 1).toUpperCase();
	      String SndWordUpperLowerCase_2 = splitWord_2[1].substring(0, 1).toUpperCase();
	      String TrdWordUpperLowerCase_3 = splitWord_2[2].substring(0, 1).toUpperCase();
	      String abbr= firstWordUpperLowerCase_1+SndWordUpperLowerCase_2+TrdWordUpperLowerCase_3;
	    
	      System.out.println("Abbreviation for '" + threeWordSentence_2 + "' is : " + abbr);
	    
	   System.out.println("Answer#3:");
	   
	   String sentence_3 = "We all are here to learn programming and testing";
	   String[] splitWord_3=  sentence_3.split(" ");
	   int numberOfWords= splitWord_3.length;
	   
	       System.out.println("number of words in the sentence are: " + numberOfWords);

	     
	
	        
	}

}
