package com.niit.demoBeans;

public class car 
{
	private String color;
	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		System.out.println("CALLING SETTER METHOD TO SET THE VALUE OF COLOR " + color);
		this.color = color;
	}
}
