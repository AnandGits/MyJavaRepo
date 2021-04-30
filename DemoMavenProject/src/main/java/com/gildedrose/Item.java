package com.gildedrose;

/**
 * @author Anand
 *
 */
public abstract class Item {
	private String itemName;
	private int sellIn;
	private int quality;
	
	public Item(String itemName, int sellIn, int quality) {
	//	super();
		this.itemName = itemName;
		this.sellIn = sellIn;
		this.quality = quality;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getSellIn() {
		return sellIn;
	}
	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public abstract void decreaseSellIn();
	public abstract void increaseQuality(int qty);
	public abstract void decreaseQuality(int qty);
}
