package com.gildedrose;

public class testGildedRose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildItems[] items = new ChildItems [] {
				new ChildItems("Aged Brie",2,0),
				new ChildItems("Concert",15,20),
				new ChildItems("Concert",10,15),
				new ChildItems("Concert",5,20),
				new ChildItems("Concert",0,20),
				new ChildItems("Conjure", 3, 6),
				new ChildItems("Sulfuras", 0, 80),
				new ChildItems("Sulfuras", -1, 79),
				new ChildItems("Others", 2, 50),
				new ChildItems("Others2", 1, 1)
		};
		
		GildedRose app = new GildedRose(items);
		
		 int days = 2;
	        if (args.length > 0) {
	            days = Integer.parseInt(args[0]) + 1;
	        }

	        for (int i = 0; i < days; i++) {
	            System.out.println("-------- day " + i + " --------");
	            System.out.println("name, sellIn, quality");
	            for (Item item1 : items) {
	                System.out.printf("%s, %d, %d \n", item1.getItemName(), item1.getSellIn(), item1.getQuality());
	            }
	            System.out.println();
	            app.updateQuality();
	        }

	}

}
