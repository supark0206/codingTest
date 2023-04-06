package 숫자관련_02.점수계산;

import java.util.Scanner;

public class Main {
    public int solution(int n, int[] arr){
        int answer = 0;
        int tmp = 0;
        for(int i=0; i<n; i++){

            if(arr[i]==1){
                tmp++;
                answer += tmp;
            }else{
                tmp = 0;
            }

        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print(main.solution(n, arr));

    }
}
