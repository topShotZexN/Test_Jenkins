import java.io.*;

public class LongestPalindromicSubstring {
    public static void main(String[] args)throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.print("Enter a string: ");
        String str = in.readLine();
        int n = str.length(), palindromeBeginsAt = 0, maxLength = 1;
        boolean isPalindrome[][] = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
        }

        for(int i = 0; i < n-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                isPalindrome[i][i+1] = true;
                palindromeBeginsAt = i;
                maxLength = 2;
            }
        }

        for(int currentLength = 3; currentLength <= n; currentLength++) {
            for(int i = 0; i < n - currentLength + 1; i++) {
                int j = i + currentLength - 1;
                if(str.charAt(i) == str.charAt(j) && isPalindrome[i+1][j-1]) {
                    isPalindrome[i][j] = true;
                    palindromeBeginsAt = i;
                    maxLength = currentLength;
                }
            }
        }

        System.out.println("Longest palindromic substring: " + str.substring(palindromeBeginsAt, palindromeBeginsAt + maxLength));

    }
}