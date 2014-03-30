public class Driver{
	public static void main(String[] args){
		System.out.println("Dumb phone converter");
		String fromReddit = "7777 666 555 3";
		TelephoneKeypad toTest = new TelephoneKeypad(fromReddit);
		System.out.println(toTest);
	}

}