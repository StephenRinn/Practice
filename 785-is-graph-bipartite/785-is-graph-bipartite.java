class Solution
{    
    private int[] color=new int[105];
    
    private boolean dfsCheck(int node, int[][] graph)
    {
        if(color[node]==-1) color[node]=1;
        
        for(int adjNode : graph[node])
        {
            if(color[adjNode]!=-1)
            {
                if(color[node] == color[adjNode])
                {
                    return false;
                }
            }
            else
            {
                color[adjNode] = 1-color[node];
                
                if(!dfsCheck(adjNode, graph)) 
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph)
    {
        Arrays.fill(color, -1);
        
        int n=graph.length;
        
        for(int node=0;node<n;node++)
        {
            if(color[node]==-1)
            {
                if(!dfsCheck(node, graph)) 
                {
                    return false;
                }
            }
        }
        return true;
    }
}