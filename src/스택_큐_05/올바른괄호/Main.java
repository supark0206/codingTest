package 스택_큐_05.올바른괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str){
        String answer = "YES";

        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc  = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
