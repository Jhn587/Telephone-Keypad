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
	public TelephoneKeypad(String input){
		theList = new LinkedList<TelephoneData>();
		populateTheList(this.original);
	}
	
	private void populateTheList(String toDecode){
		
		int occurances = 0;
		int numberPressed = 0;
		for(int i = 0; i<toDecode.length(); i++){
			if(
		}
	}
}