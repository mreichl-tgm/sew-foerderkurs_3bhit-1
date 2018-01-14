import java.util.Scanner;

public class ArrayX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        int min = 3;
        int max = 99;

        while (true) {
            System.out.println("Eine Zahl bitte!");

            n = Integer.parseInt(s.nextLine());

            if (n >= min && n <= max && (n % 2) != 0) {
                System.out.println("Hallo");
                break;
            }
        }

        int[][] array = new int[n][n];

        // Fülle Array mit der Zahl x
        for (int i = 0; i < n; i++) {
            array[i][i] = n;
            array[i][n - i - 1] = n;
        }

        // Gibt den oberen Rahmen aus
        System.out.print("0");
        for (int i = 0; i < n; i++) {
            System.out.print("!");
        }
        System.out.println("0");

        // Ausgabe Zeilen
        for (int i =0; i<array.length; i++){
            System.out.print("+");

            // Ausgabe Spalten
            for (int j=0; j<array.length; j++){
                if(array[i][j]==0){
                    System.out.print(" ");
                } else {
                    System.out.print(array[i][j]);
                }
            }

            System.out.println("+");
        }

        // Ausgabe des unteren Rahmens
        System.out.print("0");
        for (int i = 0; i < n; i++) {
            System.out.print("!");
        }
        System.out.print("0");
    }
}