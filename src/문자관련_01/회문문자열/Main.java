package 문자관련_01.회문문자열;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "YES";
        str = str.toUpperCase();
        int rt = str.length()-1;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(rt)){
                answer = "NO";
            }
            rt--;
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
