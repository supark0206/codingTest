package DFS_BFS_07.이진트리순회_넓이우선_BFS;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node lt,rt;

    public Node(int val){
        data=val;
        lt=rt=null;
    }
}

public class Main {
    Node root;

    public void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int level = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            System.out.print(level + " : " );

            for(int i=0; i<len; i++){
                Node cur = queue.poll();
                System.out.print(cur.data + " ");

                if(cur.lt != null){
                    queue.offer(cur.lt);
                }

                if(cur.rt != null){
                    queue.offer(cur.rt);
                }
            }
            level++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}

