import java.io.*;
import java.util.*;

public class Ewa {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("ewa.dat"));
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            int n = in.nextInt();
            in.nextLine();
            double volume = 0;
            while (n-- > 0) {
                String action = in.next();
                if (action.equals("BRING")) {
                    double radius = in.nextDouble();
                    double depth = in.nextDouble();
                    in.nextLine();
                    volume += Math.PI * radius * radius * depth;
                    System.out.printf("%.2f%n", volume);
                }
                else {
                    double eat = in.nextDouble();
                    in.nextLine();
                    volume -= eat;
                    System.out.printf("%.2f%n", volume);
                }
            }
            System.out.println("----------");
        }
    }

    
}
