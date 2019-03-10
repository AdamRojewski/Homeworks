package JVMProject;

import java.util.ArrayList;

public class JVMArray {

    private static ArrayList<Integer> numbers;

    public static void main(String[] args) throws InterruptedException {
        newArray();
        anotherArray();
        ArrayList();
        MaxIntegerList();

    }

    private static void newArray() {
        int sum = 0;
        int[] table = new int[3];

        for (int i = 0; i < table.length; i++) {
            table[i] = i + 1;
            sum = sum + table[i];

        }
        System.out.println("the sum is " + sum);

    }

    private static void anotherArray() {
        int[] table = new int[10];
        for (int i = 0; i < table.length; i++) table[i] = i + 1;
        int sum = 0;
        for (int e : table) sum += e;
        System.out.println("the sum is " + sum);
    }

    private static void ArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("The sum is " + sum);

    }

    private static void MaxIntegerList() throws InterruptedException {

        JVMArray.numbers = new ArrayList<>();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            numbers.add(i);
            Thread.sleep(10);
            if (i % 1000 == 0){
                System.gc();
                System.out.println("GC");
            }
        }

        System.out.println(numbers.size());

    }
}

