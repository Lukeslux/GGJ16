package com.snappycobra.ggj16.model;

import org.dyn4j.dynamics.Body;

import com.snappycobra.motor.graphics.Sprite;
import com.snappycobra.motor.maps.GameObject;

public class Building  extends GameObject{
	Sprite sprite;

	public Building(String name, Body body) {
		super(name, body);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub		
	}
	
	public Sprite getSprite() {
		return sprite;
	}
	
}
