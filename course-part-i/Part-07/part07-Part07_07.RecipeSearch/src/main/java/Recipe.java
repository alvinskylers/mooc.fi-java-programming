import java.util.ArrayList;

public class Recipe {
    private String food;
    private int prepTime;
    private ArrayList<String> indgredients;

    public Recipe (String food, int prepTime, ArrayList<String> indgredients) {
        this.food = food;
        this.prepTime = prepTime;
        this.indgredients = indgredients;
    }

    public String getFoodName() {
        return this.food;
    }

    public int getPreptime() {
        return this.prepTime;
    }

    public ArrayList<String> getIngredients() {
        return this.indgredients;
    }

    public boolean hasIngredient(String query) {
        for (String ingredient : this.indgredients) {
            if (ingredient.equals(query)) {
                return true;
            }
        }

        return false;
    }

    public String toString() {
        return this.food + ", cooking time: " + this.prepTime;
    }
}
