import java.util.Scanner;

public class ArrayZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Eine Zahl bitte");
        String input = s.nextLine();

        int size = Integer.parseInt(input);

        int[][] arr = new int[size][size];

        // Füllt die erste Zeile mit der Zahl
        for (int i = 0; i < size; i++) {
            arr[0][i] = size;
        }

        // Von der zweiten bis zur vorletzten werden die Zahlen an der richtigen Position eingefügt
        for (int i = 1; i < size - 1; i++) {
            arr[i][size - i - 1] = size;
        }

        // Füllt die letzte Zeile mit der Zahl
        for (int i = 0; i < size; i++) {
            arr[size - 1][i] = size;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(arr[i][j]);
                }
            }

            System.out.println();
        }
    }
}
