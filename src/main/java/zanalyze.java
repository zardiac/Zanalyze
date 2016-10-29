package com.zardiac;

public class StockArchive {
    public static void main(String... args) {
	Collector cl = new Collector();
	System.out.println("Welcome to Stock Archive!");
	try{
	    System.out.println(cl.sendGet());
	}catch(Exception ioe)
	    {
		System.out.println(ioe);
	    }
    }
}
