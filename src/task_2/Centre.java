package task_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Centre {
    static String centreCircle;
    static float radius;
    public static void main(String[] args) throws IOException {
        FileReader circle = new FileReader(args[0]);
        FileReader point = new FileReader(args[1]);
        BufferedReader reader1 = new BufferedReader(circle);
        centreCircle = reader1.readLine();
        radius = Float.parseFloat(reader1.readLine());
        reader1.close();

        List<String> points = new ArrayList<>();
        BufferedReader reader2 = new BufferedReader(point);
        while (reader2.ready()) {
            points.add(reader2.readLine());
        }
        reader2.close();

        for (String s : points) {
            float[] poin = getPoints(s);
            System.out.println(Arrays.toString(poin) + " " + pointLocation(poin[0], poin[1]));
        }

        circle.close();
        point.close();
    }

    public static float[] getPoints(String point) {
        String[] points = point.split(" ");
        float x = Float.parseFloat(points[0]);
        float y = Float.parseFloat(points[1]);
        float[] array = {x, y};
        return array;
    }

    public static String pointLocation(float x, float y) {
        float[] centre = getPoints(centreCircle);
        float result = (float) (Math.pow(x - centre[0], 2) + Math.pow(y - centre[1], 2));
        float doubleRadius = (float) Math.pow(radius, 2);
        if (result == doubleRadius) {
            return "точка лежит на окружности";
        } else if (result > doubleRadius) {
            return "точка снаружи";
        } else {
            return "точка внутри";
        }
    }
}