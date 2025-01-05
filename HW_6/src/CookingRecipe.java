import java.util.ArrayList;

public class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> ingredients;

    public CookingRecipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getName().equals(ingredient.getName())) {
                ri.setQuantity(ri.getQuantity() + quantity);
                return;
            }
        }
        ingredients.add(new RecipeIngredient(ingredient.getName(), ingredient.getMeasuringUnit(), ingredient.getCaloriesPerUnit(), quantity));
    }

    public RecipeIngredient getRecipeIngredient(Ingredient ingredient) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getName().equals(ingredient.getName())) {
                return ri;
            }
        }
        return null;
    }

    public RecipeIngredient getRecipeIngredient(String ingredientName) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getName().equals(ingredientName)) {
                return ri;
            }
        }
        return null;
    }

    public RecipeIngredient removeRecipeIngredient(Ingredient ingredient) {
        return removeRecipeIngredient(ingredient.getName());
    }

    public RecipeIngredient removeRecipeIngredient(String ingredientName) {
        for (RecipeIngredient ri : ingredients) {
            if (ri.getName().equals(ingredientName)) {
                ingredients.remove(ri);
                return ri;
            }
        }
        return null;
    }

    public int calculateCalories() {
        int totalCalories = 0;
        for (RecipeIngredient ri : ingredients) {
            totalCalories += ri.getCaloriesPerUnit() * ri.getQuantity();
        }
        return totalCalories;
    }

    public int getNumberOfIngredients() {
        return ingredients.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Recipe name: " + name + "\nIngredients:\n");
        for (RecipeIngredient ri : ingredients) {
            sb.append(ri.toString()).append("\n");
        }
        return sb.toString();
    }
}
