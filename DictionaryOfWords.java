import java.util.Scanner;
import java.nio.file.*;
import java.util.ArrayList;

public class DictionaryOfWords {
	
	
	private ArrayList<String> theWords;
	private String toFindAtStart;
	private String dictionaryName = "brit-a-z.txt";
	private ArrayList<String> matchedWords;
	
	public DictionaryOfWords(String input){
		this.toFindAtStart = input;
		this.theWords = new ArrayList<String>();
		readInWordsFromFile();
		this.matchedWords = scanAllTheWords(this.theWords, this.toFindAtStart);
	
	
	}
	
	private void readInWordsFromFile(){
		Path path = Paths.get(dictionaryName);
		try(Scanner scanner = new Scanner(path)){
			while(scanner.hasNextLine()){
				this.theWords.add(scanner.nextLine());
			}
		} catch( Exception e) {
		
		}
		
	
	}
	
	private ArrayList<String> scanAllTheWords(ArrayList<String> words, String toLookFor){
		ArrayList<String> toReturn = new ArrayList<String>();
		for(String word:words){
			if(word.startsWith(toLookFor)){
				toReturn.add(word);
			}
		}
		
		return toReturn;
	
	}

	public String toString(){
		String toReturn = "";
		for(String word: matchedWords){
			toReturn += word + "\n";
		}
		
		return toReturn;
	}

}