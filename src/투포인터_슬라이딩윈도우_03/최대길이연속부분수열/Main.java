package 투포인터_슬라이딩윈도우_03.최대길이연속부분수열;

import java.util.Scanner;

public class Main {
    public int solution(int n, int k, int[] nArray){
        int answer = 0;
        int cnt = 0;
        int lt = 0;


        for(int rt=0;rt<n;rt++){
            if(nArray[rt]==0) cnt++;
            while (cnt>k){
                if(nArray[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer,rt-lt+1);
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
