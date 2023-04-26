package 문자관련_01.문장속단어;
import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        int max = 0;

        String[] strArray = str.split(" ");

        for(String x : strArray) {
            if(max<x.length()){
                max = x.length();
                answer = x;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}