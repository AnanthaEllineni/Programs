package HackerRankPrograms;

public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}
//5
//AAAA - 3 deletions
//BBBBB - 4 deletions
//ABABABAB - 0 deletions
//BABABA   - 0 deletions
//AAABBB  - 4 deletions