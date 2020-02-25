import java.util.Arrays;

public class HomeTask2 {

    public static void randomMassive(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2);
        }
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < arr.length; j++){
            if(arr[j] == 0){
                arr[j] = 1;
            }else if(arr[j] == 1){
                arr[j] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void addingNumbersToMassive (int n) {
        int arr[] = new int[n];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
                arr[i] = j;
                j = j +3;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void numbersLessSix (){
        int arr [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < arr.length; i++){
                if(arr[i] < 6){
                    { arr[i] = arr[i] * 2;
                    }
                }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void diagonalNumbers(int k){
        int arr [][] = new int [k][k];
        int start = 0;
        int end = arr.length -1;
        for(int i = 0; i < arr.length; i++) {
            for(int h = 0; h < arr.length; h++){
                if(start == end && i == h){
                    arr[i][h] = 1;
                    start++;
                    end--;
                }
                else if(i == h){
                    arr[i][h] = 1;
                }else if(i == start && h == end){
                    arr[i][h] = 1;
                    start++;
                    end--;
                }
                System.out.print(arr[i][h]);
            }
            System.out.println();
        }
    }
    public static void randomMassiveMaxAndMin(int n) {
        int arr[] = new int[n];
        int max = 0;
        int min = 100;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        for(int j = 0; j < arr.length; j++){
            if(max < arr[j]){
                max = arr[j];
            }
        }
        System.out.println();
        System.out.print("max = " + max);
        for (int h = 0; h < arr.length; h++){
            if(arr[h] < min){
                min = arr[h];
            }
        }
        System.out.println();
        System.out.print("min = " + min);
        System.out.println();
    }
    static boolean summ (int n){
        int arr [] = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3);
            System.out.print(arr[i] + " ");
        }
        if(n % 2 == 0) {
            for (int j = 0; j < arr.length / 2; j++) {
                sum1 = sum1 + arr[j];
            }
            for (int h = arr.length / 2; h < arr.length; h++) {
                sum2 = sum2 + arr[h];
            }
        }else{
            for (int j = 0; j < arr.length / 2 + 1; j++) {
                sum1 = sum1 + arr[j];
            }
            for (int h = arr.length / 2 + 1; h < arr.length; h++) {
                sum2 = sum2 + arr[h];
            }
        }
        System.out.println();
        if(sum1 == sum2){
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }
    }
        static void moveMassive (int a, int n) {
            int arr[] = new int[a];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            if (n > 0) {
                for (int j = (arr.length - 1) - n; j > 0; j--) {
                    arr[j + n] = arr[j];
                }
                arr[0 + n] = arr[0];
                for (int h = 0; h < n; h++) {
                    arr[h] = (int) (Math.random() * 100);
                }
                System.out.println(Arrays.toString(arr));
            }else if(n < 0){
                for (int j = -n; j < arr.length; j++) {
                    arr[j + n] = arr[j];
                }
                for (int h = arr.length - 1; h > (arr.length - 1) + n; h--) {
                    arr[h] = (int) (Math.random() * 100);
                }
                System.out.println(Arrays.toString(arr));
            }
        }

    public static void main(String[] args) {
        randomMassive(8);
        addingNumbersToMassive(8);
        numbersLessSix();
        diagonalNumbers(5);
        randomMassiveMaxAndMin(5);
        summ(7);
        moveMassive(10, -2);
    }
}

