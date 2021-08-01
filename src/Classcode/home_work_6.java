package Classcode;

import java.util.Arrays;

public class home_work_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String happySentence= "";
		String sixWordSentence = "happy new year TO You DeaR";
		String[] splitWords = sixWordSentence.split(" ");
		
		//System.out.println(Arrays.toString(splitWords));
		
	 for (int i=0; i < splitWords.length; i++) 
	 { happySentence += splitWords[i].substring(0, 1).toUpperCase()+splitWords[i].substring(1).toLowerCase() + " ";}
	
	 System.out.println(happySentence);
	 
	 //Answer#2: 
	 String hello= "";
	 String arrbSentance = "very gOOD MorNING to You dear";
		String[] splitWords_1 = arrbSentance.split(" ");
		for (int i=0; i < splitWords_1.length; i++) 
		{  hello += splitWords_1[i].substring(0, 1).toUpperCase();}
		
		System.out.println(hello);
		
		
	//Answer#3:
		int studentScore= 150;
		int maxScore=170;
		double thePercentage = studentScore*100.0/maxScore;
		//System.out.println(thePercentage);
		
		if (thePercentage >=91) {System.out.println("student got grade A " + thePercentage + " " + "gets full scholarship for next year");}
		else if (thePercentage >=81) {System.out.println("student got better than grade B: " + thePercentage + " " + "get half scholarship for next year");}
		else if (thePercentage >=71) {System.out.println("student got better than grade C: " + thePercentage + " " + "get half scholarship for next year");}
		else if (thePercentage >=61) {System.out.println("student got grade D: " + thePercentage + " " + "No Scholarship");}
		else if (thePercentage >=51) {System.out.println("student got grade E " + thePercentage + " " + "No Scholarship");}
		else if (thePercentage <=50.99) {System.out.println("student got grade F " + thePercentage + " " + "No Scholarship");}
	 //
		
   //Answer#4:
		//10+20+30+40+50/6
		
		 int [] store5 = {10, 20,30,40,50};
		 double avarage = 0;
				 for (int i=0; i < store5.length; i++){
					 
					 avarage += store5[i];
					 
				 }
				 System.out.println("this is the avr of arrays " + avarage/store5.length);
	

	 //Answer#5:
	
	// 
	
	boolean found = false;
	
	String[] names = {"john", "happy", "peACe", "jOy", "lui", "harry"};
    
	String nameToSearch = "faith";
	
	 for (int i=0; i < names.length; i++) {
		 
		if(nameToSearch.equalsIgnoreCase(names[i]))
	 
 {found = true;
 System.out.println (nameToSearch + " the position " + i);}
	 }
	 
	 if (found == false) {System.out.println(" was not found");}
	 
	 
	 //Answer#6: 
	 //find the position of 33 

		int[] numbers = {11, 22, 33, 44, 55, 98, 65};
		String[] names_1 = {"john", "happy", "peACe", "jOy", "LEarN", "joy", "laugh"};

	   for (int i=0; i < numbers.length;i++)
	   	if (numbers [i]== 33){
			System.out.println(" The position for 33 is in index --> " + i);
			System.out.println(" same index we found 33 = Name_1 index is --> " + names_1 [i]);
			}
	}
}

	

