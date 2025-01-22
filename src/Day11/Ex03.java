package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("arr1 행렬을 입력하세요 (예: [[1, 4], [3, 2], [4, 1]] ):");
        String arr1Input = sc.nextLine().trim();

        System.out.println("arr2 행렬을 입력하세요 (예: [[3, 3], [3, 3]] ):");
        String arr2Input = sc.nextLine().trim();

        int[][] arr1 = parse2DArray(arr1Input);
        int[][] arr2 = parse2DArray(arr2Input);

        int[][] result = multiply(arr1, arr2);

        System.out.println("=== arr1 x arr2 결과 ===");
        print2DArray(result);
    }

    public static int[][] parse2DArray(String input) {
        String str = input.trim();
        if (!str.startsWith("[[") || !str.endsWith("]]")) {
            throw new IllegalArgumentException("2차원 배열 형태가 아님: " + str);
        }
        str = str.substring(2, str.length() - 2).trim();

        String[] rowStrings = str.split("\\],");

        List<int[]> rowList = new ArrayList<>();
        for (String rowStr : rowStrings) {
            rowStr = rowStr.replace("[", "")
                    .replace("]", "")
                    .trim();

            String[] nums = rowStr.split(",");
            int[] row = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                row[i] = Integer.parseInt(nums[i].trim());
            }
            rowList.add(row);
        }

        int[][] result = new int[rowList.size()][];
        for (int i = 0; i < rowList.size(); i++) {
            result[i] = rowList.get(i);
        }

        return result;
    }

    public static int[][] multiply(int[][] arr1, int[][] arr2) {
        int n = arr1.length;
        int m = arr1[0].length;
        int m2 = arr2.length;
        int k = arr2[0].length;

        if (m != m2) {
            throw new IllegalArgumentException("행렬 곱셈 불가: arr1의 열수(" + m + ") != arr2의 행수(" + m2 + ")");
        }

        int[][] result = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                int sum = 0;
                for (int x = 0; x < m; x++) {
                    sum += arr1[i][x] * arr2[x][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    private static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
