package 문자관련_01.숫자만추출;

import java.util.Scanner;

public class Main {
    public int solution(String str) {
        int answer = 0;
        str = str.replaceAll("[^0-9]", "");

        answer = Integer.parseInt(str);

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(main.solution(str));
    }
}