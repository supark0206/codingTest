package DFS_BFS_08.수열추측하기;

import java.util.Scanner;

public class Main {
    static int n, f;
    static int[] b,p,ch;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = combi(n-1,r-1)+combi(n-1,r);
    }

    public void DFS(int L, int sum){
        if(flag) return;

        if(L==n){
            if(sum==f){
                for (int i : p) {
                    System.out.print(i + " ");
                    flag = true;
                }
            }
        }else{
            for(int i=1;i<=n;i++){
                if(ch[i]==0){
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L+1,sum + (b[L] * p[L]));
                    ch[i]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1];
        for(int i=0; i<n; i++){
            b[i] = main.combi(n-1,i);
        }
        main.DFS(0,0);

    }
}
