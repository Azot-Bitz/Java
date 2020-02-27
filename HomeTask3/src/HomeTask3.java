
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

public class HomeTask3 {

    private static Object ArrayList;

    static void findNumbers(int u) {
        System.out.println("Угадайте число от 0 до 9");
        Random rnd = new Random();
        int count = 0;
        int x = rnd.nextInt(u);
        while (count < 3) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число: ");
            int a = sc.nextInt();
            if (x == a) {
                System.out.println("Вы победили!");
                break;
            } else if (x < a) {
                System.out.println("Загаданное число меньше.");
            } else if (x > a) {
                System.out.println("Загаданное число больше.");
            }
            count++;
            if (count == 3) {
                System.out.println("Вы проиграли.");
            }
        }
        System.out.println("Хотите сыграть еще раз? 1 -да, 2 - нет.");
        Scanner sc1 = new Scanner(System.in);
        int g = sc1.nextInt();
        if(g == 1){
            findNumbers(10);
        }else if(g == 2){
            System.out.println("Конец игры.");
        }
    }
    static void findWords () {
        System.out.println("Отгадайте слово:");
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        int x = rand.nextInt(words.length);
        int count = 0;
        ArrayList <Character> pass = new ArrayList<>();
        while (true) {
            String s = "";
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (words[x].equals(str)) {
                System.out.println("Поздравляю, вы угадали!");
                break;
            } else if (count == 0) {
                System.out.println("Неправильно. Первая подсказка");
                String str1 = words[x];
                char a = str1.charAt(0);
                pass.add(a);
                for(Character ch : pass)
                    s+=ch;
                System.out.println(s + "################");
                count++;
            } else if (count == 1) {
                System.out.println("Неправильно. Вторая подсказка");
                String str1 = words[x];
                char b = str1.charAt(1);
                pass.add(b);
                for(Character ch : pass)
                    s+=ch;
                System.out.println(s + "################");
                count++;
            } else if (count == 2) {
                System.out.println("Неправильно. Третья подсказка");
                String str1 = words[x];
                char c = str1.charAt(2);
                pass.add(c);
                for(Character ch : pass)
                    s+=ch;
                System.out.println(s + "################");
                count++;
            }else if (count == 3){
                System.out.println("Вы проиграли.");
                break;
            }
        }
        System.out.println("Попробовать еще раз? 1 - да, 2 - нет.");
        Scanner j = new Scanner (System.in);
        int y = j.nextInt();
        if(y == 1){
            findWords();
        }else if(y == 2){
            System.out.println("Конец игры.");
        }
    }
    public static void main(String[] args) {
        findNumbers(10);
        findWords();
    }
}
