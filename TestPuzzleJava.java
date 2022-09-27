import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
        ArrayList<String> randomPasswords = generator.getNewPasswordSet(8);
		// System.out.println(randomRolls);
		
        // System.out.println(generator.getRandomLetter());
        // System.out.println(generator.generatePassword());
        // System.out.println(randomPasswords);
    	//..
		// Write your other test cases here.
		//..
	}
}
