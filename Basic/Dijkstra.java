import java.util.*;
class Edge{
    int v,w;
    Edge(int x,int y){
        this.v=x;
        this.w=y;
    }
}
public class Dijkstra {
    static void Dij(ArrayList<ArrayList<Edge>> gr,int s){
        PriorityQueue<Edge> pq=new PriorityQueue<>((a,b)->a.w-b.w);
        pq.offer(new Edge (s,0));
        int[] ans=new int[5];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[s]=0;
        while(!pq.isEmpty()){
            Edge curr=pq.poll();
            for(Edge i:gr.get(curr.v)){
                if(ans[curr.v]<curr.w){
                    continue;
                }
                if(ans[curr.v]+i.w<ans[i.v]){
                    ans[i.v]=ans[curr.v]+i.w;
                    pq.offer(new Edge(i.v, ans[i.v]));
                }
            }
            
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[][] ed={{0,1,3},{0,2,2},{0,3,1},{1,3,1},{1,4,4},{2,3,1},{2,4,4},{3,4,1}};
        ArrayList<ArrayList<Edge>> gr=new ArrayList<>();
        for(int i=0;i<5;i++){
            gr.add(new ArrayList<>());
        }
        for(int i=0;i<ed.length;i++){
            int u=ed[i][0];
            int v=ed[i][1];
            int w=ed[i][2];
            gr.get(u).add(new Edge(v,w));
            gr.get(v).add(new Edge(u,w));
        }
        Dij(gr, 0);
    }
    
}
