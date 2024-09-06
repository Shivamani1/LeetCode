class Solution {
    static Set<Integer> col;
    static Set<Integer> posDiag;
    static Set<Integer> negDiag;
    static List<List<String>> ll;
    static int N;
    public List<List<String>> solveNQueens(int n) {
        ll=new ArrayList();
        col=new HashSet();
        posDiag=new HashSet();
        negDiag=new HashSet();
        N=n;
        helper(0,new ArrayList());
        return ll;
    }
    static void helper(int n,List<String> l){
        if(n==N){
           ll.add(new ArrayList(l));
            return;
        }
        for(int i=0;i<N;i++){
            if(col.contains(i)||posDiag.contains(i+n)||negDiag.contains(n-i))
                continue;
            col.add(i);
            posDiag.add(i+n);
            negDiag.add(n-i);
            StringBuilder sb=new StringBuilder();
            int temp=0;
                while(temp++!=N){
                    if(temp-1==i)
                        sb.append('Q');
                    else sb.append('.');
                }
            l.add(sb.toString());
            helper(n+1,l);
            col.remove(i);
            posDiag.remove(i+n);
            negDiag.remove(n-i);
            l.remove(l.size()-1);
        }
    }
}