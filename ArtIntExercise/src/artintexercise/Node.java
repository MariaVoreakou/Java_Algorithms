/*
 * Initialization of Node, Getter and setter
 */
package artintexercise;

import java.util.ArrayList;

/**
 *
 * @author Maria
 */
public class Node {
    private String name;
    private int hNumber;
    private ArrayList <Edge> edges;

    public Node(String name, int hNumber) {
        this.name = name;
        this.hNumber = hNumber;
        this.edges= new ArrayList<Edge>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int gethNumber() {
        return hNumber;
    }

    public void sethNumber(int hNumber) {
        this.hNumber = hNumber;
    }

    public void addLink(int ds, Node n){
        Edge edge = new Edge(ds, n);
        this.edges.add(edge);
              
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
    
    
    
    
}
