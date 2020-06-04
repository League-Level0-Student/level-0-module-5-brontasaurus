package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String poet = JOptionPane.showInputDialog("what pet do you want. we have dogs, puppys, 101 dalmations, dogs,\n and did i mention dogs? (if you want a fish then get out)");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i <78; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "pick one", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water", "take a walk", "groom", "clean poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.

			if (task == 0) {
				callCuddle();
			}
			if (task == 1) {
				callFood();
			}
			if (task == 2) {
				callWater();
			}
			if (task == 3) {
				callWalk();
			}
			if (task == 4) {
				callGroom();
			}
			if (task == 5) {
				callPoop();
			}
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel >= 25) {
	JOptionPane.showMessageDialog(null, "wow you can actually care for another living being. i guess good job but idk.");
	break;
}
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
public static void callCuddle() {
	happinessLevel += 2;
	JOptionPane.showMessageDialog(null, "your dog licks your face... ewwwww");
}
	
public static void callFood() {
	happinessLevel += 10;
	JOptionPane.showMessageDialog(null, "your dog gains 34 pounds. maybe he should cut down on the burgers");
}	

public static void callWater() {
	happinessLevel += -10;
	JOptionPane.showMessageDialog(null, "glub glub your dog drowns");
}
	
public static void callWalk() {
	happinessLevel += 3;
	JOptionPane.showMessageDialog(null, "your dog ran away. good luck finding him");
}	

public static void callGroom() {
	happinessLevel += -1;
	JOptionPane.showMessageDialog(null, "what IS that? a hairless dog?");
}

public static void callPoop() {
	happinessLevel += -2;
	JOptionPane.showMessageDialog(null, "this is gross. orange.");
}
	
	
	
	
	
}






