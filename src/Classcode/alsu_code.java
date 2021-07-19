package Classcode;

public class alsu_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1
        String sentence_3 = "We all are here to learn programming and testing";

        //extract words in the sentence and get total number of words
        String[] sentence_3Split = sentence_3.split(" ");
        int numberOfWordsInSentence = sentence_3Split.length;

        System.out.println("\nTotal number of words in the sentence is " + numberOfWordsInSentence);

	}

}
