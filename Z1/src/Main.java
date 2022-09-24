import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Map<Integer, List<String>> mp = new HashMap<>();
            boolean flag = true;
            int x;
            List<String> st = new ArrayList<>();
            while (flag){
                System.out.println("Enter word: ");
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();
                st.add(s);
                System.out.println("Add more? 0 - yes 1 - no");
                x = sc.nextInt();
                flag = x == 0;
            }

            for (String s: st) {
                mp.put(s.length(), st.stream().filter(c -> s.length() == c.length()).toList());
            }
            System.out.println(mp);
        }
        catch (Exception e){
            System.err.println("Error");
        }
    }
}