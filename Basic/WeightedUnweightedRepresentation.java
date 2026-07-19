import java.util.*;
class Edge{
    int v,w;
    Edge(int x,int y){
        this.v=x;
        this.w=y;
    }
}
class WeightedUnweightedRepresentation{
    static void allPaths(ArrayList<ArrayList<Edge>> gr,LinkedHashSet<Integer> hs,int s,int d,int cost){
        hs.add(s);
        if(s==d)
            System.out.println(hs+" "+cost);
        else{
            for(Edge i:gr.get(s)){
                if(!hs.contains(i.v)){
                    cost=cost+i.w;
                    allPaths(gr, hs, i.v, d,cost);
                    cost=cost-i.w;
                }
            }
        }
        hs.remove(s);
        return;
    }
    public static void main(String args[]){
        int[][] ed={{0,1,2},{0,2,1},{0,3,5},{1,2,8},{1,3,6},{2,3,7},{1,4,2},{3,4,1}};
        ArrayList<ArrayList<Edge>> gr=new ArrayList<>();
        int vertex=5;
        for(int i=0;i<vertex;i++){
            gr.add(new ArrayList<>()); 
        }
        for(int i=0;i<ed.length;i++){
            int u=ed[i][0];
            int v=ed[i][1];
            int w=ed[i][2];
            gr.get(u).add(new Edge(v,w));
            gr.get(v).add(new Edge(u,w)); //remove this for directed graph
        }
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        allPaths(gr,hs,0,4,0);
        // System.out.println(gr);
        // for(int i=0;i<vertex;i++){
        //     System.out.print(i+"->");
        //     for(Edge e:gr.get(i)){
        //         System.out.print("("+e.v+","+e.w+")");
        //     }
        //     System.out.println();
        // }
    }
}