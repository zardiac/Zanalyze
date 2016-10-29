package com.zardiac;
import com.zardiac.stockarchive.Collector;

public class Zanalyze {
    public static void main(String... args) {
	Collector cl = new Collector();
	System.out.println("Welcome to Zanalyze!");
	try{
	    System.out.println(cl.sendGet());
	}catch(Exception ioe)
	    {
		System.out.println(ioe);
	    }
    }
}
