package 투포인터_슬라이딩윈도우_03.두배열합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int x, int y, int[] xArray, int[] yArray){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;

        while(p1<x && p2<y){
            if(xArray[p1]<yArray[p2]) answer.add(xArray[p1++]);
            else answer.add(yArray[p2++]);
        }
        while (p1<x) answer.add(xArray[p1++]);
        while (p2<y) answer.add(yArray[p2++]);

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] xArray = new int[x];
        for(int i=0; i<x; i++){
            xArray[i] = sc.nextInt();
        }

        int y = sc.nextInt();
        int[] yArray = new int[y];
        for(int i=0; i<y; i++){
            yArray[i] = sc.nextInt();
        }

        for(int a : main.solution(x,y,xArray,yArray)){
            System.out.print(a+" ");
        }

    }
}
