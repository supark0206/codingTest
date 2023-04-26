package 문자관련_01.유효한팰린드롬;


import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            answer = "YES";
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