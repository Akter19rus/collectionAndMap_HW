import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void printOddNums(ArrayList<Integer> num) {
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 != 0) {
                System.out.println(num.get(i));
            }
        }
    }

    public static void printEvenNums(ArrayList<Integer> num) {
        Collections.sort(num);
        int check = Collections.min(num);
        for (int i : num) {
            if (i % 2 == 0 && i != check) {
                check = i;
                System.out.println(i);
            }
        }
    }

    public static void printUniqueWords(ArrayList<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void printAmoutDuplicate(ArrayList<String> words) {
        Map<String, Integer> key = new HashMap<>();
        for (String i : words) {
            if (!key.containsKey(i)) {
                key.put(i, 1);
            }else {
                key.put(i, Integer.valueOf(key.get(i) + 1));
            }
        }
        System.out.println(key);
    }

    public static void task1() {
        System.out.println("    Задача первая!");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNums((ArrayList<Integer>) nums);
    }

    public static void task2() {
        System.out.println("    Задача вторая!");
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 2, 3, 4, 4, 5, 6, 7));
        printEvenNums((ArrayList<Integer>) nums);
    }

    public static void task3() {
        System.out.println("    Задача третья!");
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printUniqueWords((ArrayList<String>) strings);
    }

    public static void task4() {
        System.out.println("     Задача четвертая!");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "три", "три", "три"));
        printAmoutDuplicate((ArrayList<String>) strings);
    }
}


