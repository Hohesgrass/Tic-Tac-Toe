import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in).useDelimiter("\n");
        int size = data.nextInt();
        int[] nums = new int[size];

        String numbers = data.next();
        String[] subnums = numbers.split(" ");

        String nm = data.next();
        String[] nms = nm.split(" ");
        int n = Integer.parseInt(nms[0]);
        int m = Integer.parseInt(nms[1]);
        boolean isTrue = false;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                if ((Integer.parseInt(subnums[i]) == n && Integer.parseInt(subnums[i + 1]) == m) || (Integer.parseInt(subnums[i]) == m && Integer.parseInt(subnums[i + 1]) == n)) {
                    isTrue = true;
                }
            }
        }
        System.out.println(isTrue);
    }
}