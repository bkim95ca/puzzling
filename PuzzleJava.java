import java.util.Random;
import java.util.*;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            Random num = new Random();
            randNums.add(num.nextInt(20));
        }
        return randNums;
    }
    
    public char getRandomLetter() {
            Random character = new Random();
            char c = (char)('a' + character.nextInt(26));
            return c;
    }

    public String generatePassword() {
        String password = "";
        for (int i=0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        String password = "";
        for (int i=0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}
