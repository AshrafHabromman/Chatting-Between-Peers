/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.network1_part2_final;

import java.net.Socket;

/**
 *
 * @author Ashraf
 */
public class User {
    
    private String userName;
    private int clientPortNum; 
    private Socket connectionSocket;
    
    public User(String userName,int clientPortNum, Socket connectionSocket){
        this.userName = userName;
        this.clientPortNum = clientPortNum;
        this.connectionSocket = connectionSocket; 
    }
    
    public String getUserName(){
        return this.userName;
    }
    
    public Socket getConnectionSocket(){
        return this.connectionSocket;
    }
    public int  getclientPortNum(){
        return this.clientPortNum;
    }
}
