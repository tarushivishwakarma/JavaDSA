import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedHashSet;

class DirectedUndirectedRepresentation{
    static void allPaths(ArrayList<ArrayList<Integer>> gr,LinkedHashSet<Integer> hs,int s,int d){
        hs.add(s);
        if(s==d)
            System.out.println(hs);
        else{
            for(Integer x:gr.get(s)){
                if(!hs.contains(x))
                    allPaths(gr, hs, x, d);
            }
        }
        hs.remove(s);
        return;
    }
    static void bfs(ArrayList<ArrayList<Integer>> gr,LinkedHashSet<Integer> hs){
        Deque<Integer> q=new ArrayDeque<>();
        q.addLast(0);
        hs.add(0);
        while(!q.isEmpty()){
            int curr=q.pop();
            for(Integer i:gr.get(curr)){
                if(!hs.contains(i)){
                    q.addLast(i);
                    hs.add(i);
                }
            }
        }
        System.out.println(hs);
    }
    public static void main(String args[]){
        int[][] ed={{0,1},{0,2},{0,3},{1,2},{1,3},{2,3},{1,4},{3,4}};
        ArrayList<ArrayList<Integer>> gr=new ArrayList<>();
        int v=5;
        for(int i=0;i<v;i++){
            gr.add(new ArrayList<>()); 
        }
        for(int i=0;i<ed.length;i++){
            gr.get(ed[i][0]).add(ed[i][1]);
            gr.get(ed[i][1]).add(ed[i][0]); //remove this for directed graph
        }
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        bfs(gr, hs);
        // allPaths(gr,hs,0,4);
        // System.out.println(gr);
    }
}