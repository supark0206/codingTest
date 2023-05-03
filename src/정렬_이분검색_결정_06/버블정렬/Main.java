package 정렬_이분검색_결정_06.버블정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){

       for(int i=0; i<n;i++){
           int tmp = 0;
           for(int j=1; j<n; j++){
               if(arr[j-1]>arr[j]){
                   tmp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = tmp ;
               }
           }
       }

        return arr;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int x : main.solution(n,arr)) System.out.print(x + " ");

    }
}
