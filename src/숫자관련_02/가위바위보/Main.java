package 숫자관련_02.가위바위보;

import java.util.Scanner;

public class Main {
    public String[] solution(int n, int[] aArr, int[] bArr){
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
           if(aArr[i]==bArr[i]){
               answer[i] = "D";
           }else if (aArr[i]==1&&bArr[i]==3){
               answer[i] = "A";
           }else if (aArr[i]==2&&bArr[i]==1){
               answer[i] = "A";
           }else if (aArr[i]==3&&bArr[i]==2){
               answer[i] = "A";
           }else{
               answer[i] = "B";
           }
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] aArr = new int[n];
        for(int i=0; i<n; i++){
            aArr[i]=sc.nextInt();
        }

        int[] bArr = new int[n];
        for(int i=0; i<n; i++){
            bArr[i]=sc.nextInt();
        }

        for(String x : main.solution(n,aArr,bArr)){
            System.out.println(x);
        }
    }
}
