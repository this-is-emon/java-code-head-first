public class BottleSong{
	public static void main(String[] args){
		int bottleNum = 10;
		String word = "bottles";
		
		while(bottleNum > 0){
			
			if(bottleNum == 1){
				
				word = "bottle";
				
				System.out.println(bottleNum + " green " + word + ", hanging on the wall");
				System.out.println(bottleNum + " green " + word + ", hanging on the wall");
				System.out.println("And if one green bottle should accidentally fall,");
			}
			
			if(bottleNum > 0){
					System.out.println("There'll be " + bottleNum + " green " + word + ", hanging on the wall");
			} else{
				System.out.println("There'll be no green bottles, hanging on the wall");
			}
			
			bottleNum = bottleNum - 1;
			
		}
	}
}