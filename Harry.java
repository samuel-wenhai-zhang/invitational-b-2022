import java.io.*;
import java.util.*;

public class Harry {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("harry.dat"));
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            String a = in.next();
            String b = in.next();
            ArrayList<Character> as = new ArrayList<Character>();
            ArrayList<Character> bs = new ArrayList<Character>();
            for (char c : a.toCharArray()) {
                as.add(c);
            }
            for (char c : b.toCharArray()) {
                bs.add(c);
            }
            as.removeAll(bs);
            if (as.size() == 0) {
                System.out.println("ALL LETTERS ARE GONE");
            }
            else {
                for (char c : as) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
    }
}
