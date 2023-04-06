package 문자관련_01.문자찾기;

import java.util.*;

public class Main {
    public int solution(String str, char chr){
        int answer = 0;

        str = str.toUpperCase();
        chr = Character.toUpperCase(chr);

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)==chr) answer++;
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
