/*
 * Class for initialization Of nodes
 * Getters and Setters
 */
package artintexercise;

import java.util.ArrayList;

/**
 *
 * @author Maria Voreakou
 */
public class Ex2Node {

    private String name;
    private String owner;
    private int value;
    private ArrayList<Ex2Edges> edges;

    public Ex2Node(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.value = 0;
        this.edges = new ArrayList<Ex2Edges>();
    }

    public Ex2Node(String name, String owner, int v) {
        this.name = name;
        this.owner = owner;
        this.value = v;
        this.edges = new ArrayList<Ex2Edges>();
    }

    public void addLink(Ex2Node n) {
        Ex2Edges edge = new Ex2Edges(n);
        this.edges.add(edge);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<Ex2Edges> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Ex2Edges> edges) {
        this.edges = edges;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
