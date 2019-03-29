# AuctionEngine

BidTrackerImplement.java implements BidTrackerInterface.java interface to provide following functionalities :-
1. Record a user's bid on an item, each new bid must be at a higher price than before
2. Get the current winning bid for an item
3. Get all the bids for an item
4. Get all the items on which a user has bid

# Unit test
bidTrakerUnitTests.java class in unitTest folder provides following unit tests:-
1. testAddHigherBid         - test adding new bid higher than current winning bid.
2. testAddLowerBid          - test adding new bid lower than current winning bid.
3. testGetCurrentWinningBid - test to get current winning bid for an item.
4. testGetAllBid            - test to get all bids for an item.
5. testGetAllItemsForUser   - test to get all items user has bid on.

# Unit test result
All tests were successful without any error. Additionally, a screen shot of result screen can be found as unitTestResult.png.
