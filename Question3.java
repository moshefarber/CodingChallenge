
public class Question3 {
	
	public static void getClosingParen(String sentence, int openingParenIndex) {
		
		char[] charArray = sentence.toCharArray();
		int counter = 1; //counts the matching opening and closing parens
		int closingParenIndex = openingParenIndex;
		
		while(counter > 0) {
			char c = charArray[++closingParenIndex];
			if(c == '(') {
				counter++;
			}
			else if(c == ')') {
				counter--;
			}
		}//end while
		
		System.out.println(closingParenIndex);
	}

	public static void main(String[] args) {
		String sentence = "Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		int openingParenIndex = 10;
		
		getClosingParen(sentence, openingParenIndex);

	}

}
