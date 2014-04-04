public class DictionaryOfWords {
	
	
	private ArrayList<String> theWords;
	private String toFindAtStart
	private String dictionaryName = "brit-a-z.txt";
	
	
	public DictionaryOfWords(String input){
		this.toFindAtStart = input;
		this.theWords = new ArrayList<String>();
		readInWordsFromFile();
		
	
	
	}
	
	private void readInWordsFromFile(){
		Path path = Paths.get(dictionaryName);
		try(Scanner scanner = new Scanner(path){
			while(scanner.hasNextLine()){
				this.theWords.add(scanner.nextLine());
			}
		}
		
	
	}




}