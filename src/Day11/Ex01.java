package Day11;

public class Ex01 {
    public static void main(String[] args) {
        // line = { a, b, c } 형태로, a*x + b*y + c = 0 을 의미
        int x = 0;  // 사실상 a
        int y = 0;  // 사실상 b
        int b = 0;  // 사실상 c

        // 2x - y + 4 = 0 에 해당
        int[] line = {2, -1, 4};
        int index = 0;

        // 배열의 각 원소를 순서대로 a, b, c 변수에 배치
        for (int data : line) {
            switch (index) {
                case 0:
                    x = data; // a
                    break;
                case 1:
                    y = data; // b
                    break;
                case 2:
                    b = data; // c
                    break;
            }
            index++;
        }

        // 이제 x=2, y=-1, b=4 라면 식은 2x - 1y + 4 = 0

        // x절편: y=0 대입 => a*x + c=0 => x= -c/a (단, a != 0)
        if (x != 0) {
            double xIntercept = - (double) b / x;
            System.out.println("x절편 = " + xIntercept);
        }

        // y절편: x=0 대입 => b*y + c=0 => y= -c/b (단, b != 0)
        if (y != 0) {
            double yIntercept = - (double) b / y;
            System.out.println("y절편 = " + yIntercept);
        }


    }
}
