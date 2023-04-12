package 해쉬_정렬지원SET_04.모든아나그램찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public int solution(String str1, String str2){
        int answer = 0;
        int lt = 0;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c : str2.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }

        int l = str2.length()-1;

        for(int i=0; i<l; i++){
            map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i),0)+1);
        }

        for(int rt = l ; rt<str1.length();rt++){
            map1.put(str1.charAt(rt), map1.getOrDefault(str1.charAt(rt),0)+1);

            if(map1.equals(map2)) answer++;

            map1.put(str1.charAt(lt),map1.get(str1.charAt(lt))-1);
            if(map1.get(str1.charAt(lt))==0) map1.remove(str1.charAt(lt));

            lt++;
        }



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
