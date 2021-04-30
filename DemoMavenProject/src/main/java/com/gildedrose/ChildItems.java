/**
 * 
 */
package com.gildedrose;

/**
 * @author Anand
 *
 */
public class ChildItems extends Item {

	static final int ZERO = 0;
	static final int ONE = 1;
	static final int TWO = 2;
	static final int THREE = 3;
	static final int FIVE = 5;
	static final int TEN = 10;
	
	static final int SULMAX=80;
	static final int MAX=50;
	
	public ChildItems(String itemName, int sellIn, int quality) {
		super(itemName, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	public void decreaseSellIn() {
		this.setSellIn(this.getSellIn()-1);
	}
	/**
	 * 
	 */
	public void increaseQuality(int qty) {
		this.setQuality(this.getQuality()+qty);
	}
	
	public void decreaseQuality(int qty) {
		this.setQuality(this.getQuality() - qty);
	}
	
	private void setMax() {
		if (this.getQuality() >= MAX) 
			this.setQuality(MAX);
	}

	public void updateAgedBrie() {

		increaseQuality(ONE);
		setMax(); //Max can only be 50
	}
	
	public void updateConjure() {
		decreaseQuality(TWO);
		if (this.getQuality() <= ZERO) this.setQuality(ZERO); //Quality cannot be lower than 0
	}
	
	public void updateSulfuras() {
		this.setQuality(SULMAX); //Should always be 80
		
	}
	
	
	public void updateOthers() {
		decreaseQuality(ONE);
	}

	public void updateConcert() {
		/*Rules Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
		Quality drops to 0 after the concert*/
		
		if (this.getSellIn() <=ZERO) 
			this.setQuality(ZERO); //Concert date has expired
		else if(this.getSellIn() <= FIVE)
			increaseQuality(THREE); // 
		else if(this.getSellIn() <= TEN) {
			increaseQuality(TWO);
		}
		else increaseQuality(ONE);
		
		setMax(); //Max can only be 50
	}
	
}
