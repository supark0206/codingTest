package DFS_BFS_08.바둑이승차;

import java.util.Scanner;

public class Main {
    static int c, n;
    static int max;

    public void DFS(int L,int sum,int[] m){
        if(c<sum) return;

        if(L==n){
            if(max < sum){
                max = sum;
            }
        }
        else{
            DFS(L+1, sum+m[L] , m);
            DFS( L+1, sum, m);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        c = sc.nextInt();
        n = sc.nextInt();
        int[] m = new int[n];

        for(int i=0;i<n;i++){
            m[i] = sc.nextInt();
        }

        main.DFS(0,0,m);
        System.out.println(max);
    }
}
