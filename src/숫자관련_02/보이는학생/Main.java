package 숫자관련_02.보이는학생;

import java.util.Scanner;

public class Main {
    public String solution(int n, int[] numArr){
        String answer = "";
        int tmp = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            if(max<numArr[i]){
                max = numArr[i];
                tmp++;
            }
        }

        answer = Integer.toString(tmp);
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
