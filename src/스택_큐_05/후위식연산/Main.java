package 스택_큐_05.후위식연산;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String str){
        Stack<Integer> stack = new Stack<>();

        for(char chr : str.toCharArray()){
            if(Character.isDigit(chr)){
                stack.push(chr-48);
            }else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(chr == '+') stack.push(lt+rt);
                else if(chr == '-') stack.push(lt-rt);
                else if(chr == '*') stack.push(lt*rt);
                else if(chr == '/') stack.push(lt/rt);
            }
        }

        return stack.get(0);
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc  = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}
