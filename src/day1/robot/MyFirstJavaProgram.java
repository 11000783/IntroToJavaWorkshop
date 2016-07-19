package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
 Robot Flou = new Robot(); 
Flou.setSpeed(6);
 	Flou.penDown();	
 	Flou.setPenColor(Color.PINK);
 	for (int i = 0; i < 4; i++) {
 		Flou.move(250);
 		Flou.turn(90);
		
	}
    //Flou.move(100);
    //Flou.turn(90);	
    //Flou.setPenColor(Color.CYAN);
    //Flou.move(100);
    //Flou.turn(90);   
    //Flou.setPenColor(Color.GREEN);
    //Flou.turn(90);
    //Flou.move(100);
		
	}
}

