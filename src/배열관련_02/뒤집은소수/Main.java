package 배열관련_02.뒤집은소수;

import java.util.Scanner;

public class Main {
    public boolean isPrime(int num){
        if(num==1) return false;

        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }

        return true;
    }

    public String solution(int n,int[] arr){
        String answer = "";

        String str = "";
        int a = 0;

        for(int i=0; i<n; i++){
            String tmp = Integer.toString(arr[i]);
            str = new StringBuilder(tmp).reverse().toString();
            a = Integer.parseInt(str);

            if(isPrime(a)){
                answer = answer + Integer.toString(a) + " ";
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

        System.out.print(main.solution(n,arr));

    }
}
