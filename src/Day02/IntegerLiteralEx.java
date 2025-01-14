package Day02;

public class IntegerLiteralEx {
    public static void main(String[] args) {
//        // 10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?
//        int x = 0b1011; // 0B1011
//        System.out.println(x);
//
//        // 10진수 11을 8진수로 저장하려고 한다. 어떻게 표현하면 될까?
//        x = 013;
//        System.out.println(x);
//
//        // 10진수 11을 16진수로 저장하려고 한다. 어떻게 표현하면 될까?
//        x = 0xb;
//        System.out.println(x);

        String var1 = Integer.toBinaryString(11);
        String var2 = Integer.toOctalString(134);
        String var3 = Integer.toString(365);
        String var4 = Integer.toHexString(179);

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

        System.out.println(Integer.valueOf(var1,2));
        System.out.println(Integer.valueOf(var2,8));
        System.out.println(Integer.valueOf(var3,10));
        System.out.println(Integer.valueOf(var4,16));
    }
}
