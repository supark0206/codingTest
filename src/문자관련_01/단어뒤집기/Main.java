package 문자관련_01.단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String>  answer = new ArrayList<>();
        for(String x : str){
            char[] c = x.toCharArray();
            String tmp = "";
            for(int i=c.length-1; i>=0; i--){
                tmp += c[i];
            }
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i<n; i++){
            str[i] = sc.next();
        }

        for(String x : main.solution(n,str)){
            System.out.println(x);
        }
    }
}