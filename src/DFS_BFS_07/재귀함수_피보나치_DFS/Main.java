package DFS_BFS_07.재귀함수_피보나치_DFS;


public class Main {
    static int[] fibo;

    public int recursive(int n){
        if(n==1) return fibo[n] = 1;
        else if (n==2) return fibo[n] = 1;
        else return fibo[n] = recursive(n-2) + recursive(n-1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        int n  = 10;
        fibo = new int[n+1];

        main.recursive(n);
        for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
    }
}
