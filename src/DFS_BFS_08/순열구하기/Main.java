package DFS_BFS_08.순열구하기;

import java.util.Scanner;

public class Main {
    static int n,m;
    static int[] pm, ch, arr;

    public void DFS(int L){
        if (L == m) {
            for (int i : pm) {
                System.out.println(i + " ");
                System.out.println();
            }

        } else {
            for(int i=0; i<n; i++){
                if(ch[i] == 0){
                    ch[i] = 1;
                    pm[L] = arr[i];

                    DFS(L+1);

                    ch[i] = 0;
                }
            }

        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n];
        arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        main.DFS(0);

    }

}
