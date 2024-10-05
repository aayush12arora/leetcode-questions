class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
  HashMap<Character,Integer> tmap = new HashMap<>(map);
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
int j=0;
      for(int i=0;i<s2.length();i++){
        char c = s2.charAt(i);
  tmap.put(c,tmap.getOrDefault(c,0)+1);
        // if window is greater shrink it
if(i-j+1>s1.length()){
    
    int a = tmap.get(s2.charAt(j));
    a--;
    if(a==0){
        tmap.remove(s2.charAt(j));
    }else{
        tmap.put(s2.charAt(j),a);
    }
    j++;
}
 


  if (tmap.equals(map)) {
                return true;
            }
      }  

      return false;
    }
}
