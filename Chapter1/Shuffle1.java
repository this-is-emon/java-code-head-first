public class Shuffle1{
	public static void main(String[] args){
		int x = 3;
		
		while(x > 0){
			if(x == 3){
				System.out.print("a-b");
				System.out.print(" ");
			};
			
			if(x == 2){
				System.out.print("c");
				System.out.print("-");
			}
			
			if(x == 1){
				System.out.print("d");
			}
			
			x = x - 1;
		}
	}
}

//a-b c-d