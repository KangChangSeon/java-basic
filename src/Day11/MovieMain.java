package Day11;

import Day11.MovieVO;

import java.io.*;
import java.util.Arrays;

public class MovieMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 키보드 입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 콘솔 출력

        bw.write("관리할 영화 개수: ");
        bw.flush();
        int mvNum = Integer.parseInt(br.readLine());

        String[] tmp = {"제목", "러닝타임", "등급"};
        MovieVO[][] mvArr = new MovieVO[mvNum][3];

        for (int i = 0; i < mvNum; i++) {
            for (int j = 0; j < 3; j++) {
                bw.write(tmp[j] + " 입력: ");
                bw.flush();
                String input = br.readLine();


                if (mvArr[i][0] == null) {
                    mvArr[i][0] = new MovieVO();
                }

                switch (j) {
                    case 0 -> mvArr[i][0].setTitle(input);
                    case 1 -> mvArr[i][0].setRunningTime(input);
                    case 2 -> mvArr[i][0].setGrade(input);
                }
            }
            bw.write("입력된 영화 정보: " + mvArr[i][0] + "\n");
            bw.flush();
        }

        bw.write("총 영화 목록: " + Arrays.deepToString(mvArr));
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}
