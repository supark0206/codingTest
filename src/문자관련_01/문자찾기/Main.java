package 문자관련_01.문자찾기;

import java.util.*;

public class Main {
    public int solution(String str, char chr){
        int answer = 0;
        str = str.toUpperCase(Locale.ROOT);
        chr = Character.toUpperCase(chr);
        char[] tmp = str.toCharArray();

        for(char a:tmp){
            if(a == chr){
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char chr = sc.next().charAt(0);

        System.out.println(m.solution(str,chr));
    }
}
