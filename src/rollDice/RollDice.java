package rollDice;

import java.util.Random;

public class RollDice {
	Random random;
	int number = 0;
	
	
	RollDice(){
		random = new Random();
		
		roll();
	}
	
	void roll() {
		number = random.nextInt(6) + 1;
		System.out.println(number);
	}

}
