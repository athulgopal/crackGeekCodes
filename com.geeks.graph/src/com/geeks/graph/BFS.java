package com.geeks.graph;

import com.geeks.util.Node;
import java.util.ArrayList;

/**
 * Breadth first search Algorithm with the help of a list
 */
public class BFS {
    public static ArrayList list=new ArrayList();
    public static Node root=null;
    public void initGraph() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);

        root = node1;
    }
    public void breadthSearch(){
       while(list !=null && list.size()>0){
           Node node=(Node) list.remove(0);
           if(node.getLeft()!=null)
               list.add(node.getLeft());
           if(node.getRight()!=null)
               list.add(node.getRight());
           System.out.println(node.getData());
       }
    }
    public static void main(String args[]){
        BFS bfs=new BFS();
        bfs.initGraph();
        list.add(root);
        bfs.breadthSearch();
        list.add(root);
    }
}
