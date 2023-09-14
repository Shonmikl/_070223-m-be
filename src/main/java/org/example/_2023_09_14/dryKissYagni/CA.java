package org.example._2023_09_14.dryKissYagni;

public class CA {
    public double calculateArea(int shapeType, double... params) {
        if (shapeType == 1) { // 1 - круг
            double radius = params[0];
            return Math.PI * radius * radius;
        } else if (shapeType == 2) { // 2 - квадрат
            double side = params[0];
            return side * side;
        } else if (shapeType == 3) { // 3 - треугольник
            double a = params[0];
            double b = params[1];
            double c = params[2];
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0.0;
    }
}