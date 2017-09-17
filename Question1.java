
public class Question1 {
	
	public static boolean sumOfTwo(int[] a, int[] b, int v ){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				if(a[i] + b[j] == v){
					System.out.println("There is a match for " + v + " and it comes from array a: " + a[i] + ", and array b: " + b[j] );
					return true;
				}
			}
		}
		System.out.println("There are no elements in array a and b that add up to " + v);
		return false;
		
	}
	
	public static void main(String[] args){
		int a[] = {5,2,5,5,3};
		int b[] = {5,3,6,8};
		int v = 7;
		
		sumOfTwo(a,b,v);
	}

}
