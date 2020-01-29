package com.example.daythree;

import com.example.pojo.GelPen;
import com.example.pojo.Pen;
import com.example.pojo.WritingImplement;

public class PolymorphismExample {

	public static void main(String[] args) {
		GelPen myPen = new GelPen("SteveRobet");
		myPen.setBrand("Bic");
		myPen.setColor("BlueGreen");
		//System.out.println(myPen.write("My pen is sooooo cool!!!!!!"));
		myPen.write();
		
		//Dynamic Binding
		Pen pen = myPen;
		
		System.out.println(((Pen)pen).write("from pen"));
		
		WritingImplement writ = myPen;
		
		//.....
		
		((GelPen)writ).write("writing implement");
		
		//writ.write("message");
		
		String o = myPen.write("");
	}

}
