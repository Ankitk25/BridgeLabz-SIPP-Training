package recipe;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private List<RecipeStep<?>> steps;

    public Recipe(String name) {
        this.name = name;
        this.steps = new ArrayList<>();
    }
    public void addStep(RecipeStep<?> step) {
        steps.add(step);
    }
    public void removeStep(int index) {
        if (index >= 0 && index < steps.size()) {
            steps.remove(index);
        }
    }
    public boolean removeByNameAndQuantity(String ingredientName, double quantity) {
        for (int i = 0; i < steps.size(); i++) {
            Object stepObj = steps.get(i).getStep();
            if (stepObj instanceof Ingredient) {
                Ingredient ingredient = (Ingredient) stepObj;
                if (ingredient.getName().equalsIgnoreCase(ingredientName)
                        && ingredient.getQuantity() == quantity) {
                    steps.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    public void printRecipe() {
        System.out.println("\n--- Recipe: " + name + " ---");
        for (int i = 0; i < steps.size(); i++) {
            System.out.println((i + 1) + ". " + steps.get(i));
        }
    }
}
