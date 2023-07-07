package DFS_BFS_07.부분집합_DFS;

public class Main{
    static int n;
    static int[] ch;

    public void DFS(int L){
        if(L == n+1){
            String tmp = "";

            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length() > 0) System.out.println(tmp);
        }
        else {
            ch[L] = 1; // 사용한다
            DFS(L+1);

            ch[L] = 0; // 사용하지 않는다
            DFS( L+1);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        n=3;
        ch = new int[n+1];
        main.DFS(1);
    }
}
