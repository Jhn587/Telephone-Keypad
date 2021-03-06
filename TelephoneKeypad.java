import java.util.LinkedList;
public class TelephoneKeypad {
	
	
		

	private LinkedList<TelephoneData> theList;
	private String original;
	private String converted = "";
	
	//This classes constructor
	public TelephoneKeypad(String input){
		this.original = input;
		theList = new LinkedList<TelephoneData>();
		populateTheList(this.original);
		converted = convertTheListToAString(this.theList);
	}
	
	private void populateTheList(String toDecode){
		
		int occurances = 0;
		char numberPressed = '0';
		
		//This loop should go through and get each digit and the number of times it was pressed and store it in a linked list
		for(int i = 0; i<toDecode.length(); i++){
			
			//If the char we are at is a space we have gone on to the next letter so store the old one
			//Or if we are at the end of the string
			if(toDecode.charAt(i) == ' '|| (i == toDecode.length()-1)){
				//if we are at the last character we need to make sure it matches and increase the number of occurances
				if(i == toDecode.length()-1 ){
					numberPressed = toDecode.charAt(i);
					occurances++;
				}
				
				TelephoneData toStore = new TelephoneData(numberPressed, occurances);
				this.theList.add(toStore);
				occurances = 0;//reset counter for occurances of the particular number
			} else{
				occurances++;
				numberPressed = toDecode.charAt(i);
				
				
			}
		}
	}
	
	private String convertTheListToAString(LinkedList<TelephoneData> toConvert){
		String toReturn = "";
		for(TelephoneData ele: toConvert){
			toReturn += ele.toString();
		}
		return toReturn;
	}
	
	public String toString(){
		return converted;
	}
	
}