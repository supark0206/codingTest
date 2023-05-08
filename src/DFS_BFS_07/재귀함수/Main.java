package DFS_BFS_07.재귀함수;


public class Main {
    public void recursive(int n){
        if(n==0) return;
        else {
            recursive(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        main.recursive(3);
    }
}
