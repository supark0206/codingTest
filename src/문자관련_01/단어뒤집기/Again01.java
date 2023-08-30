package 문자관련_01.단어뒤집기;

import java.util.Scanner;

public class Again01 {
    public void solution(String[] str) {
        for (String s : str) {
            String a = String.valueOf(new StringBuilder(s).reverse());
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Again01 main = new Again01();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i<n; i++){
            str[i] = sc.next();
        }

        main.solution(str);
    }
}
