
public abstract class AbstractFurniture {
	protected String material;
	protected String colour;
	protected int price;
	
	public void setMaterial(String m){
		this.material=m;
	}
	public void setColour(String c){
		this.colour=c;
	}
	public void setPrice(int p){
		this.price=p;
	}
	public String toString(){
		return String.format("Material\t %s \nColour\t\t %s \nPrice\t\t %d\n\n", this.material,this.colour,this.price);
	}
}
