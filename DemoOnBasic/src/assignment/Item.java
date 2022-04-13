package assignment;

public class Item {
	
	private  int itemId;
    private String itemName;
    private  float itemPrice;
	public Item(int itemId, String itemName, float itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemItemPrice(float item) {
		this.itemPrice = item;
	}
}
