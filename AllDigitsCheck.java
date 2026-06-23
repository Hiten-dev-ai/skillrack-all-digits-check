import java.io.*;

public class AllDigitsCheck {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int mask = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                mask |= 1 << (ch - '0');
            }
        }

        System.out.println(mask == (1 << 10) - 1 ? "YES" : "NO");
    }
}
