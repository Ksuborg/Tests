package task_1;

public class Circle {
    public static int[] mainArray;
    public static int index;
    public static void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int circle = Integer.parseInt(args[1]);
        mainArray = new int[length];
        for (int i = 0; i < length; i++) {
            mainArray[i] = i + 1;
        }

        int[] interval = circle(mainArray, circle, index);
        while (checkInterval(interval)) {
            System.out.print(interval[0]);
            interval = circle(mainArray,  circle, index);
        }
        System.out.println(interval[0]);

    }

    public static int[] circle(int[] array, int circle, int start) {
        int[] interval = new int[circle];
        int count = 0;
        for (int i = start; count < circle; i++) {
            if(i > array.length - 1) {
                i = 0;
            }
            interval[count] = array[i];
            index = i;
            count++;
        }
        return interval;
    }

    public static boolean checkInterval(int[] array) {
        return array[array.length - 1] != mainArray[0];
    }
}