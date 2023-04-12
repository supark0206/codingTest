package 해쉬_정렬지원SET_04.매출액의종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public  ArrayList<Integer> solution(int n, int m, int[] nArray){
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<m-1; i++){
            map.put(nArray[i],map.getOrDefault(nArray[i],0)+1);
        }

        for(int rt=m-1; rt<n; rt++){
            map.put(nArray[rt], map.getOrDefault(nArray[rt], 0 )+1);
            answer.add(map.size());

            map.put(nArray[lt],map.get(nArray[lt])-1);
            if(map.get(nArray[lt])==0) map.remove(nArray[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nArray = new int[n];
        for(int i=0; i<n; i++){
            nArray[i] = sc.nextInt();
        }

        for(int x : main.solution(n,m,nArray)){
            System.out.print(x+" ");
        }

    }
}
