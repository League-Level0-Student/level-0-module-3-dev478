
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		int variable;
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(10);
	

		 	 
		rob.setPenWidth(1);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200);
		rob.turn(90);
		rob.move(200); 

		//4. Ask the user what color pen they would like the robot to draw with
		 String colorSelector = JOptionPane.showInputDialog("What color do you want?");
	//5. Use an if/else statement to set the pen color that the user request if(colorSelector.equalsIgnoreCase("red")) {

		
		 
	 
		 if(colorSelector.equalsIgnoreCase("red")) {
			 rob.setPenColor(Color.red);
		 }
		 else if(colorSelector.equalsIgnoreCase("blue")) {
			 rob.setPenColor(Color.blue);
		 }
		 else if(colorSelector.equalsIgnoreCase("green")) {
			 rob.setPenColor(Color.green);
		 }
		 else if(colorSelector.equalsIgnoreCase("yellow")) {
			 rob.setPenColor(Color.yellow);
		 }
		 else if(colorSelector.equalsIgnoreCase("orange")) {
			 rob.setPenColor(Color.orange);
		 }
		 else if(colorSelector.equalsIgnoreCase("magenta")) {
			 rob.setPenColor(Color.magenta);
		 }
		 else if(colorSelector.equalsIgnoreCase("black")) {
			 rob.setPenColor(Color.black);
		 }
		 else  if (colorSelector.equalsIgnoreCase("white")) {
			 rob.setPenColor(Color.white);
		 } 
		 
		 else {JOptionPane.showMessageDialog(null, "We can only recongnize the colors: red, orange, yellow, green, blue, magenta, black, and white.\n We will now choose a random color instead.\n Please check your spelling."
		 );}
		 rob.setPenWidth(0);
			rob.move(200);
			rob.turn(90);
			rob.move(200);
			rob.turn(90);
			rob.move(200);
			rob.turn(90);
			rob.move(200); 
		 //ran = new random;
        //6. If the user doesn't enter anything, choose a random integer form 10 to 100
		 
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
