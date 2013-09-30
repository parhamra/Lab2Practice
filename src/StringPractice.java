
public class StringPractice {

	public static char[] reverseMe(char array[]){
		int size = array.length;
		char temp;
		for(int i = 0; i < size/2; i++){
			temp = array[i];
			array[i] = array[size - i - 1];
			array[size-i-1] = temp;
		}
		
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char array[] = {'a','b','c','d'};
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		reverseMe(array);
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}

}
