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
public class BidTrackerImplement implements BidTrackerInterface{
    
    @Override
    public boolean makeBid(String userName, Item item, double newBid) {
        //if winning bid for the item is smaller then new bid, add bid to the item and return true otherwise return false
        if(item.getWinningBid() < newBid){
            item.addNewBid(userName, newBid);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public double getCurrentWinningBid(Item item) {
        //return current winning bid on the item
        return item.getWinningBid();
    }

    @Override
    public List<Pair<String,Double>> getAllBids(Item item) {
        //return all bids on the item
        return item.getAllBids();
    }

    @Override
    public List<Item> getAllItemsForUser(List<Item> items, String userName) {
        //list of items for given user
        List<Item> itemsForUser = new ArrayList<>();
        
        for(int i=0;i<items.size();i++){
            //instance of item at i
            Item iItem = items.get(i);
            //bids on item at i
            List<Pair<String,Double>> itemBids = iItem.getAllBids();
            //check if itemBids is empty
            if(!itemBids.isEmpty()){
                for(int x=0;x<itemBids.size();x++){
                    //if key for a bid equals user name, add iItem to list for items for user and break the loop
                    if(itemBids.get(x).getKey().equals(userName)){
                        itemsForUser.add(iItem);
                        break;
                    }
                }
            }
        }
        //return items for user
        return itemsForUser;
    }
    
    
}
