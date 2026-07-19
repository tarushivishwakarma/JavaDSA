import java.util.*;
class Edge{
    int v,w;
    Edge(int x,int y){
        this.v=x;
        this.w=y;
    }
}
class Pair{
    int wei,st,end;
    Pair(int a,int b,int c){
        this.st=a;
        this.end=b;
        this.wei=c;
    }
static void Prims(ArrayList<ArrayList<Edge>> ed){
    HashSet<Integer> vis=new HashSet<>();
    PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.wei-b.wei);
    pq.offer(new Pair(0,0,-1));
    while(!pq.isEmpty()){
        Pair curr=pq.poll();
        if(vis.contains(curr.end))
            continue;
        vis.add(curr.end);
        for(Edge i:ed.get(curr.end))
            if(!vis.contains(i.v))
                 pq.offer(new Pair(curr.end,i.v,i.w)); 
        }
        System.out.println(st+" "+end);
    }
}
    public static void main(String[] args) {
        int[][] matrix={{0,1,3},{0,2,1},{1,2,2},{1,3,3},{2,3,1},{2,4,4},{3,4,1}};
        ArrayList<ArrayList<Edge>> ed=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            ed.add(new ArrayList<>());
        }
        for(int i=0;i<matrix.length;i++){
            int u=matrix[i][0];
            int v=matrix[i][1];
            int w=matrix[i][2];
            ed.get(u).add(new Edge(v,w));
            ed.get(v).add(new Edge(u,w));
        }
    }
}
