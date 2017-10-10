/*
 * Initialize of Nodes, and methods for Run Algorithms
 */
package artintexercise;

import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class Graph {
 
    private ArrayList <Node> nodes;

    public Graph() {
        nodes= new ArrayList<Node> ();
        
        Node s = new Node("S",4);
        Node a = new Node("A",2);
        Node b = new Node("B",3);
        Node c = new Node("C",4);
        Node d = new Node("D",5);
        Node e = new Node("E",6);
        Node f = new Node("F",4);
        Node g = new Node("G",0);
        Node h = new Node("H",3);
        Node i = new Node("I",2);
        Node j = new Node("J",1);
        Node k = new Node("K",5);
        Node l = new Node("L",6);
        
        
        s.addLink(2, a);
        s.addLink(2, k);
        s.addLink(1, f);
        
        a.addLink(2, b);
        
        b.addLink(2, c);
        b.addLink(3, g);
        
        c.addLink(2, d);
        
        d.addLink(1, e);
        d.addLink(5, g);
        
        f.addLink(1, h);
        
        h.addLink(1, i);
        
        i.addLink(1, j);
        
        j.addLink(1, g);
        
        k.addLink(1, l);
        
        nodes.add(s);
        nodes.add(a);
        nodes.add(b);
        nodes.add(c);
        nodes.add(d);
        nodes.add(e);
        nodes.add(f);
        nodes.add(g);
        nodes.add(h);
        nodes.add(i);
        nodes.add(j);
        nodes.add(k);
        nodes.add(l);
        
        System.out.println("DFS Algorithm\n");
        runDFS(s,g);
        System.out.println("----------------------\n");
        System.out.println("Cost Algorithm\n");
        runCOST(s,g);
        System.out.println("----------------------\n");
        System.out.println("A* Algorithm\n");
        runASTAR(s,g);
        
        
        
       
        
    }
    private void runASTAR(Node n, Node goal){
        String result = Algorithms.ASTAR(n, goal);
        
        if(!result.isEmpty()){
            System.out.println(result);
            
        }
        else{
            System.out.println("No path found from "+n.getName()+" to "+goal.getName());
        }
    }
    private void runDFS(Node n, Node goal){
        String result = Algorithms.DFS(n, goal);
        
        if(!result.isEmpty()){
            System.out.println(result);
            
        }
        else{
            System.out.println("No path found from "+n.getName()+" to "+goal.getName());
        }
    }
    private void runCOST(Node n, Node goal){
        String result = Algorithms.COST(n, goal);
        
        if(!result.isEmpty()){
            System.out.println(result);
            
        }
        else{
            System.out.println("No path found from "+n.getName()+" to "+goal.getName());
        }
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }
    
    
}
