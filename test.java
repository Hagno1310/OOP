import java.util.*;

public class test {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            System.out.println("Test " + t + ":");
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                System.out.println(e.getKey() + " xuat hien " + e.getValue() + " lan");
            }
        }
        sc.close();
    }
}
