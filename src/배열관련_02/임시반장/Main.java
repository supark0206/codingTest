package 배열관련_02.임시반장;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] num){
        int answer = 0;
        int max = 0;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(num[i][k]==num[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] num = new int[n+1][6];

        for(int i=1; i<=n; i++){
            for(int q=1; q<=5; q++){
                num[i][q] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, num));

    }
}
