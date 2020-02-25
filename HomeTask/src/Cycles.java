

public class Cycles {

    //show digits from 1 to n
    static void showDigits(int n) {
        int start = 1;
        do {
            System.out.print(start + " ");
            start++;
        } while (start <= n);
    }

    static void showDigitsFor(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }

    //()(())((())), n = 3
    static void showBrackets(int n) {
        //n = 5
        //0 1 2 3 4
        for (int i = 0; i < n; i++) {
            //i = 0 -> j = 0
            //i = 1 -> j = 0 1
            //i = 2 -> j = 0 1 2
            //i = 3 -> j = 0 1 2 3
            for (int j = 0; j < i + 1; j++) {
                System.out.print('(');
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print(')');
            }
        }
    }

    //4(A)5(B) = AAAABBBBB
    //ABC
    // int [] a = new int[]{1, 2, 3, 4, 5}
    // a[0] = 1, a[1] = 2, a[2] = 3 ...a[4] = 5
    // a.length = 5
    //7(2(12(af))3(a4(b))) - difficult decompression ***
    static void decompress(char[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '1' && str[i] <= '9') {
                int count = str[i] - '0'; //'a' = 97, 'b' = 98, 'b'-'a'=1
                i += 2;
                char sym = str[i];
                for (int j = 0; j < count; j++) {
                    System.out.print(sym);
                }
                i++;
            } else {
                System.out.print(str[i]);
            }
        }
    }

    //n * n
    static void multiplyTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }

    //()(())(   (()))(((()))), n = 7
    //()(())((()))(((()
    static void showNBrackets(int n) {
        if (n == 0) return;
        int start = 1, counter = 0;
        boolean running = true;
        while (running) {
            for (int i = 0; i < start; i++) {
                System.out.print('(');
                counter++;
                if (counter == n) {
                    running = false;
                    break;
                }
            }
            if (running) {
                for (int i = 0; i < start; i++) {
                    System.out.print(')');
                    counter++;
                    if (counter == n) {
                        running = false;
                        break;
                    }
                }
            }
            start++;
        }
    }

    static void showSym(char sym, int count) {
        if (count < 0) return;
        for (int i = 0; i < count; i++) {
            System.out.print(sym);
        }
    }

    //()(())((())), n = 7
    //|1(6)5|2((3))1|3
    static void showNBrackets1(int n) {
        if (n == 0) return;
        int start = 1;
        while (true) {
            if (n - start <= 0) {
                showSym('(', n);
                return;
            }
            showSym('(', start);
            n -= start; // n = 2
            if (n - start <= 0) {
                showSym(')', n);
                return;
            }
            showSym(')', start);
            n -= start;
            start++;
        }
    }

    static void showBracketsRec(int start, int n) {
        if (n < start) {
            showSym('(', n);
            return;
        }
        showSym('(', start);
        n -= start;
        if (n < start) {
            showSym(')', n);
            return;
        }
        showSym(')', start);
        showBracketsRec(start + 1, n - start); //start = 2, 7 - 2 foo(2, 5) -> foo(3, 3)
    }

    //f(5) -> 5 -> f(4) -> 4 -> f(3)
    static void simpleRec(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        simpleRec(n-1);
    }

    /* ..*..
       .***.
    *  *****
    *  .***.
       ..*..
    * */
    static char [][] brilliant(int n) {
        if (n % 2 == 1) {
            char [][] t = new char[n][n];
            int start = 1;
            //5 / 2 = 2 + 1
            for (int i = 0; i <= n / 2; i++) {
                for (int j = 0; j < (n - start) / 2; j++) {
                    t[i][j] = '.';
                }
                for (int j = (n - start) / 2;
                     j < (n - start) / 2 + start; j++) {
                    t[i][j] = '*';
                }
                for (int j = (n - start) / 2 + start;
                     j < n; j++) {
                    t[i][j] = '.';
                }
                start+=2;
            }
            start-=4;
            for (int i = n / 2 + 1; i < n; i++) {
                for (int j = 0; j < (n - start) / 2; j++) {
                    t[i][j] = '.';
                }
                for (int j = (n - start) / 2;
                     j < (n - start) / 2 + start; j++) {
                    t[i][j] = '*';
                }
                for (int j = (n - start) / 2 + start;
                     j < n; j++) {
                    t[i][j] = '.';
                }
                start-=2;
            }
            return t;
        }
        return null;
    }

    public static void main(String[] args) {
//        char [][] ans = brilliant(15);
//        for (int i = 0; i < ans.length; i++) {
//            for (int j = 0; j < ans.length; j++) {
//                System.out.print(ans[i][j] + " ");
//            }
//            System.out.println();
//        }
        char [] f = new char[] {'4','a','5','b'};
        decompress(f);
    }
}
