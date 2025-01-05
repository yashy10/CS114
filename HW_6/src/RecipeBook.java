import java.util.ArrayList;

public class RecipeBook {
    private String bookName;
    private ArrayList<CookingRecipe> recipes;

    public RecipeBook(String bookName) {
        this.bookName = bookName;
        this.recipes = new ArrayList<>();
    }

    public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients) {
        for (CookingRecipe recipe : recipes) {
            if (recipe.toString().equals(name)) {
                return null;
            }
        }

        CookingRecipe newRecipe = new CookingRecipe(name);
        for (RecipeIngredient ingredient : ingredients) {
            newRecipe.addOrUpdateRecipeIngredient(ingredient, ingredient.getQuantity());
        }
        recipes.add(newRecipe);
        return newRecipe;
    }

    public CookingRecipe removeRecipe(String name) {
        for (CookingRecipe recipe : recipes) {
            if (recipe.toString().equals(name)) {
                recipes.remove(recipe);
                return recipe;
            }
        }
        return null;
    }

    public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients) {
        ArrayList<CookingRecipe> matchingRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            boolean allMatch = true;
            for (RecipeIngredient ingredient : ingredients) {
                if (recipe.getRecipeIngredient(ingredient) == null) {
                    allMatch = false;
                    break;
                }
            }
            if (allMatch) {
                matchingRecipes.add(recipe);
            }
        }
        return matchingRecipes.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients) {
        ArrayList<CookingRecipe> matchingRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.getNumberOfIngredients() <= numberOfIngredients) {
                matchingRecipes.add(recipe);
            }
        }
        return matchingRecipes.toArray(new CookingRecipe[0]);
    }

    public CookingRecipe[] findRecipesLowCalories() {
        if (recipes.isEmpty()) {
            return new CookingRecipe[0];
        }

        int minCalories = recipes.get(0).calculateCalories();
        for (CookingRecipe recipe : recipes) {
            minCalories = Math.min(minCalories, recipe.calculateCalories());
        }

        ArrayList<CookingRecipe> lowCalorieRecipes = new ArrayList<>();
        for (CookingRecipe recipe : recipes) {
            if (recipe.calculateCalories() == minCalories) {
                lowCalorieRecipes.add(recipe);
            }
        }

        return lowCalorieRecipes.toArray(new CookingRecipe[0]);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RecipeBook: " + bookName + "\nRecipes:\n");
        for (CookingRecipe recipe : recipes) {
            sb.append(recipe.toString()).append("\n");
        }
        return sb.toString();
    }
}
