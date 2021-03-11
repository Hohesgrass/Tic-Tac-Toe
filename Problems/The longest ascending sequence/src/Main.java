import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in).useDelimiter("\n");
        //read String size
        int size = data.nextInt();
        int[] nums = new int[size];

        //read numbers, split numbers
        String numbers = data.next();
        String[] subnums = numbers.split(" ");

        int count = 1;
        int maxCount = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int k = Integer.parseInt(subnums[i]);
            int k1 = Integer.parseInt(subnums[i + 1]);
            if (k <= k1) {
                count++;
            } else if (k > k1) {
                if (count != 0 && count != 1) {
                    maxCount = count;
                }
                count = 1;
            }
        }
        if (count < maxCount) {
            System.out.println(maxCount);
        } else {
            System.out.println(count);
        }
    }
}