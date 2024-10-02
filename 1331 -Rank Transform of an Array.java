class Solution {




    public int[] arrayRankTransform(int[] arr) {
        int temp[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
    temp[i]=arr[i];
}
        Arrays.sort(temp);
      int res[] =  new int[arr.length];
HashMap<Integer,Integer> map = new HashMap<>();

int rank =1;
for(int i=0;i<arr.length;i++){
    if(!map.containsKey(temp[i])){
        map.put(temp[i],rank);
        rank++;
    }
}

for(int i=0;i<arr.length;i++)
{
    res[i]= map.get(arr[i]);
}

return res;

    }
}
