package utilities;

import food.Food;

public class MGMInterviewFoodSort {

	public static void sortFood(Food[] sortedFood, String item) {
		for (int i = 0; i < sortedFood.length - 1; i++) {
			for (int j = 0; j < sortedFood.length - i - 1; j++) {
				if (sortedFood[j].size > sortedFood[j + 1].size) {
					Food flip = sortedFood[j + 1];
					sortedFood[j + 1] = sortedFood[j];
					sortedFood[j] = flip;
				}
				if (sortedFood[j].size == sortedFood[j + 1].size && sortedFood[j].whoAmI().contains(item)) {
					Food flip = sortedFood[j + 1];
					sortedFood[j + 1] = sortedFood[j];
					sortedFood[j] = flip;
				}
			}
		}
//		print result
		for (Food foodItem : sortedFood) {
			System.out.println(foodItem.whoAmI().substring(foodItem.whoAmI().indexOf('.'), foodItem.whoAmI().length())
					.replaceFirst(".", "") + " " + foodItem.size);
		}
	}
}
