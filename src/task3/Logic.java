package task3;

import java.util.Scanner;

public class Logic {
    static Scanner scanner = new Scanner(System.in);
    public static int logic(){
        System.out.println("Введите 1 или 2");
        int n = scanner.nextInt();
        if(n == 1){
            Function<String> function = Logic::revers;
            String s = function.get();
            function.get();
        }else if(n == 2){
            Function<Integer> function = Logic::factorial;
            function.get();
        }else{
            System.out.println("введено неправильно число");
        }
        return n;
    }

    public static int factorial(){
        System.out.println("Введите число и он посчитает факториал");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }

    public static String revers(){
        System.out.println("Введите слово");
        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        return String.valueOf(stringBuilder);
    }
}
