package 문자관련_01.암호;

import java.util.Scanner;

public class Main {
    public String solution(String str,int num){
        String answer = "";
        for(int i=0; i<num; i++){
            String tmp = str.substring(0, 7).replace('#','1').replace('*','0');
            int a = Integer.parseInt(tmp, 2);
            str = str.substring(7);

            answer += (char)a;

        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = sc.next();
        System.out.println(main.solution(str,num));
    }
}
