package inventoryManagement;

import food.Food;
import food.Potato;
import food.Tomato;

import static utilities.MGMInterviewFoodSort.*;

public class InventoryManager {

	private static int numberOfItems = 10;
	private static String tomato = "Tomato";

	public static void main(String[] args) {

		Food[] potatoes = new Food[numberOfItems];

		Tomato p0 = new Tomato();
		Tomato p1 = new Tomato();
		Potato p2 = new Potato();
		Potato p3 = new Potato();
		Potato p4 = new Potato();
		Potato p5 = new Potato();
		Potato p6 = new Potato();
		Potato p7 = new Potato();
		Potato p8 = new Potato();
		Potato p9 = new Potato();

		p0.size = 11;
		p2.size = 1;
		p3.size = 42;
		p4.size = 77;
		p5.size = 55;
		p6.size = 46;
		p7.size = 12;
		p8.size = 11;
		p9.size = 9;

		potatoes[0] = p0;
		potatoes[1] = p1;
		potatoes[2] = p2;
		potatoes[3] = p3;
		potatoes[4] = p4;
		potatoes[5] = p5;
		potatoes[6] = p6;
		potatoes[7] = p7;
		potatoes[8] = p8;
		potatoes[9] = p9;

		sortFood(potatoes, tomato);
	}

}
