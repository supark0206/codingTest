package DFS_BFS_07.재귀함수_팩토리얼_DFS;


public class Main {
    public int recursive(int n){
        if(n==1) return 1;
        else{
            return n*recursive(n-1);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.recursive(5));
    }
}
