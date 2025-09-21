package Week_5;

public class Pattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int count = Math.min(i, 5);

            for (int space = 1; space <= (5 - count); space++) {
                System.out.print(" ");
            }

            for (int num = 1; num <= count; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}