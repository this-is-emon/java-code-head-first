public class Loopy{
	public static void main(String[] args){
		int x = 1;
		System.out.println("Before the while loop");
		while(x < 4){
			System.out.println("In the loop: ");
			System.out.println("x : " + x);
			x = x + 1;
		}
		System.out.println("This is out of the loop");
	}
}