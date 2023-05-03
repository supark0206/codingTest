package 정렬_이분검색_결정_06.LRU;

import java.util.Scanner;

public class Main {
    public int[] solution(int s, int n, int[] array){
        int[] answer = new int[s];

        for(int x : array){
            int pos = -1;
            for(int i=0; i<s; i++){
                if(x == answer[i]) pos = i;
            }

            if(pos == -1){
                for(int i=s-1; i>=1; i--){
                    answer[i] = answer[i-1];
                }
                answer[0] = x;
            }else {
                for(int i=pos; i>=1; i--){
                    answer[i] = answer[i-1];
                }
                answer[0] = x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
        }

        for(int x : main.solution(s,n,array)){
            System.out.print(x + " ");
        }

    }
}
