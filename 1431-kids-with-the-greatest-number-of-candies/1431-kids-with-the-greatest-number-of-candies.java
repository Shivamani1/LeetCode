class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l = new ArrayList<>();
        int max=-1;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i])
                max=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            l.add(candies[i]+extraCandies>=max);
        }
        return l;
        
        
    }
}