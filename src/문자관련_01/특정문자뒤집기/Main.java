package 문자관련_01.특정문자뒤집기;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        char[] chr = str.toCharArray();
        int lt = 0;
        int rt = chr.length-1;
        char tmp;
        while (lt<rt){
            if(!Character.isAlphabetic(chr[lt])){
              lt++;
            }else if(!Character.isAlphabetic(chr[rt])){
              rt--;
            }else {
                tmp = chr[lt];
                chr[lt] = chr[rt];
                chr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chr);
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }
}