package 정렬_이분검색_결정_06.삽입정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] arr){
       for(int i=1; i<n; i++){
           int tmp = arr[i];
           int j;
           for(j=i-1; j>=0; j--) {
               if (tmp < arr[j]) arr[j + 1] = arr[j];
               else break;
           }
           arr[j+1] = tmp;

           }
        return arr;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(int x : main.solution(n,a)) System.out.print(x + " ");

    }
}
