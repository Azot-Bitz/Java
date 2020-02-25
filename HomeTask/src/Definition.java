import java.util.Arrays;

public class Definition {
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [][] a = new int[10][12];
        printArr(a);
        int[][] table = new int[3][];
        table[0] = new int[1];
        table[1] = new int[5];
        table[2] = new int[3];
        System.out.print(Arrays.deepToString(table));
    }
}
