package 숫자관련_02.큰수출력하기;

import java.util.Scanner;

public class Main {
    public String solution(int n, int[] numArr){
        String answer = "";
        answer += numArr[0];
        answer += " ";
        for(int i=1;i<n;i++){
            if(numArr[i]>numArr[i-1]){
                answer += numArr[i];
                answer += " ";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numArr = new int[n];
        for(int i=0; i<n; i++){
            numArr[i]=sc.nextInt();
        }
        System.out.println(main.solution(n,numArr));
    }
}
