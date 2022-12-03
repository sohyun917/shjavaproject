package shproject;

public class Cafe {
	public String name;
	public int inoutStock;
	
	public Cafe() {}
	
	public Cafe(String name, int inoutStock) {
		this.name = name;
		this.inoutStock = inoutStock;
	}
	public String getName() {
		return this.name;
	}
	public int getInoutStock() {
		return this.inoutStock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setInoutStock(int inoutStock) {
		this.inoutStock = inoutStock;
	}

}
