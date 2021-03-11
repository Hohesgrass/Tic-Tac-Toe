import java.util.Scanner;

class ArrayOperations {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int size = data.nextInt();
        int[][] twoDim = new int[size][size];

        for (int i = 0; i < twoDim.length; i++) {
            for (int j = 0; j < twoDim[i].length; j++) {
                twoDim[i][j] = data.nextInt();
            }
        }
        printCorners(twoDim);
    }
    public static void printCorners(int[][] twoDimArray) {
        System.out.print(twoDimArray[0][0] + " ");
        System.out.print(twoDimArray[0][twoDimArray[0].length - 1] + "\n");

        System.out.print(twoDimArray[twoDimArray.length - 1][0] + " ");
        System.out.print(twoDimArray[twoDimArray.length - 1][twoDimArray[twoDimArray.length - 1].length - 1]);
    }
}
