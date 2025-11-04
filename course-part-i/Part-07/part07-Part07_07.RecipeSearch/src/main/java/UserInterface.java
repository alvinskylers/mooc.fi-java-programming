import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    
    public Scanner scanner;
    public ArrayList<Recipe> recipes;

    public UserInterface (Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }

    public void start() {
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        loadRecipes(fileName);

        while (true) {
            System.out.println("\nCommands: \nlist - lists the recipes \nstop - stops the program" + "\nfind name - searches recipes by name \nfind cooking time - searches recipes by cooking time" + " \nfind ingredient - searches recipes by ingredient \n");
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
        
            if (command.equals("stop")) {
                break;
            } 

            if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                } 
            }

            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String query = scanner.nextLine();

                for (Recipe recipe:recipes) {
                    if (recipe.getFoodName().contains(query)) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());

                for (Recipe recipe:recipes) {
                    if (recipe.getPreptime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            }

            if (command.equals("find ingredient")) {
                System.out.print("Searched word: ");
                String query = scanner.nextLine();

                for (Recipe recipe:recipes) {
                    if (recipe.getIngredients().contains(query)) {
                        System.out.println(recipe);
                    }
                }
            }
        }
    }

    private void loadRecipes(String fileName) {
        try (Scanner fileReader =  new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String line =  fileReader.nextLine();

                if (line.equals("\n")) {
                    continue;
                }

                String food = line;
                int prepTime = Integer.valueOf(fileReader.nextLine());
                ArrayList<String> indgredients = new ArrayList<>();
                
                while (fileReader.hasNextLine()) {
                    String indgredient = fileReader.nextLine();
                    
                    if (indgredient.isEmpty()) {
                        break;
                    } else {
                        indgredients.add(indgredient);
                    }
                }

                this.recipes.add(new Recipe(food, prepTime, indgredients));
                
            }

        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}
