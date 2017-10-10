/*
 * Initialize of the MIN MAX Tree
 */
package artintexercise;

/**
 *
 * @author Maria
 */
public class Ex2Tree {

    public Ex2Tree() {
        Ex2Node n1 = new Ex2Node("N1", "MAX");
        Ex2Node n2 = new Ex2Node("N2", "MIN");
        Ex2Node n3 = new Ex2Node("N3", "MIN");
        Ex2Node n4 = new Ex2Node("N4", "MAX");
        Ex2Node n5 = new Ex2Node("N5", "MAX");
        Ex2Node n6 = new Ex2Node("N6", "MAX");
        Ex2Node n7 = new Ex2Node("N7", "MAX");
        Ex2Node n8 = new Ex2Node("N8", "MAX");
        Ex2Node n9 = new Ex2Node("N9", "MAX");
        Ex2Node n10 = new Ex2Node("N1", "MIN", 1);
        Ex2Node n11 = new Ex2Node("N11", "MIN", 8);
        Ex2Node n12 = new Ex2Node("N12", "MIN", 5);
        Ex2Node n13 = new Ex2Node("N13", "MIN", 6);
        Ex2Node n14 = new Ex2Node("N14", "MIN", 4);
        Ex2Node n15 = new Ex2Node("N15", "MIN", 7);
        Ex2Node n16 = new Ex2Node("N16", "MIN", 9);
        Ex2Node n17 = new Ex2Node("N17", "MIN", 3);
        Ex2Node n18 = new Ex2Node("N18", "MIN", 2);
        Ex2Node n19 = new Ex2Node("N19", "MIN", 6);
        Ex2Node n20 = new Ex2Node("N20", "MIN", 10);
        Ex2Node n21 = new Ex2Node("N21", "MIN", 2);

        
        n1.addLink(n2);
        n1.addLink(n3);
        
        n2.addLink(n4);
        n2.addLink(n5);
        n2.addLink(n6);
        
        n3.addLink(n7);
        n3.addLink(n8);
        n3.addLink(n9);
        
        n4.addLink(n10);
        n4.addLink(n11);
        
        n5.addLink(n12);
        
        n6.addLink(n13);
        n6.addLink(n14);
        n6.addLink(n15);
        
        n7.addLink(n16);
        
        n8.addLink(n17);
        n8.addLink(n18);
        
        n9.addLink(n19);
        n9.addLink(n20);
        n9.addLink(n21);
        
        runMINMAX(n1);
    }

    public void runMINMAX(Ex2Node n){
        System.out.println("Node "+n.getName()+" should Start with move "+Algorithms.StartMINMAX(n));
    }
    
}
