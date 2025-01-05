public class TestRecipeBook {
    public static void main(String[] args) {
        Ingredient sugar = new Ingredient("Sugar", "grams", 4);
        Ingredient salt = new Ingredient("Salt", "grams", 0);
        Ingredient flour = new Ingredient("Flour", "grams", 3);

        RecipeIngredient[] pancakeIngredients = {
                new RecipeIngredient(sugar.getName(), sugar.getMeasuringUnit(), sugar.getCaloriesPerUnit(), 50),
                new RecipeIngredient(salt.getName(), salt.getMeasuringUnit(), salt.getCaloriesPerUnit(), 10),
                new RecipeIngredient(flour.getName(), flour.getMeasuringUnit(), flour.getCaloriesPerUnit(), 200)
        };

        RecipeBook book = new RecipeBook("My Recipe Book");

        CookingRecipe pancakes = book.addRecipe("Pancakes", pancakeIngredients);

        System.out.println(book);

        book.removeRecipe("Pancakes");
        System.out.println("After removing pancakes:");
        System.out.println(book);
    }
}
