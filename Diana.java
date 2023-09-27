import java.io.*;
import java.util.*;

public class Diana {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("diana.dat"));
        while (in.hasNextLine()) {
            double x1 = in.nextDouble(), y1 = in.nextDouble(), z1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble(), z2 = in.nextDouble();
            in.nextLine();
            double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) + Math.pow(z2-z1, 2));
            System.out.printf("%.2f%n", distance);
        }
    }

}
