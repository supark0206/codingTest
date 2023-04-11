package 투포인터_슬라이딩윈도우_03.최대매출;

import java.util.Scanner;

public class Main02 {
    public int solution(int n, int k, int[] nArray){
        int answer = 0;
        int sum = 0;

        for(int i=0;i<n-k;i++){
            for(int j=0;j<k;j++){
                sum += nArray[i+j];
            }
            answer = Math.max(answer,sum);
            sum = 0;
        }

        return answer;
    }

    public static void main(String[] args){
        Main02 main = new Main02();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nArray = new int[n];
        for(int i=0; i<n; i++){
            nArray[i] = sc.nextInt();
        }

        System.out.print(main.solution(n,k,nArray));
    }
}
