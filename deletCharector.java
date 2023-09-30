import java.util.Scanner;

public class deletCharector {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String a = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                continue;
            } else {
                a = a + email.charAt(i);
            }
        }
        System.out.println(a);
    }
}
