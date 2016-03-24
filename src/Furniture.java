import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Furniture{
	public static void main(String args[]){
		int i=0;
		
		//Set
		String furnitureTypes[]={"Coaches","Wardrobes","Tables","Coaches"}; //z premedystacj¹ da³em 2x Coaches
		Set<String> types=new HashSet<String>();
		for(String t:furnitureTypes){
			types.add(t);
		}
		
		System.out.println("Here is our offer:");
		System.out.println(types+"\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		//Tablica
		Coach coaches[]=new Coach[3];
		for(Coach furniture:coaches){
			furniture=new Coach();
			furniture.setMaterial("Leather");
			furniture.setPrice(2000);
			coaches[i++]=furniture;
		}
		coaches[0].setColour("Black");
		coaches[0].setSeats(3);
		coaches[1].setColour("Brown");
		coaches[1].setSeats(2);
		coaches[2].setColour("Blue");
		coaches[2].setSeats(3);
		
		System.out.println("COACHES:");
		for(Coach furniture:coaches){
			System.out.println(furniture);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Array List
		List<Wardrobe> wardrobesList=new ArrayList<Wardrobe>();
		for(i=0;i<3;i++){
			Wardrobe wardrobe=new Wardrobe(2500);
			wardrobe.setMaterial("\tWooden");
			wardrobe.setPrice(2200);
			wardrobesList.add(wardrobe);
		}
		wardrobesList.get(0).setColour("\tDark chocolate");
		wardrobesList.get(1).setColour("\tGrey");
		wardrobesList.get(2).setColour("\tCobalt blue");
		
		wardrobesList.add(new Wardrobe(1500));
		wardrobesList.get(wardrobesList.size()-1).setMaterial("\tSteel");
		wardrobesList.get(wardrobesList.size()-1).setPrice(3000);
		wardrobesList.get(wardrobesList.size()-1).setColour("\tGrey");
		
		System.out.println("WARDROBES:");
		for(Wardrobe wardrobe:wardrobesList){
			System.out.println(wardrobe);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		//Linked List
		List<Table> tablesList=new LinkedList<Table>();
		for(i=0;i<2;i++){
			Table table= new Table(1.35, 2.0);
			table.setMaterial("\tPlywood");
			table.setPrice(600);
			tablesList.add(table);
		}
		tablesList.get(0).setColour("\tAntiqued-Red");
		tablesList.get(1).setColour("\tDeep brown");
		//zabawa "wciskaniem" do listy
		tablesList.add(0, new Table(2,2.5));
		tablesList.get(0).setColour("\tWhite");
		tablesList.get(0).setMaterial("\tWooden");
		tablesList.get(0).setPrice(1000);
		System.out.println("TABLES:");
		for(Table table:tablesList){
			System.out.println(table);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		
		//Mapy
		Map<Integer,AbstractFurniture> clientsChoice=new HashMap<>();
		Scanner choice=new Scanner(System.in);
		
		System.out.println("Please, enter the number of product that you would like to buy (in sequence: Coach, Wardrobe and Table):");
		int number=choice.nextInt(); //Tak, wiem, niezabezpieczone, nie chcia³o mi siê 
		clientsChoice.put(1,coaches[number-1]);
		number=choice.nextInt();
		clientsChoice.put(2,wardrobesList.get(number-1));
		number=choice.nextInt();
		clientsChoice.put(3,tablesList.get(number-1));
		
		System.out.println("Your choices\n~~COACH:~~");
		System.out.println(clientsChoice.get(1));
		System.out.println("~~WARDROBE:~~");
		System.out.println(clientsChoice.get(2));
		System.out.println("~~TABLE:~~");
		System.out.println(clientsChoice.get(3));
	}
}
