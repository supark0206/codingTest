package 문자관련_01.가장짧은문자거리;

import java.util.Scanner;


public class Main {
    public int[] solution(String str, char chr){
        int[] answer = new int[str.length()];
        int p = 1000;

        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == chr){
                p=0;
                answer[i] = p;
            }else{
                p++;
                answer[i] = p;
            }
        }

        p=1000;
        for(int i=str.length()-1; i>=0 ; i--){
            if(str.charAt(i) == chr){
                p=0;
            }else{
                p++;
                answer[i] = Math.min(answer[i],p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char chr = sc.next().charAt(0);

        for(int x : main.solution(str, chr)){
            System.out.print(x+" ");
        }
    }
}

