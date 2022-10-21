package java_fundamentals.task3;

public class Main {

    public static void main(String[] args) {
        double fValue = 0;
        double sValue = 2.1;
        double step = 0.15;

        calculateTg(fValue, sValue, step);
    }

    static void calculateTg(double a, double b, double h) {
        double x = a;
        while (x <= b) {
            double f = Math.tan(x);
            System.out.printf("x: %f, f: %f \n", x, f);
            x += h;
        }
    }
}
