package Day02;

public class FourArithmetic {
    public static void main(String[] args) {
        int a =12, b=2;

        Cal c = new Cal();
        System.out.println("a+b="+c.add(a,b));
        System.out.println("a-b="+c.sub(a,b));
        System.out.println("a*b="+c.fac(a,b));
        System.out.println("a/b="+c.div(a,b));

    }
//    public static void add(int a, int b) {
//        int sum = a + b;
//        System.out.println("a+b=" + sum);
//    }
//
//    public static void sub(int a, int b) {
//        int sum = a - b;
//        System.out.println("a-b=" + sum);
//    }
//
//    public static void fac(int a, int b) {
//        int sum = a * b;
//        System.out.println("a*b=" + sum);
//    }
//
//    public static void div(int a, int b) {
//        double sum = a / b;
//        System.out.println("a/b=" + sum);
//    }
}

class Cal {
    int add(int a, int b) {
        int result = a + b;
        return result;
    }

    int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    int fac(int a, int b) {
        int result = a * b;
        return result;
    }

    int div(int a, int b) {
        double result = a / b;
        return (int) result;
    }
}

