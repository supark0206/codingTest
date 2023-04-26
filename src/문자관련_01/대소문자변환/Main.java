package 문자관련_01.대소문자변환;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        for(char chr : str.toCharArray()){
            if(Character.isLowerCase(chr)){
                answer += Character.toUpperCase(chr);
            }else {
                answer += Character.toLowerCase(chr);
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
