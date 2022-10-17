package task3;

import java.util.Scanner;

public class Logic {
    static Scanner scanner = new Scanner(System.in);
    public static void logic(){
        System.out.println("Введите 1 или 2");
        int n = scanner.nextInt();
        if(n == 1){
            Function function = Logic::revers;
            function.get();
        }else if(n == 2){
            Function function = Logic::factorial;
            function.get();
        }else{
            System.out.println("введено неправильно число");
        }
    }

    public static void factorial(){
        System.out.println("Введите число и он посчитает факториал");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void revers(){
        System.out.println("Введите слово и оно превернёт его");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
