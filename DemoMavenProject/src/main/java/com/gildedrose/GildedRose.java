package com.gildedrose;

public class GildedRose {
	ChildItems[] items;
	static final String AGEDBRIE="Aged Brie";
	static final String CONCERT="Concert";
	static final String CONJURE="Conjure";
	static final String SULFARAS="Sulfuras";
	
	
    public GildedRose(ChildItems[] items) {
        this.items = items;
    }
    
    public void updateQuality() {
        for (ChildItems item : items) {
        	switch (item.getItemName()) {
        	case AGEDBRIE:
        		item.updateAgedBrie();
        		break;
        	case CONCERT:
        		item.updateConcert();
        		break;
        	case CONJURE:
        		item.updateConjure();
        		break;
        	case SULFARAS:        		
        		item.updateSulfuras();
        		break;
        	default: 
        		item.updateOthers();
        	}
        	item.decreaseSellIn();	
        }
        
    }
}
