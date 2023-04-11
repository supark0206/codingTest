package 투포인터_슬라이딩윈도우_03.연속부분수열;

import java.util.Scanner;

public class Main02 {
    public int solution(int n, int m, int[] nArray){
        int answer = 0;
        int sum = 0;
        int p1 = 0;
        int p2 = 0;

        while (p1<n && p2<n && p1+p2<n){
            sum += nArray[p1 + p2];
            p2++;

            if(sum == m){
                answer++;
                p1++;
                p2 = 0;
                sum = 0;
            }else if(sum > m){
                p1++;
                p2 = 0;
                sum = 0;
            }

        }


        return answer;
    }

    public static void main(String[] args){
        Main02 main = new Main02();
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
