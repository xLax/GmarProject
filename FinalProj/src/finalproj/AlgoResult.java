/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 *
 */
public class AlgoResult
{
    private Customer customer;
    private int nRouteCost;
    private List<Integer> route;

    public AlgoResult(Customer customer)
    {
        this.customer = new Customer(customer);
        this.nRouteCost = 0;
        this.route = new ArrayList<>();
    }

    public Customer getCustomer() { return this.customer; }

    public int getRouteCost() { return this.nRouteCost; }

    public void setRouteCost(int routeCost) { this.nRouteCost = routeCost; }

    public List<Integer> getRoute(){ return this.route; }

    public void addNode(int n)
    {
        this.route.add(n);
    }

    public void print()
    {
        System.out.println("Cost: " + this.nRouteCost);
        System.out.print("Route: ");
        System.out.print(this.route.get(0));
        for (int i = 1; i < this.route.size(); i++) {
            System.out.print(" -> " + this.route.get(i));
        }
    }
}
