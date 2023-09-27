import java.io.*;
import java.util.*;

public class Ishita {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("ishita.dat"));
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            String line = in.nextLine();
            int open = 0;
            int count = 0;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '(') {
                    open++;
                }
                else if (c == ')') {
                    open--;
                }
                if (open == 0) {
                    count++;
                }
            }
            count--;
            if (open != 0) {
                System.out.println(0);
            }
            else {
                System.out.println((int) Math.pow(2, count) - 1);
            }
        }
    }
}
