package task_4;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quantity {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader(args[0]);
        Scanner scanner = new Scanner(file);
        List<Integer> array = new ArrayList<>();
        while (scanner.hasNext()) {
            array.add(scanner.nextInt());
        }

        System.out.println(quantityOfMove(array));
    }

    public static int quantityOfMove(List<Integer> array) {
        int sum = 0;
        for (Integer i : array) {
            sum += i;
        }
        int mid = sum/array.size();
        int count = 0;
        while (true) {
            int check = 0;
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i) > mid) {
                    array.set(i, array.get(i) - 1);
                    count++;
                    check++;
                } else if (array.get(i) < mid){
                    array.set(i, array.get(i) + 1);
                    count++;
                    check++;
                }
            }
            if (check == 0) {
                break;
            }
        }
        return count;
    }
}