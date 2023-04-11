package 투포인터_슬라이딩윈도우_03.연속부분수열;

import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] nArray){
        int answer = 0;
        int sum=0,lt=0;

        for(int rt=0;rt<n; rt++){
            sum+=nArray[rt];
            if(sum==m) answer++;

            while(sum>=m){
                sum-=nArray[lt++];
                if(sum==m) answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nArray = new int[n];
        for(int i=0; i<n; i++){
            nArray[i] = sc.nextInt();
        }

        System.out.print(main.solution(n,m,nArray));
    }
}
