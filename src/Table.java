
public class Table extends AbstractFurniture {
	private double width;
	private double length;
	private double area;
	
	public Table(double wid, double leng){
		this.width=wid;
		this.length=leng;
		this.area=wid*leng;
	}
	public String toString(){
		return String.format("Material %s\nColour\t %s \nPrice\t\t %d\nLength\t\t%.2f\nArea\t\t%.2f\n\n", this.material,this.colour,this.price,this.length,this.area);
	}
}
