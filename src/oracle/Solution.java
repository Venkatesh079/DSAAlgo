package oracle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static class Point {
        int X;
        int Y;

        Point(int X, int Y) {
            this.X = X;
            this.Y = Y;
        }

        public static double distance(Point p1, Point p2) {
            return Math.sqrt(Math.pow(p1.X - p2.X, 2) + Math.pow(p1.Y - p2.Y, 2));
        }
    }

    public static void main(String[] args) {
        Point p0 = new Point(0, 0);
        Point p1 = new Point(3, 1);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(0, 3);
        Point p4 = new Point(3, 3);
        Point p5 = new Point(3, 4);

        double k = 3.0;

        List<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        points.add(p5);

        List<Double> nearestPoints = points.stream()
                .map(point -> Point.distance(p0, point))
                .filter(distance -> distance <= k)
                .toList();

        nearestPoints.forEach(System.out::println);
    }
}
