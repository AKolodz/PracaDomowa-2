
public class Coach extends AbstractFurniture {
	private int nrOfSeats;
	
	public Coach(){}
	
	public void setSeats(int s){
		this.nrOfSeats=s;
	}
	@Override
	public String toString(){
		return String.format("Material\t %s \nColour\t\t %s \nPrice\t\t %d\nNr of seats\t%d\n\n", this.material,this.colour,this.price,this.nrOfSeats);
	}
}
