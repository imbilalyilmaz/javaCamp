package Entities;

import Abstracts.Entity;

public class Game implements Entity{
	private int id;
	private String gameName;
	private String developer;
	private double price;
	
	public Game(int id, String gameName, String developer, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.developer = developer;
		this.price = price;
	}
	
	
	public Game() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getDeveloper() {
		return developer;
	}
	public void setDeveloper(String developer) {
		this.developer = developer;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
