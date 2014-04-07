import javax.swing.JOptionPane;
public class Driver{
	public static void main(String[] args){
		System.out.println("Dumb phone converter");
		//String fromReddit = "7777 666 555 3";
		//TelephoneKeypad toTest = new TelephoneKeypad(fromReddit);
		//System.out.println(toTest);
		//int d = 5;
		
		//DictionaryOfWords hope = new DictionaryOfWords(toTest.toString());
		//JOptionPane.showMessageDialog ( null, toTest.toString() ); 
		String d = JOptionPane.showInputDialog(null, "Enter sequence of numbers to convert");
		TelephoneKeypad fromGui = new TelephoneKeypad(d);
		
		DictionaryOfWords fromUser = new DictionaryOfWords(fromGui.toString());
		JOptionPane.showMessageDialog( null, fromGui );
		JOptionPane.showMessageDialog( null, fromUser );
	}

}