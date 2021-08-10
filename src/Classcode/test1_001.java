package Classcode;

public class test1_001 {

	public static void ticketingSystem (int speedLimit) {

		 int speedLimit1 = 80;
		 int point=0;
		 int everyOverSpeedLimit = speedLimit - speedLimit1;
		 int pointOverSpeed= 5;

		if (everyOverSpeedLimit >=pointOverSpeed ) {
			point = everyOverSpeedLimit / pointOverSpeed;
			if (point < 12) {
				System.out.println("user speed = " + speedLimit + " ; " + point + " Points");
			} else {
				System.out.println("user speed = " + speedLimit + " ; " + point + " License suspended");
			}
		}
		else {
			System.out.println("user speed = " + speedLimit + " ; " + point + " Thank you for driving within the speed limit");

			}

		}
	    




	public static int[] removingIntFromArray (int[] inputNumber,int findArrayIndex){
		int indexCount = 0;
		for (int i : inputNumber){
			if (i == findArrayIndex){
				indexCount++;
			}
		}
		int[] removeArray = new int[inputNumber.length - indexCount];
		int j = 0;
		for (int k = 0; k < inputNumber.length && j < inputNumber.length - indexCount; k++){
			if (findArrayIndex != inputNumber[k]){
				removeArray[j] = inputNumber[k];
				j++;
			}

		}

		return removeArray;

	}
}