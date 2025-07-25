package recipe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of your recipe: ");
        String recipeName = s.nextLine();
        Recipe recipe = new Recipe(recipeName);

        System.out.println("\nStart adding steps to the recipe.");
        System.out.println("Type 'ingredient' to add an ingredient, 'other' for other steps, 'remove' to delete an ingredient, or 'done' to finish.\n");

        while (true) {
            System.out.print("Enter step type (ingredient/other/remove/done): ");
            String type = s.nextLine().trim().toLowerCase();

            if (type.equals("done")) {
                break;
            }
            switch (type) {
                case "ingredient":
                    System.out.print("Ingredient name: ");
                    String name = s.nextLine();

                    System.out.print("Quantity: ");
                    double quantity = Double.parseDouble(s.nextLine());

                    System.out.print("Unit (e.g., grams, cups): ");
                    String unit = s.nextLine();

                    Ingredient ingredient = new Ingredient(name, quantity, unit);
                    recipe.addStep(new RecipeStep<>(ingredient));
                    break;
                case "other":
                    System.out.print("Enter instruction (e.g., Use a bowl, Wait 10 minutes): ");
                    String instruction = s.nextLine();
                    recipe.addStep(new RecipeStep<>(instruction));
                    break;
                case "remove":
                    System.out.print("Enter the name of the ingredient to remove: ");
                    String ingredientToRemove = s.nextLine();

                    System.out.print("Enter the quantity of the ingredient to remove: ");
                    double quantityToRemove = Double.parseDouble(s.nextLine());

                    boolean removed = recipe.removeByNameAndQuantity(ingredientToRemove, quantityToRemove);

                    if (removed) {
                        System.out.println("Ingredient removed.");
                    } else {
                        System.out.println("No ingredient found with that name and quantity.");
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please type 'ingredient', 'other', 'remove', or 'done'.");
            }
        }
        recipe.printRecipe();
    }
}
