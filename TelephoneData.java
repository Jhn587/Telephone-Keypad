public class TelephoneData {
	
	private int numberPressed = 0;
	private int numberOfTimes = 0;
	private char charEntered;
	private static char[][] conversionArray = {{},{},{a,b,c},{d,e,f},{g,h,i},{j,k,l},{m,n,o},{p,q,r,s},{t,u,v},{w,x,y,z}};
		
	public TelephoneData(int numberPressed, int numberOfTimes){
		this.numberPressed = numberPressed;
		this.numberOfTimes = numberOfTimes
		this.charEntered = convertNumberToChar(this.numberPressed,this.numberOfTimes);
	}
	//Not done yet
	private char convertNumberToChar(int number, int times){
		return TelephoneData.conversionArray[number][times];
	}
	
	public String toString(){
		return ""+this.charEntered;
	}
}