package 문자관련_01.중복문자제거;

import java.util.Scanner;

public class Again {

    public static void main(String[] args) {
        Again main = new Again();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }

    private String solution(String str) {

        char[] ch = str.toCharArray();
        String tmp = "";

        for (char c : ch) {
            if(!tmp.contains(String.valueOf(c))){
                tmp += c;
            }
        }

        return tmp;

    }
}
