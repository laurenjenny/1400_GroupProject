package groupProject;

import java.util.Random;

public class Dice {
	Random rand = new Random();
	
	public int rollDie(){
		int dieNum = rand.nextInt(5) + 1;
		return dieNum;
	}
}
