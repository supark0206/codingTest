package 배열관련_02.격자판최대합;

import java.util.Scanner;

public class Main {
    public int solution(int cnt, int[][] num){
        int answer = 0;
        int max = 0;

        //가로
        for(int i=0; i<cnt; i++){
            int sum = 0;

            for(int q=0; q<cnt; q++){
                sum += num[i][q];
            }

            if(max < sum){
                max = sum;
            }
        }

        //세로
        for(int i=0; i<cnt; i++){
            int sum = 0;

            for(int q=0; q<cnt; q++){
                sum += num[q][i];
            }

            if(max < sum){
                max = sum;
            }
        }

        //대각선
        int sumA = 0;
        for(int i=0; i<cnt; i++){
            sumA += num[i][i];

            if(max < sumA){
                max = sumA;
            }
        }

        int sumB = 0;
        for(int i=cnt-1; i>=0; i--){
            sumB += num[i][i];

            if(max < sumB){
                max = sumB;
            }
        }

        answer = max;

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[][] num = new int[cnt][cnt];

        for(int i=0; i<cnt; i++){
            for(int q=0; q<cnt; q++){
                num[i][q] = sc.nextInt();
            }
        }

        System.out.println(main.solution(cnt, num));
    }
}
