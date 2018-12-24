/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

import java.util.List;

/**
 *
 * @author Liron Levi
 */
public class Node
{
    private static int idCounter = 0;
    
    private int id;
    private List<Edge> lstEdges;
    
    public Node()
    {
        this.id = idCounter++;
        
    }
    
    public void addEdge(Edge newEdge) 
    {
        this.lstEdges.add(newEdge);
    }

    public int getId()
    {
        return id;
    }
            
}