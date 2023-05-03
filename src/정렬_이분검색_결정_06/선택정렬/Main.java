package 정렬_이분검색_결정_06.선택정렬;

import java.util.Scanner;

public class Main {
    public int[] solution(int n, int[] a){
       for(int i=0; i<n; i++){
           int idx = i;
           for(int j=i+1; j<n;j++){
               if(a[idx]>a[j]) idx = j;
           }
           int tmp = a[i];
           a[i] = a[idx];
           a[idx] = tmp;
       }

        return a;
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
