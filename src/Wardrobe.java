
public class Wardrobe extends AbstractFurniture {
	private int capacity;
	
	public Wardrobe(int c){
		this.capacity=c;
	}
	
	@Override
	public String toString(){
		return String.format("Material\t %s \nColour\t\t %s \nCapacity[liters]\t %d \nPrice[$]\t\t %d\n\n", this.material,this.colour,this.capacity,this.price);
	}
}
