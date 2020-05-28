package _03_method_writing._1_obedient_robot;

import javax.activation.MailcapCommandMap;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class turkishdelight {
	public static void main(String[] args) {
	
		
	String intput= JOptionPane.showInputDialog("what shape would you like. I have circles, square and triangles. dont want that? go somewhere else");	
		if (intput.equals("circle")) {
			drawCircle();
		}
		
		else if (intput.equals("square")) {
			drawSquare();
		}
	
		else if (intput.equals("triangle")) {
			drawTriangle();
		}
		
		
		
		
	}
	
	public static void drawCircle() {
		Robot duncas = new Robot();
		duncas.setSpeed(500);
		duncas.penDown();
		for (int i=0; i<360; i++) {
			
			duncas.move(1);
			duncas.turn(1);
		}
		
	}
	
	public static void drawTriangle() {
		Robot duncas = new Robot();
		duncas.penDown();
		duncas.setSpeed(100);
		duncas.move(100);
		duncas.turn(120);
		duncas.move(100);
		duncas.turn(120);
		duncas.move(100);
		duncas.turn(120);
		
	}
	
	public static void drawSquare() {
		Robot duncas = new Robot();
		duncas.penDown();
		duncas.setSpeed(100);
		duncas.move(100);
		duncas.turn(90);
		duncas.move(100);
		duncas.turn(90);
		duncas.move(100);
		duncas.turn(90);
		duncas.move(100);
		duncas.turn(90);
		}
}
