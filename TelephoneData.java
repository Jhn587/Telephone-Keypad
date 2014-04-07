import java.util.HashMap;
import java.util.ArrayList;

public class TelephoneData {
	
	private char numberPressed = '0';
	private int numberOfTimes = 0;
	private char charEntered;
	private static char[][] conversionArray = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	private HashMap<Character,ArrayList<Character>> forArrays;
		
	public TelephoneData(char numberPressed, int numberOfTimes){
		this.forArrays = new HashMap<Character, ArrayList<Character>>();
		ArrayList<Character> arrayListOf0 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf1 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf2 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf3 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf4 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf5 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf6 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf7 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf8 = new ArrayList<Character>();
		ArrayList<Character> arrayListOf9 = new ArrayList<Character>();
		
		arrayListOf2.add('a');
		arrayListOf2.add('b');
		arrayListOf2.add('c');
		
		arrayListOf3.add('d');
		arrayListOf3.add('e');
		arrayListOf3.add('f');
		
		arrayListOf4.add('g');
		arrayListOf4.add('h');
		arrayListOf4.add('i');
		
		arrayListOf5.add('j');
		arrayListOf5.add('k');
		arrayListOf5.add('l');
		
		arrayListOf6.add('m');
		arrayListOf6.add('n');
		arrayListOf6.add('o');
		
		arrayListOf7.add('p');
		arrayListOf7.add('q');
		arrayListOf7.add('r');
		arrayListOf7.add('s');
		
		arrayListOf8.add('t');
		arrayListOf8.add('u');
		arrayListOf8.add('v');
		
		arrayListOf9.add('w');
		arrayListOf9.add('x');
		arrayListOf9.add('y');
		arrayListOf9.add('z');
		
		forArrays.put('0', arrayListOf0);
		forArrays.put('1', arrayListOf1);
		forArrays.put('2', arrayListOf2);
		forArrays.put('3', arrayListOf3);
		forArrays.put('4', arrayListOf4);
		forArrays.put('5', arrayListOf5);
		forArrays.put('6', arrayListOf6);
		forArrays.put('7', arrayListOf7);
		forArrays.put('8', arrayListOf8);
		forArrays.put('9', arrayListOf9);
		
	
		this.numberPressed = numberPressed;
		this.numberOfTimes = numberOfTimes-1;
		this.charEntered = convertNumberToChar(this.numberPressed,this.numberOfTimes);
	}
	//Not done yet
	private char convertNumberToChar(char number, int times){
		ArrayList<Character> toGet = this.forArrays.get(number);
		return toGet.get(times%toGet.size());
	}
	
	public String toString(){
		return ""+this.charEntered;
	}
}