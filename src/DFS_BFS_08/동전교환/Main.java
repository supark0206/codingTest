package DFS_BFS_08.동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static int div, n;
    static int min = Integer.MAX_VALUE;
    public void DFS(int L, int sum,Integer[] arr){
        if(sum > n) return;
        if(L>=min) return;
        if (n == sum) {
            min = Math.min(min,L);
        }
        else{
            for(int i=0;i<div;i++){
                DFS(L+1,sum+arr[i],arr);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        div = sc.nextInt();
        Integer[] arr = new Integer[div];

        for(int i = 0; i< div; i++){
            arr[i] = sc.nextInt();;
        }

        Arrays.sort(arr, Collections.reverseOrder());

        n = sc.nextInt();

        main.DFS(0,0,arr);
        System.out.println(min);
    }
}
