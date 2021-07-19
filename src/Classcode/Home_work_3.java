package Classcode;

public class Home_work_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Answer#1:");

String sentence_1 = "Hello how are you?";
	int result_1= sentence_1.length()>=10 ? 100:15;
		System.out.println("result_1 = " + result_1);


		System.out.println("Answer#2:");

String sentence_2 = "We all ARe GOod ProgrAMmer";
	String result_2 = sentence_2.replaceAll("[R,r]", "F");
		System.out.println("result_2 = " + result_2);

	System.out.println("Answer#3:");

String sentence_3 ="ABC Networks";

		
		System.out.println("lenght of sentence_3 = " + sentence_3.length());
		boolean isS3StartWitha=sentence_3.startsWith("a");
		System.out.println("does sentence_3 starts with a ? " + isS3StartWitha);
					
		boolean isEndWithK=sentence_3.toLowerCase().startsWith("K");
		System.out.println("does sentence_3 ends with K ? " + isEndWithK);
		String lastPoint =  sentence_3.toLowerCase().startsWith("a") ? "Media" : "Entertainment";
		System.out.println("Result_3 point 4 = " + lastPoint);

//assined result = 10
//assined result > 10 show 100

		 String sentence = "We all are here to learn programming and testing";
	        // find the length of given string
	        System.out.println("sentence length : " + sentence.length());   // length method from String class
	        // find the length of String WITHOUT using length method from String class
	 
	        
	        		
}

}
