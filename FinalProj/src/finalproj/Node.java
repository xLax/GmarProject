/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;

/**
 *
 *
 */
public class Node
{
    private int id;
    private List<Edge> lstEdges;
    
    public Node(int id)
    {
        this.id = id;
        this.lstEdges = new ArrayList<Edge>();
    }

    public int getId()
    {
        return this.id;
    }

    public List<Edge> getEdges()
    {
        return this.lstEdges;
    }

    public void addEdge(Edge newEdge) 
    {
        this.lstEdges.add(newEdge);
    }

    public void removeEdge(Edge delEdge)
    {
        if(isEdgeExist(delEdge))
        {
            this.lstEdges.remove(delEdge);
        }
    }

    public List<Node> getNeighbors()
    {
        List<Node> lst = new ArrayList<Node>();
        Node nOther;

        for (Edge e : lstEdges)
        {
            nOther = e.getOtherNode(this.id);

            if (!lst.contains(nOther))
            {
                lst.add(nOther);
            }
        }

        return lst;
    }
    
    public boolean isEdgeExist(Edge e)
    {
        boolean isFound = false;
        
        for(int i = 0; i < this.lstEdges.size() && !isFound; i++)
        {
            if(((this.lstEdges.get(i).getNode1().getId() == e.getNode1().getId()  &&
                 this.lstEdges.get(i).getNode2().getId() == e.getNode2().getId()) ||
                (this.lstEdges.get(i).getNode1().getId() == e.getNode2().getId()  &&
                 this.lstEdges.get(i).getNode2().getId() == e.getNode1().getId())) &&
                 this.lstEdges.get(i).getEdgeCost() == e.getEdgeCost())
            {
                isFound = true;
            }
        }
        
        return isFound;
    }
}
