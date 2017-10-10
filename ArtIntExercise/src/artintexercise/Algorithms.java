/*
 * All Big Thing is here!
 * Algorithms MINMAX, DFS, COST, ASTAR
 * 
 */
package artintexercise;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Maria Voreakou
 */
public class Algorithms {
    public static String DFS(Node n, Node goalNode ){
        
        if(n.getName().equalsIgnoreCase(goalNode.getName())){
            return goalNode.getName();
        }
        
        for(int i=0; i<n.getEdges().size();i++){
            String s =DFS(n.getEdges().get(i).getDestNode(),goalNode);
            if(!s.isEmpty()){
                return n.getName()+" -> "+s;
            }
        }
        
        return "";
    }
    public static int MINMAX(Ex2Node n){
        int bestValue;
        
        if(n.getEdges().isEmpty()){
            return n.getValue();
        }
        
        if(n.getOwner().equalsIgnoreCase("MIN")){
            bestValue=999;
        }
        else {
            bestValue=-999;
        }
        for (int i=0; i<n.getEdges().size();i++){
            int nodeValue= MINMAX(n.getEdges().get(i).getDestNode());
            if(n.getOwner().equalsIgnoreCase("MIN")){
                if(bestValue>nodeValue){
                    bestValue=nodeValue;
                }
            }
            else{
                if(bestValue<nodeValue){
                    bestValue=nodeValue;
                }
            }
        }
        n.setValue(bestValue);
        
        return bestValue;
    }
    public static String StartMINMAX(Ex2Node n){
        int bestValue;
        String bestNode ="";
        if(n.getOwner().equalsIgnoreCase("MIN")){
            bestValue=999;
        }
        else {
            bestValue=-999;
        }
        for (int i=0; i<n.getEdges().size();i++){
            int nodeValue= MINMAX(n.getEdges().get(i).getDestNode());
            if(n.getOwner().equalsIgnoreCase("MIN")){
                if(bestValue>nodeValue){
                    bestValue=nodeValue;
                    bestNode=n.getEdges().get(i).getDestNode().getName();
                    
                }
            }
            else{
                if(bestValue<nodeValue){
                    bestValue=nodeValue;
                    bestNode=n.getEdges().get(i).getDestNode().getName();
                }
            }
        }
        n.setValue(bestValue);
        
        return bestNode;
    }
    
    public static String COST(Node n, Node goalNode ){
        
        if(n.getName().equalsIgnoreCase(goalNode.getName())){
            return goalNode.getName();
        }
        // Sorting
        Collections.sort(n.getEdges(), new Comparator<Edge>() {
        @Override
        public int compare(Edge e1, Edge e2)
        {

            if(e1.getDs()>e2.getDs()){
                return 1;
            }
            else if(e1.getDs()<e2.getDs()){
                return -1;
            }
            else{
                return 0;
            }
        }
    });
        
        
        for(int i=0; i<n.getEdges().size();i++){
            String s =COST(n.getEdges().get(i).getDestNode(),goalNode);
            if(!s.isEmpty()){
                return n.getName()+" -> "+s;
            }
        }
        
        return "";
    }
    
    public static String ASTAR(Node n, Node goalNode ){
        
        if(n.getName().equalsIgnoreCase(goalNode.getName())){
            return goalNode.getName();
        }
        // Sorting
        Collections.sort(n.getEdges(), new Comparator<Edge>() {
        @Override
        public int compare(Edge e1, Edge e2)
        {

            if((e1.getDs()+e1.getDestNode().gethNumber())>(e2.getDs()+e2.getDestNode().gethNumber())){
                return 1;
            }
            else if((e1.getDs()+e1.getDestNode().gethNumber())<(e2.getDs()+e2.getDestNode().gethNumber())){
                return -1;
            }
            else{
                return 0;
            }
        }
    });
        
        
        for(int i=0; i<n.getEdges().size();i++){
            String s =ASTAR(n.getEdges().get(i).getDestNode(),goalNode);
            if(!s.isEmpty()){
                return n.getName()+" -> "+s;
            }
        }
        
        return "";
    }
    

}
