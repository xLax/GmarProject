/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

/**
 *
 * @author Liron Levi
 */
public class Edge
{
    private static int idCounter = 0;
    
    private int id;
    private int nTotalSlots;
    private int nSlotCurrentUsage;
    private int nEdgeCost;
    private Node node1;
    private Node node2;

    public Edge(int nTotalSlots, int nSlotUseCost, Node node1, Node node2)
    {
        this.nTotalSlots = nTotalSlots;
        this.nEdgeCost = nSlotUseCost;
        this.nSlotCurrentUsage = 0;
        this.node1 = node1;
        this.node2 = node2;
        this.node1.addEdge(this);
        this.node2.addEdge(this);
    }

    public int getTotalSlots()
    {
        return nTotalSlots;
    }

    public void setTotalSlots(int nTotalSlots)
    {
        this.nTotalSlots = nTotalSlots;
    }

    public int getSlotCurrentUsage()
    {
        return nSlotCurrentUsage;
    }

    public int getSlotUseCost()
    {
        return nEdgeCost;
    }

    public void setSlotUseCost(int nSlotUseCost)
    {
        this.nEdgeCost = nSlotUseCost;
    }

    public int getId()
    {
        return id;
    }

    public Node getNode1()
    {
        return node1;
    }

    public void setNode1(Node node1)
    {
        this.node1 = node1;
    }

    public Node getNode2()
    {
        return node2;
    }

    public void setNode2(Node node2)
    {
        this.node2 = node2;
    } 
    
}
