class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for(char i:word1.toCharArray()){
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
         for(char i:word2.toCharArray()){
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        for(char ch : hm1.keySet()){
            if(!hm2.containsKey(ch))
                return false;
        }
        if(hm1.size()!=hm2.size())
            return false;
        List<Integer> values1 = new ArrayList<>(hm1.values());

        // Step 2: Sort the List
        Collections.sort(values1);
        List<Integer> values2 = new ArrayList<>(hm2.values());

        // Step 2: Sort the List
        Collections.sort(values2);
        return values1.equals(values2);
    }
}