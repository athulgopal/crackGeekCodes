package com.geeks.graph;

import com.geeks.util.Node;

/**
 * Created by wipro on 7/17/17.
 */
public class DFS {
    public static Node root=null;
    public void initGraph(){
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        Node node6=new Node(6);
        Node node7=new Node(7);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);

        root=node1;
    }

    public void depthSearch(Node crr){
        System.out.println("  "+crr.getData());
        if(crr.getLeft()!=null)
            depthSearch(crr.getLeft());
        if(crr.getRight()!=null)
            depthSearch(crr.getRight());
    }

    public static void main(String args[]){
        DFS dfs=new DFS();
        dfs.initGraph();
        dfs.depthSearch(root);
    }
}
