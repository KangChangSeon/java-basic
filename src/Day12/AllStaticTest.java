package Day12;

class AllStatic{
    private AllStatic(){}
    public static int hap(int a, int b){return a + b;}
}
public class AllStaticTest {
    public static void main(String[] args) {
//        AllStatic st = new AllStatic();
        System.out.println(AllStatic.hap(1, 2));

    }
}
