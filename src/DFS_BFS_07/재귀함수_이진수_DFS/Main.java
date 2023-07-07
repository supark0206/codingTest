package DFS_BFS_07.재귀함수_이진수_DFS;


public class Main {
    public void recursive(int n){

        if (n==0) return;
        else{
            recursive(n/2);
            System.out.print(n%2);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.recursive(11);
    }
}
