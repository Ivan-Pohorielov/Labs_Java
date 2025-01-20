package Laba2;

public class Main {

    // Метод для обчислення першого виразу
    public static double calculateFirst(double a, double b, double c, double d) {
        return Math.sqrt(Math.sin(a) - (4 * Math.log(b)) / Math.pow(c, d));
    }

    // Метод для обчислення другого виразу
    public static double calculateSecond(double a, double b, double c, double d) {
        return 2 * Math.log(Math.pow(b, a)) + Math.abs(Math.asin(-Math.sqrt(d / c)));
    }

    // Метод для обчислення третього виразу
    public static double calculateThird(double a, double b, double c, double d) {
        double firstPart = 2 * Math.cos(Math.sqrt(a / b));
        double secondPart = 4 * Math.log(d + Math.sqrt(d * d + 1)); // arsinh(d) = ln(d + sqrt(d^2 + 1))
        return Math.pow(firstPart + secondPart, c);
    }

    public static void main(String[] args) {
        // Вхідні дані для першого виразу
        double a1 = -1.49, b1 = 23.4, c1 = 1.23, d1 = 2.542;
        double y1 = calculateFirst(a1, b1, c1, d1);
        System.out.println("Значення y для першого виразу: " + y1);

        // Вхідні дані для другого виразу
        double a2 = 3.56, b2 = 1.02, c2 = 3, d2 = 2.43;
        double y2 = calculateSecond(a2, b2, c2, d2);
        System.out.println("Значення y для другого виразу: " + y2);

        // Вхідні дані для третього виразу
        double a3 = -2.86, b3 = 1.62, c3 = 10.874, d3 = 2.91;
        double y3 = calculateThird(a3, b3, c3, d3);
        System.out.println("Значення y для третього виразу: " + y3);
    }
}
