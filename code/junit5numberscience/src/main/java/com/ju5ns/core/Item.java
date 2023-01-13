package com.ju5ns.core;

public class Item {
	String itemCode;
	int units;
	double unitPrice;

	public Item(String itemCode, int units, double unitPrice) {
		this.itemCode = itemCode;
		this.units = units;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
