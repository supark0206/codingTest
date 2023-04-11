package 투포인터_슬라이딩윈도우_03.두배열합치기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main02 {
    public List<Integer> solution(int x, int y, int[] xArray, int[] yArray){
        List<Integer> answer = new ArrayList<>();

        for(int a : xArray){
            answer.add(a);
        }
        for(int b : yArray){
            answer.add(b);
        }

        return answer.stream().sorted().collect(Collectors.toList());

    }

    public static void main(String[] args){
        Main02 main = new Main02();
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
