public class Weird {
    public static void main(String[] args) {
		System.out.println(mystery(6));
    }   
    
    static int mystery(int n){
		if(n <= 0){
			return 10;
		} else {
			return n + mystery(n-1);
		}
	}
}