import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = 0;

        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please insert an Integer between 3 and 10000.");
        }

        if (n < 3 || n >= 10000) throw new IllegalArgumentException("Integer value out of scope!");

        print(n);
    }

    private static void print(int n) {
        for (int row = 0; row < n + 1; row++) {
            printM(n, row);
            printM(n, row);

            System.out.println();
        }
    }

    private static void printM(int n, int row) { // 'M' -> divided in 5 parts with length equal to N
        writeBeginning(n, row);
        writeSndNForth(n, row);
        writeMiddle(n, row);
        writeSndNForth(n, row);
        writeEnd(n, row);
    }

    private static void writeSndNForth(int n, int row) {
        for (int col = 0; col < n; col++) {
            if (col >= row) {
                System.out.print("*");
            } else if (col + row <= n - 1) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
    }

    private static void writeMiddle(int n, int row) {
        for (int col = 0; col < n; col++) {
            if (col < row) {
                System.out.print("*");
            } else if (col + row >= n) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
    }

    private static void writeBeginning(int n, int row) {
       /* for (int col = n; col > 0; col--) { // col -> number of -
            if (col > row) {
                System.out.print("-");
            } else {
                System.out.print("*");
            }
        }*/

        for (int col = 0; col < n; col++) {
            if (col + row < n) {
                System.out.print("-");
            } else {
                System.out.print("*");
            }
        }
    }

    private static void writeEnd(int n, int row) {
        for (int col = 0; col < n; col++) {
            if (col < row) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
    }
}
