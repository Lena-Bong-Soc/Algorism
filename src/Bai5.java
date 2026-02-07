import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();
        boolean isPalindrome = false;
        String palindTexString = "";
        if (n < 0) {
            isPalindrome = false;
        } else {
            String[] nString = String.valueOf(n).split("");
            for (int i = nString.length - 1; i >= 0; i--) {
                palindTexString += nString[i];
            }
            if (n == Integer.parseInt(palindTexString)) {
                isPalindrome = true;

            }
        }
        System.out.println(isPalindrome ? "So " + n + " la Palindrome" : "So " + n + " KHONG phai la Palindrome");
        scanner.close();

    }

}
