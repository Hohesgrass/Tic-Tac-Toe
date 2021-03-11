import java.lang.reflect.Array;
import java.util.Arrays;

class ArrayOperations {
    public static void main(String[] args){
        String out = Arrays.deepToString(createCube());
        System.out.println(out);
    }
    public static int[][][] createCube() {
        int[][][] threeDim = new int[3][3][3];
        int count = 0;
        int temp = 0;
        for (int i = 0; i < threeDim.length; i++) {
            for (int j = 0; j < threeDim[i].length; j++) {
                for (int k = 0; k < threeDim[i][j].length; k++) {
                    threeDim[i][j][k] = count;
                    count++;
                    if (count == 9) {
                        count = 0;
                    }
                }
            }

        }
        return threeDim;
    }
}