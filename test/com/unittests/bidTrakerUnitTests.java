/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unittests;

import com.auctionengine.BidTrackerImplement;
import com.auctionengine.BidTrackerInterface;
import com.auctionengine.Item;
import com.auctionengine.User;
import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shanky
 */
public class bidTrakerUnitTests {
    
    List<Item> items = new ArrayList<>();
    List<User> users = new ArrayList<>();
    BidTrackerInterface bidTracker = new BidTrackerImplement();
    
    Item item1 = new Item("PS4","brand new PS4");
    Item item2 = new Item("GM Cricket bat","brand new Cricket bat");
        
    //setup for tests
    public bidTrakerUnitTests() {
        users.add(new User("jia"));
        users.add(new User("shaz"));
        
        items.add(item1);
        items.add(item2);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    //test when bid is higher than winning bid
    @Test
    public void testAddHigherBid() {
        assertEquals(true,bidTracker.makeBid("jia", item1, 200));
    }
    
    //test when bid is lower than winning bid
    @Test
    public void testAddLowerBid() {
        bidTracker.makeBid("shaz", item1, 210);
        assertEquals(false,bidTracker.makeBid("jia", item1, 200));
    }
    
    //test current winning bid
    @Test
    public void testGetCurrentWinningBid() {
        double bid = 210.0;
        bidTracker.makeBid("jia", item1, bid);
        assertEquals(bid,bidTracker.getCurrentWinningBid(item1),0);
    }
    
    //test get all bids for item
    @Test
    public void testGetAllBid() {
        bidTracker.makeBid("jia", item1, 210);
        bidTracker.makeBid("shaz", item1, 220);
        
        List<Pair<String,Double>> result = new ArrayList<>();
        result.add(new Pair("jia",210.0));
        result.add(new Pair("shaz",220.0));
        
        assertEquals(result,bidTracker.getAllBids(item1));
    }
    
    //test get all bids for item
    @Test
    public void testGetAllBidForUser() {
        bidTracker.makeBid("jia", item1, 210);
        bidTracker.makeBid("shaz", item1, 220);
        bidTracker.makeBid("jia", item2, 421);
        
        List<Item> result = new ArrayList<>();
        result.add(item1);
        result.add(item2);
        
        assertEquals(result,bidTracker.getAllItemsForUser(items, "jia"));
    }
    
}
