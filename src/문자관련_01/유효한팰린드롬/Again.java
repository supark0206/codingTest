package 문자관련_01.유효한팰린드롬;

import java.util.Locale;
import java.util.Scanner;

public class Again {
    public String solution(String str){
        char[] array = str.toUpperCase(Locale.ROOT).toCharArray();
        String tmp = "";

        for (char c : array) {
            if(Character.isAlphabetic(c)){
                tmp += c;
            }
        }
        if(tmp.equals(String.valueOf(new StringBuilder(tmp).reverse()))){
            return "YES";
        }else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Again main = new Again();
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
