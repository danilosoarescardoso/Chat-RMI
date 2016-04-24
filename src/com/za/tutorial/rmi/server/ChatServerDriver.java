package com.za.tutorial.rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ChatServerDriver{
	
	public static void main (String args[]) throws MalformedURLException, RemoteException, AlreadyBoundException{
		Naming.bind("RMIChatServer", new ChatServer());
		
		
	}

}
