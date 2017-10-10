/*
 * Getters Setters of Edge
 */
package artintexercise;

/**
 *
 * @author Maria Voreakou
 */
public class Edge {
    
    private int ds;
    private Node destNode;


    public Edge(int ds, Node destNode) {
        this.ds = ds;
        this.destNode = destNode;
    }

    public int getDs() {
        return ds;
    }

    public void setDs(int ds) {
        this.ds = ds;
    }

    public Node getDestNode() {
        return destNode;
    }

    public void setDestNode(Node destNode) {
        this.destNode = destNode;
    }
    
    
    
}
