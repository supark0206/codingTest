package 투포인터_슬라이딩윈도우_03.최대매출;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] nArray){
        int answer = 0;
        int sum = 0;
        for(int i=0; i<k;i++){
            sum += nArray[i];
        }
        answer = sum;

        for(int i=1;i<=n-k;i++){
            sum = sum - nArray[i-1] + nArray[i+k-1];
            answer = Math.max(answer,sum);
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
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
