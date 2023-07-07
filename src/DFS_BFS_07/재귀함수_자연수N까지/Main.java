package DFS_BFS_07.재귀함수_자연수N까지;

public class Main {
    public void DFS(int n){
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.DFS(10);
    }
}
