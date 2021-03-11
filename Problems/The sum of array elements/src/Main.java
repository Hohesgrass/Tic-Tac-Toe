import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in).useDelimiter("\n");
        int size = data.nextInt();
        int[] nums = new int[size];
        String numbers = data.next();
        String[] subnums = numbers.split(" ");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Integer.parseInt(subnums[i]);
        }
        System.out.println(sum);
    }
}