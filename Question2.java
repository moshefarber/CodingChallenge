
public class Question2 {
	
	private static String stringReformatting(String s, int k) {
		
		String dashesRemoved = s.replaceAll("\\-", ""); //first remove the existing dashes
		StringBuilder builder = new StringBuilder(dashesRemoved);
		
		for(int i = k; i < dashesRemoved.length(); i=i+k){
			builder.insert(dashesRemoved.length()-i , '-');
		}
		
		String dashesIncluded = builder.toString();
		System.out.println(dashesIncluded);
		return dashesIncluded;
		
	}
	
	
	public static void main(String[] args){
		String s = "2-4a0r7-4k";
		int k = 3;
		stringReformatting(s, k);
	}
	
}
