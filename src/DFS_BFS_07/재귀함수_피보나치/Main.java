package DFS_BFS_07.재귀함수_피보나치;


public class Main {
    public int recursive(int n){

        if(n==1) return 1;
        else if (n==2) return 1;
        else return recursive(n-2) + recursive(n-1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.recursive(5);
    }
}
