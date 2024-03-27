class Solution {
    HashMap<Integer,List<Integer>> map=new HashMap();
   boolean helper(int i,boolean[] vis,List<Integer> l){
        if(vis[i])
            return false;   
        if(l==null||l.isEmpty())
        return true;
            vis[i]=true;

            
        for(int j=0;j<l.size();j++){
        int a=l.get(j);
         if(!helper(a,vis,map.get(a)))
             return false;   
             l.remove(0);
        }
        

        
         
        vis[i]=false;
        return true;
        
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
            boolean[] vis=new boolean[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            if(!map.containsKey(prerequisites[i][0])){
            map.put(prerequisites[i][0],new ArrayList());
            map.get(prerequisites[i][0]).add(prerequisites[i][1]);
             }
           else
           map.get(prerequisites[i][0]).add(prerequisites[i][1]);
           }
         //map.forEach((k, v) -> System.out.println(k +  "  " + v));
            for(int i=0;i<numCourses;i++){
            if(map.containsKey(i)){
            if(!helper(i,vis,map.get(i)))
                  return false;
                
            }
        }
      return true;  
    }
}
