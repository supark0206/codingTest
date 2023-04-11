package 배열관련_02.멘토링;

import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[][] num){
        int answer = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                int cnt = 0;
                for(int k=0; k<m; k++){
                    int pi=0,pj=0;
                    for(int s=0; s<n; s++){
                        if(num[k][s]==i) pi=s;
                        if(num[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==m){
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] num = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println(main.solution(n, m, num));

    }
}
