package 문자관련_01.특정문자뒤집기;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Again01 {

    private String solution(String str) {

        char[] ch = str.toCharArray();
        int lt = 0;
        int rt = ch.length - 1;

        while(lt<rt){
            if(!Character.isAlphabetic(ch[lt])){
                lt++;
            }else if (!Character.isAlphabetic(ch[rt])){
                rt--;
            }else {
                char tmp;
                tmp =  ch[lt];
                ch[lt] = ch[rt];
                ch[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(ch);

    }

    public static void main(String[] args) {
        Again01 main = new Again01();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(main.solution(str));
    }


}
