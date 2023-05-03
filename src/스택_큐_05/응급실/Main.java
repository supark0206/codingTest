package 스택_큐_05.응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id;
    int risk;

    public Person(int id,int risk){
        this.id = id;
        this.risk = risk;
    }

}

public class Main {

    public int solution(int n,int m,int[] risk){
        int answer = 1;

        Queue<Person> queue = new LinkedList<>();

        for(int i=0;i<n;i++){
            queue.offer(new Person(i,risk[i]));
        }


        while(!queue.isEmpty()){
            Person tmp = queue.poll();
            for(Person x : queue){
                if(x.risk  > tmp.risk){
                    queue.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if(tmp != null){
                if(tmp.id == m) return answer;
                else answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] risk = new int[n];
        for(int i=0;i<n;i++){
            risk[i] = sc.nextInt();
        }

        System.out.println(main.solution(n,m,risk));

    }
}
