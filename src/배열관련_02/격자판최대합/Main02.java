package 배열관련_02.격자판최대합;

import java.util.Scanner;

public class Main02 {
    public int solution(int cnt, int[][] num){
        int answer = 0;
        int sum1, sum2;
        for(int i=0;i<cnt;i++){
            sum1=sum2=0;
            for(int j=0; j<cnt; j++){
                sum1+=num[i][j];
                sum2+=num[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1=sum2=0;
        for(int i=0;i<cnt;i++){
            sum1 += num[i][i];
            sum2 += num[i][cnt-i-1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args){
        Main02 main = new Main02();
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
