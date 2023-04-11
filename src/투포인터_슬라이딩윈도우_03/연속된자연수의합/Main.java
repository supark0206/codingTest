package 투포인터_슬라이딩윈도우_03.연속된자연수의합;

import java.util.Scanner;

public class Main {
    public int solution(int n){
        int answer = 0;
        int sum = 0;
        int p1 =1;

        for(int p2=1;p2<n;p2++){

            sum += p2;

            if(sum==n){
                answer++;
            }
            while(sum>=n){
                sum -= p1;
                p1++;
                if(sum==n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(main.solution(n));
    }
}
