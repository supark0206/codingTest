package 해쉬_정렬지원SET_04.K번째큰수;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public int solution(int n, int k, int[] arr){
        int answer = -1;
        int cnt=0;
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int l=j+1; l<n; l++){
                    treeSet.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        for(int x : treeSet){
            cnt++;
            if(cnt == k) return x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(main.solution(n, k, arr));
    }
}
