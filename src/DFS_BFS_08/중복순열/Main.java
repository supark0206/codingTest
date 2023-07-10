package DFS_BFS_08.중복순열;

import java.util.Scanner;

public class Main {
    static int[] pm;
    static int n,m;

    public void DFS(int L){
        if (L==m) {
            for (int i : pm) {
                System.out.print(i+ " ");
            }
            System.out.println();

        }else {
            for(int i=1; i<=n; i++){
                pm[L] = i;
                DFS(L+1);
            }
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        pm=new int[m];

        main.DFS(0);

    }
}
