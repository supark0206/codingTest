package 해쉬_정렬지원SET_04.아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2){
        String answer = "YES";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char x : str1.toCharArray()){
            map1.put(x,map1.getOrDefault(x,0)+1);
        }

        for(char x : str2.toCharArray()){
            map2.put(x,map2.getOrDefault(x,0)+1);
        }

        if(!map1.equals(map2)) answer = "NO";
        /*
        for(char x : map1.keySet()){
            if(map1.get(x) != map2.get(x)) answer = "NO";
        }*/

        return answer;
    }

    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(main.solution(str1,str2));
    }
}
