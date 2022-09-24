import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Short> list = new ArrayList<>();
        boolean flag = true;
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            try {
                System.out.println("Enter number: ");
                x = sc.nextInt();
                list.add((short) x);
                System.out.println("Add more? 0 - yes 1 - no");
                y = sc.nextInt();
                flag = y == 0;
            }
            catch (Exception e) {
                System.err.println("Error");
                break;
            }
        }
        Set<Integer> set = list.stream().filter(c-> c>10).map(c->c+15).collect(Collectors.toSet());
        System.out.println("Result: " + set);
    }
}
