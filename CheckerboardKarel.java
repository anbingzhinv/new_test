/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){
		for (int i = 0; i < 6; i++) {
			tackOver();
		}
	}

	public void tackOver(){
		if (frontIsClear()) {
			move();
		}else {
			turnLeft();
			if (frontIsClear()) {
				while (rightIsBlocked()) {
					move();
				}
			}
			turnRight();
			move();
			turnRight();
			while (frontIsClear()) {
				move();
			}
			turnLeft();
		}
	}
}
