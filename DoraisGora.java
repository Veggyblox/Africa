import java.util.Scanner;

class DoraisGora {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter a number (n): ");
        int n = scn.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }

        System.out.println("Sum of squares till " + n + " is: " + sum);
    }
}