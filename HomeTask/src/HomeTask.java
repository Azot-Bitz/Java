public class HomeTask {
    public static void main(String[] args) {
        //целые:
        byte z = 18; // 256, 1 byte = 8 bit
        short s = 1400; //  65000, 2 byte = 16 bit
        int i = 43900; // 4 byte = 32 bit
        long l = 700000L; // 10 * 19, 8 byte = 64 bit
        // дробные
        float f = 12.89f; // 4 byte 10*8
        double e = -456.80; // 8 byte 10*16

        boolean bool = true || false;

        char ch = 'c';

        System.out.println(dicision(5.5f, 8.6f, 9.9f, 7.9f));
        System.out.println(summ(9, 32));
        positiveOrNegative(-9);
        System.out.println(negative(-7));
        name("John");
        vYear(2020);

    }

    public static float dicision(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean summ(int l, int y) {
        if (l + y > 10 && l + y <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveOrNegative(int v) {
        if (v < 0) {
            System.out.println("Число отрицательное");
        } else if (v >= 0) {
            System.out.println("Число положительное");
        }
    }

    public static boolean negative(int pl) {
        if (pl < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void name(String name) {
        System.out.println("Привет " + name);
    }

    public static void vYear(int g) {

        if (g % 400 == 0) {
            System.out.println("Год високосный");
        } else if(g % 100 == 0) {
            System.out.println("Год не високосный");
        }else if(g % 4 == 0){
            System.out.println("Год високосный");
        }else{
            System.out.println("Год не високосный");
        }
    }
}

