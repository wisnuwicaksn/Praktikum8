public class Item{
	int shippingWeight;
	String description;
	
	public Item(int shippingWeight, String description) {
		this.shippingWeight = shippingWeight;
		this.description = description;
	}

	public int getPriceForQuantity() {
		return shippingWeight * 40;
	}
	public int getTax() {
		return getPriceForQuantity() * 5/100;
	}
	public boolean inStock() {
		return true;
	}
}