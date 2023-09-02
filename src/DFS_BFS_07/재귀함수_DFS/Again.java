package DFS_BFS_07.재귀함수_DFS;

import java.util.Scanner;

public class Again {
    static int a=1;

    public void solution(int n){
        if(a<=n){
            System.out.print(a+" ");
            a++;
            solution(n);
        }else {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Again again = new Again();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        again.solution(n);

    }
}
