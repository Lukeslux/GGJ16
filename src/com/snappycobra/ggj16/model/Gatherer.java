package com.snappycobra.ggj16.model;

public class Gatherer extends Job {
	private ResourcePoint gatherAt;
	private int yield;
	private int maxYield;
	private int state;
	private Unit owner;
	
	public Gatherer(Unit owner) {
		this.owner = owner;
		yield = 0;
		maxYield = 5;
	}
	
	public void update() {
		switch(state){
		case 1:
			if(owner.moveTo(gatherAt.getBody())) {
				state = 2;
			}
			break;
		case 2:
			if(yield==maxYield){
				state=3;
			} else {
				Work();
			}
			break;
		case 3:
			if(owner.moveTo(owner.getBase().getBody())) {
				state=1;
				storeResources();
			}
			
		}
	}
	
	public void Work(){
		System.out.println("working");
	}
	
	public void storeResources() {
		owner.getOwner().addResource(gatherAt.getResource().getResName(), yield);
	}
}
