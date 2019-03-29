/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.auctionengine;

/**
 *
 * @author shanky
 */
public class User {
    //attributes
    private String  userName;
    
    //constructor
    public User(String userNameIn){
        userName = userNameIn;
    }
    
    //getter method for userName attribute
    public String getUserName(){
        return userName;
    }
}
