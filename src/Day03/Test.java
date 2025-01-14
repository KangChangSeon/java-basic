package Day03;

public class Test {
    public static void main(String[] args) {
        byte bb = 10;
        int ii = bb;
        long ll = ii;
        float ff = ll;
        double dd = ff;

        System.out.printf("%f\n",dd);

        char charValue = 'A';
        int intValue = charValue;
        System.out.println(charValue);
        System.out.println(intValue);

        byte byteValue = 65;
//        char charValue1 = byteValue; // possible lossy conversion from byte to char
        System.out.println(byteValue);
//        System.out.println(charValue1);
    }
}