package section2;

import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class TriangleShell {

	// 1. Create a new Robot
	Robot bob = new Robot();

	void go() {
		bob.penDown();
		// 3. delete this line (used only for testing)
bob.setSpeed(200);
		// 6. Make the robot go as fast as possible
	
		
		// 4. make a variable to hold the length of the triangle and set it to 50
		int triLength = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {
			// 9. Change the color of the pen to a random color
			bob.setRandomPenColor();
			// 8. Increase the length variable by 10
			triLength += 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(triLength);
			// 10. Turn the robot 6 degrees to the right
			bob.turn(6);

		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
for(int i=0;i<3;i++) {
	bob.move(length);
	bob.turn(360/3);
}
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
