package 스택_큐_05.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String n,String k){
        String answer = "YES";
        Queue<Character> queue = new LinkedList<>();

        for(char ch : n.toCharArray()) queue.offer(ch);

        for(char ch : k.toCharArray()){
            if(queue.contains(ch)){
                if(ch!=queue.poll()) return "NO";
            }
        }

        if(!queue.isEmpty()){
            answer="NO";
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String k = sc.next();

        System.out.println(main.solution(n,k));

    }
}
