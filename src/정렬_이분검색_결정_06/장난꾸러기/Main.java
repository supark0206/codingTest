package 정렬_이분검색_결정_06.장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arrTmp = arr.clone();

        Arrays.sort(arr);

        for (int i=0; i<k;i++){
            if(arrTmp[i] != arr[i]){
                answer.add(i+1);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int k= sc.nextInt();
        int[] arr = new int[k];

        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }

        for(int x : main.solution(k,arr)) System.out.print(x+" ");
    }
}