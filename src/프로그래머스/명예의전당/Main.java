package 프로그래머스.명예의전당;


import java.util.*;

public class Main {
    public int[] solution(int k, int[] score){
        int[] answer = new int[score.length];

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println(score.length);

        for(int i=0;i<score.length;i++){

            arrayList.add(score[i]);
            Collections.sort(arrayList);

            if(arrayList.size()>k){
                arrayList.remove(0);
            }

            answer[i] = arrayList.get(0);


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

        for(int x : main.solution(n,arr)) System.out.print(x + " ");

    }
}