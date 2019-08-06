package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot garbage = new Robot();
		garbage.setSpeed(100);
		garbage.penDown();
		garbage.move(200);
		garbage.turn(90);
		for (int i = 0; i < 4; i++) {
			garbage.move(200);
			garbage.turn(90);
		}
	}
}
