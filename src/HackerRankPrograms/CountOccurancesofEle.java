package HackerRankPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurancesofEle {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(map.get(a)==null)
                map.put(a,1);
            else
                map.put(a,map.get(a)+1);
        }
        int target=sc.nextInt();
        System.out.println(map.get(target));

    }
}
