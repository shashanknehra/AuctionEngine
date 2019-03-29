/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auctionengine;

import java.util.List;
import javafx.util.Pair;

/**
 *
 * @author shanky
 */
public interface BidTrackerInterface {
    //interface methods
    public boolean makeBid(String userName, Item item, double newBid);
    public double getCurrentWinningBid(Item item);
    public List<Pair<String,Double>> getAllBids(Item item);
    public List<Item> getAllItemsForUser(List<Item> items, String userName);
    
}
