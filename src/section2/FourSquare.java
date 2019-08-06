package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot garbage=new Robot();
	void go() { 
		// 4. Make the robot move as fast as possible
garbage.setSpeed(200);
		// 5. Set the pen width to 5
garbage.setPenWidth(5);
garbage.penDown();
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for (int i = 0; i < 100; i++) {
			// 7. Set the pen color to random
	garbage.setRandomPenColor();
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
	garbage.turn(30);
}
	}

	
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			garbage.move(200);
			garbage.turn(30);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



