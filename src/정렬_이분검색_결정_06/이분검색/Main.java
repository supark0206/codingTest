package 정렬_이분검색_결정_06.이분검색;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[] arr){

        int answer = 0;

        int lt=0;
        int rt = n-1;

        Arrays.sort(arr);

        while(lt<=rt){
            int mid = ( lt + rt )/2;
            if(arr[mid]==m){
                answer = mid+1;
                break;
            }

            if(arr[mid]>m) rt = mid-1;
            else lt=mid+1;
        }


        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(main.solution(n,m,arr));
    }
}
