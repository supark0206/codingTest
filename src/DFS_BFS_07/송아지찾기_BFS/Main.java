package DFS_BFS_07.송아지찾기_BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int[] dis = {1,-1,5};
    int[] ch;

    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e){
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        int L = 0;

        while (!Q.isEmpty()){
            int len = Q.size(); // 레벨마다 있는 원소의 개수

            for(int i = 0; i<len; i++){

                int x = Q.poll();

                for(int j=0; j<3; j++){
                    int nx = x+dis[j];
                    if(nx==e) return L+1;

                    if(nx>=1 && nx<=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }

                }
            }

            L++;
        }

        return 0;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(main.BFS(s,e));
    }
}
