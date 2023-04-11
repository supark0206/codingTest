package 투포인터_슬라이딩윈도우_03.공통원소;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public ArrayList<Integer> solution(int x, int y, int[] xArray, int[] yArray){
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 =0, p2=0;

        Arrays.sort(xArray);
        Arrays.sort(yArray);

        while(p1<x && p2<y){
            if(xArray[p1]==yArray[p2]) {
                answer.add(xArray[p1++]);
                p2++;
            }
            else if(xArray[p1]<yArray[p2]){
                p1++;
            }
            else{
                p2++;
            }

        }

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
