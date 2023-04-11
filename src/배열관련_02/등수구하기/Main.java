package 배열관련_02.등수구하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0;i<n;i++){
            int cnt = 1;
            for(int q=0; q<n; q++){
                if(arr[i]<arr[q]){
                    cnt++;
                }
            }
            answer.add(cnt);
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

        for(int x : main.solution(n,arr)){
            System.out.print(x+" ");
        }

    }
}
