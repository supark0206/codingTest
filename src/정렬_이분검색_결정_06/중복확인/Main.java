package 정렬_이분검색_결정_06.중복확인;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public String solution(int n, int[] arr){
        String answer = "U";

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : arr) {
            map.put(x, x);
        }
        if(arr.length != map.size()){
            return "D";
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

        System.out.println(main.solution(n,arr));
    }
}
