package com.epam.logging;

import java.util.Arrays;

public class HouseConstruction {
	
	int area;
	int materialCost;
	String material;
	String[] materials = {"standard", "above standard", "high standard", "high standard and automated"};
	

	public HouseConstruction(int area, String material) {
		this.area = area;
		this.material = material;
		switch(Arrays.asList(materials).indexOf(getMaterial())) {
			case 0:
				materialCost = 1200;
				break;
			case 1:
				materialCost = 1500;
				break;
			case 2:
				materialCost = 1800;
				break;
			case 3:
				materialCost = 2500;
				break;
		}
		
	}
	
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public int getEstimatedCost() {
		return area * materialCost;
	}	
}
