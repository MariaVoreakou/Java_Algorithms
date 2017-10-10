/*
 * Getter and setter
 */
package artintexercise;

/**
 *
 * @author Maria
 */
public class Ex2Edges {
    private Ex2Node destNode;
    
    public Ex2Edges(Ex2Node destNode){
        this.destNode= destNode;
    }

    public Ex2Node getDestNode() {
        return destNode;
    }

    public void setDestNode(Ex2Node destNode) {
        this.destNode = destNode;
    }
    
}
