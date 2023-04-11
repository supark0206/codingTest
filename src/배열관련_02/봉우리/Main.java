package 배열관련_02.봉우리;

import java.util.Scanner;

public class Main {
    public int solution(int cnt, int[][] num){
        int answer = 0;

        for(int i=1; i<=cnt; i++){
            for(int q=1; q<=cnt; q++){

                int max = 0;
                int a = num[i][q];

                max = Math.max(max, num[i-1][q]);
                max = Math.max(max, num[i+1][q]);

                max = Math.max(max, num[i][q-1]);
                max = Math.max(max, num[i][q+1]);

                if(a>max){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int[][] num = new int[cnt+2][cnt+2];

        for(int i=1; i<=cnt; i++){
            for(int q=1; q<=cnt; q++){
                num[i][q] = sc.nextInt();
            }
        }

        System.out.println(main.solution(cnt, num));

    }
}
