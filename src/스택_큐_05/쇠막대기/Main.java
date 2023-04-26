package 스택_큐_05.쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        char[] chr = str.toCharArray();

        for(int i=0; i<chr.length; i++){
            if(chr[i] == '('){

                stack.push(chr[i]);

            }else if(chr[i] == ')'){

                stack.pop();

                if(chr[i-1] == '('){
                    answer += stack.size();
                }else answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(main.solution(str));

    }
}
