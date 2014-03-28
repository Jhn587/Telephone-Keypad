import java.util.LinkedList;
public class TelephoneKeypad {
	
	public class TelephoneData{
		private int numberPressed = 0;
		private int numberOfTimes = 0;
		private char charEntered;
		
		public class TelephoneData(int numberPressed, int numberOfTimes){
			this.numberPressed = numberPressed;
			this.numberOfTimes = numberOfTimes
			this.charEntered = convertNumberToChar(this.numberPressed,this.numberOfTimes);
		}
		//Not done yet
		private char convertNumberToChar(int number, int times){
			return null;
		}
	
	}

	private LinkedList<TelephoneData> theList;
	private String original;
	
	//This classes constructor
	public TelephoneKeypad(String input){
		theList = new LinkedList<TelephoneData>();
		populateTheList(this.original);
	}
	
	private void populateTheList(String toDecode){
		
		int occurances = 0;
		int numberPressed = 0;
		
		//This loop should go through and get each digit and the number of times it was pressed and store it in a linked list
		for(int i = 0; i<toDecode.length(); i++){
			//If the char we are at is a space we have gone on to the next letter so store the old one
			//Or if we are at the end of the string
			if(toDecode.charAt(i) == ' '|| (i == toDecode.length()-1)){
				//if we are at the last character we need to make sure it matches and increase the number of occurances
				if(i == toDecode.length()-1 && toDecode.charAt(i)==Character.parseChar(numberPressed)){
					occurances++;
				}
				TelephoneData toStore = new TelephoneData(occurances, numberPressed);
				this.theList.add(toStore);
				occurances = 0;//reset counter for occurances of the particular number
			} else{
				occurances++;
				numberPressed = Integer.parseInt(toDecode.charAt(i));
			}
		}
	}
}