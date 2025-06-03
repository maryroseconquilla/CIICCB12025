package animals;

// Base class
class Recipe {
    String[] ingredients;

    public Recipe(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public void printIngredients() {
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}

// Subclass for a specific recipe type
class CakeRecipe extends Recipe {

    public CakeRecipe(String[] ingredients) {
        super(ingredients);
    }
}

// Subclass for another recipe type
class SaladRecipe extends Recipe {
    public SaladRecipe(String[] ingredients) {
        super(ingredients);
    }
}

public class test {
     public static void main(String[] args) {
        // Create CakeRecipe object with specific ingredients
        String[] cakeIngredients = {"flour", "sugar", "eggs", "butter", "milk"};
        CakeRecipe cake = new CakeRecipe(cakeIngredients);
        cake.printIngredients();

        // Create SaladRecipe object with specific ingredients
        String[] saladIngredients = {"lettuce", "tomato", "cucumber", "dressing"};
        SaladRecipe salad = new SaladRecipe(saladIngredients);
        salad.printIngredients();
    }
}
