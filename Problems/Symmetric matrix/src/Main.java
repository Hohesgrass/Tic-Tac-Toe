import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int size = data.nextInt();
        int[][] twoDim = new int[size][size];
        int count = 0;

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = data.nextInt();
            }
        }

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                if (count >= 6) {
                    System.out.print(twoDim[i][j] + " ");
                }
                count++;
            }
        }

      //  String out = Arrays.deepToString(twoDim);
      //  System.out.println(out);
    }
}