package DFS_BFS_08.조합구하기;

import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] arr;

    public void DFS(int L,int s){
        if (L == m) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        else {
            for(int i=s; i<=n; i++){
                arr[L] = i;
                DFS(L+1,i+1);
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        arr = new int[m];

        main.DFS(0,1);
    }

}
