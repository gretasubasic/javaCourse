package arrOfObjs;

public class Main {

	public static void main(String[] args) {
		
		//Food[] refrigirator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hot-dog");
		
//		refrigirator[0] = food1;
//		refrigirator[1] = food2;
//		refrigirator[2] = food3;
		
		Food[] refrigirator = {food1, food2, food3};
		
		// --> remember that this returns the array where this object is in computers memory 
		
		System.out.println(refrigirator[0]);
		
		// this prints out where food1 is located in memory
		
		
		System.out.println(refrigirator[0].name);
		System.out.println(refrigirator[1].name);
		System.out.println(refrigirator[2].name);




	}

}
