package 스택_큐_05.괄호문자제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(int n, int[][] board, int m, int[] moves){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();


        for(int j=0;j<m;j++){
            int a = moves[j]-1;

            for(int i=0;i<board.length;i++) {

                if(board[i][a]>0){
                    int tmp = board[i][a];
                    board[i][a] = 0;
                    System.out.print(tmp);
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc  = new Scanner(System.in);


        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for(int i=0;i<m;i++){
            moves[i] = sc.nextInt();
        }

        System.out.println(main.solution(n,board,m,moves));
    }
}
