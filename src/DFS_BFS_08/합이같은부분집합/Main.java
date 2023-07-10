package DFS_BFS_08.합이같은부분집합;

import java.util.Scanner;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] ch){
        if(flag) return;

        if(L == n){
            if((total-sum)==sum){
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(L+1, sum+ch[L], ch);
            DFS( L+1, sum, ch);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        int[] ch = new int[n+1];

        for(int i=0; i<n; i++){
            ch[i] = sc.nextInt();
            total += ch[i];
        }

        main.DFS(0,0,ch);
        System.out.println(answer);

    }
}

