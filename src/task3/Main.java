package task3;


public class Main {
    public static void main(String[] args) {
        Function<Integer> function = Logic::logic;
        function.get();
    }
}
