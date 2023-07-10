package DFS_BFS_08.최대점수구하기_DFS;

import java.util.Scanner;

public class Main {
    static int n ;
    static int limitTime;
    static int answer=Integer.MIN_VALUE;

    public void DFS(int L,int sum, int time, int[] input, int[] inputTime){
        if(limitTime<time) return;

        if(L == n){
            answer=Math.max(answer,sum);
        }else{
            DFS(L+1,sum+input[L],time+inputTime[L],input,inputTime);
            DFS(L+1,sum,time,input,inputTime);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        limitTime=sc.nextInt();

        int[] input = new int[n];
        int[] inputTime = new int[n];

        for(int i=0; i<n; i++){
            input[i] = sc.nextInt();
            inputTime[i] = sc.nextInt();
        }

        main.DFS(0,0,0,input,inputTime);
        System.out.println(answer);

    }
}
