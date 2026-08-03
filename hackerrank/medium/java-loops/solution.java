import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int q = 0; q < t; q++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int currentSum = a;
            
            for (int i = 0; i < n; i++) {
                currentSum += (1 << i) * b;
                System.out.print(currentSum + " ");
            }
            
            System.out.println();
        }
        
        in.close();
    }
}
