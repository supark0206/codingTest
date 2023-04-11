package 투포인터_슬라이딩윈도우_03.연속된자연수의합;

import java.util.Scanner;

public class Main02 {
    public int solution(int n){
        int answer = 0;
        int cnt = 1;
        n--;
        while (n>0){
            cnt++;
            n = n-cnt;
            if(n%cnt == 0){
                System.out.println(n+ " " +cnt);
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main02 main = new Main02();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(main.solution(n));
    }
}
