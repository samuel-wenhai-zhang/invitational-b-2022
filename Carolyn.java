import java.io.*;
import java.util.*;

public class Carolyn {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("carolyn.dat"));
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            String letters = in.nextLine();
            char a = letters.charAt(0);
            char b = letters.charAt(1);
            char curr = a;
            int count = 1;
            if (a < b) {
                while (curr <= b) {
                    String line = "";
                    for (int i = 0; i < count; i++) {
                        line += curr;
                    }
                    System.out.println(line);
                    curr++;
                    count++;
                }
            }
            else {
                while (curr >= b) {
                    String line = "";
                    for (int i = 0; i < count; i++) {
                        line += curr;
                    }
                    System.out.println(line);
                    curr--;
                    count++;
                }
            }
            
        }
    }
}
