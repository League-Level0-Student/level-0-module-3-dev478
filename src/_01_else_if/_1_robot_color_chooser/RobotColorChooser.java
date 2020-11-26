
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//int varible;
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(10);
	
		//3. Set the pen width to 10
		rob.setPenWidth(0);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200); 

		//4. Ask the user what color pen they would like the robot to draw with
		 String colorSelector = JOptionPane.showInputDialog("Vot color do you wNT????!");
	//5. Use an if/else statement to set the pen color that the user requested
		 if(colorSelector.equalsIgnoreCase("red")) {
			 rob.setPenColor(Color.red);
		 }
			 
		 
		 else {JOptionPane.showMessageDialog(null, "We can only reconizge the colors red orang eyeloow green blue and purple.");}
		 
        //6. If the user doesn't enter anything, choose a random color
		 
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
