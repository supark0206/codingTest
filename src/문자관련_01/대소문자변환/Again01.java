package 문자관련_01.대소문자변환;

import java.util.*;
import java.util.Scanner;

public class Again01 {
    public String solution(String str){
        String answer = "";
        char[] chr = str.toCharArray();

        for(char a : chr){
            if(a == Character.toLowerCase(a)){
                answer += Character.toUpperCase(a);
            }else {
                answer += Character.toLowerCase(a);
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
