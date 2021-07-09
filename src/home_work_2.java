
public class home_work_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Hello my Name is avi dey please see my home work 1 Below:");
		
		//C -->> F
		double cTemp1 = 35.12;
		double fTemp = cTemp1 * 9/5+32;
		System.out.println("1. Convert C° to F° : " + cTemp1 + "°C =  " + fTemp + "°F");
		
		//C --> K
		
		double kTemp1 = cTemp1 + 273.15;
		System.out.println("2. Convert C° to K° : " + cTemp1 + "°C =  " +  kTemp1 + "°K");
		
		//F --> K
		
		double kTemp2 = (fTemp +459.67)*5/9;
		System.out.println("3. Convert F° to K° : " + fTemp + "°F =  "+kTemp2 + "°K");
		
		// K --> C
		
		double cTemp2 = kTemp2 - 273.15;
		
		System.out.println("4. Convert K° to C° : " + kTemp2 + "°K = "+ cTemp2 + "°C");
		
		// K --> F
		
		double cTemp3 = kTemp2 * 9/5 - 459.67;
		
		System.out.println("5. Convert K° to F° : " + kTemp2 + "°K =  "+ cTemp3 + "°F°");
		
		char firstIntial = 'A';
		char lasrIntial = 'D';
		System.out.println("6. My initials= " + firstIntial + lasrIntial);

	}

}
