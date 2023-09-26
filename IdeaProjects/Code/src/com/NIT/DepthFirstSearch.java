package com.NIT;

import java.util.*;
import java.io.*;

public class DepthFirstSearch {
    private int V;
    //no. fo vertices
    //Array of lists for Adjacent List representation
    private LinkedList<Integer>adj[];
    @SuppressWarnings("unchecked")
    DepthFirstSearch(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    //function to add an edge into graph
    void addEdge(int v, int w){
        adj[v].add(w);
        //add w to v's list
    }
    void DFSUtil(int v, boolean visited[]){
        visited[v] = true;
        System.out.println(v+" ");
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
    }
}
void DFS(int v){
    boolean visited[] = new boolean[V];
    DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch(4);
        dfs.addEdge(0,1);
        dfs.addEdge(0,2);
        dfs.addEdge(1,2);
        dfs.addEdge(2,0);
        dfs.addEdge(2,3);
        dfs.addEdge(3,3);
        System.out.println("Following is DepthFirstSearch"+(" Starting from vertex 2"));
        dfs.DFS(2);
    }
}
