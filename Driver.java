import javax.swing.JOptionPane;
public class Driver{
	public static void main(String[] args){
		System.out.println("Dumb phone converter");
		String fromReddit = "7777 666 555 3";
		TelephoneKeypad toTest = new TelephoneKeypad(fromReddit);
		System.out.println(toTest);
		//int d = 5;
		JOptionPane.showMessageDialog ( null, toTest ); 
		String d = JOptionPane.showInputDialog(null, "enter an int");
	}

}