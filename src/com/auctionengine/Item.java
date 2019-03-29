/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auctionengine;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author shanky
 */
public class Item {
    
    //attributes
    private String itemName;
    private String itemDes;
    private double winningBid;
    private List<Pair<String,Double>> bids;
    
    //constructor
    public Item(String itemNameIn, String itemDesIn){
        itemName = itemNameIn;
        itemDes = itemDesIn;
        winningBid = 0;
        bids = new ArrayList<>();
    }
    
    //getter methods
    public String getItemName(){
        return itemName;
    }
    public String getItemDes(){
        return itemDes;
    }
    public double getWinningBid(){
        return winningBid;
    }
    public List<Pair<String,Double>> getAllBids(){
        return bids;
    }
    
    //add new bid for the item
    public void addNewBid(String user, double newBid){
        bids.add(new Pair(user,newBid));
        winningBid = newBid;
    }
    
}
