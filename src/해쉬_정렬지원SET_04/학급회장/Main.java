package 해쉬_정렬지원SET_04.학급회장;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public char solution(int n, String str){
        char answer = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        //getOrDefault 카운팅시에 중요
        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x, 0) +1);
        }

        /*
            map.containsKey('F');
            map.remove('A');
            map.size();
        */

        for(char key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(main.solution(n,str));
    }
}
