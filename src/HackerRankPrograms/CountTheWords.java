package HackerRankPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountTheWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> map=new HashMap<>();
        String[] words=sc.nextLine().split(" ");
        for(int i=0;i<words.length;i++){
            String a=words[i].toLowerCase();
            if(map.get(a) == null)
                map.put(a,1);
            else
                map.put(a,map.get(a)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
