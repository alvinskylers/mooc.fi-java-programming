
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File: ");
        String file = scan.nextLine();
        
        System.out.println("Team: ");
        String team = scan.nextLine();

        search(retrieveGames(file), team);
        
    }

    public static ArrayList<Game> retrieveGames (String file) {
            ArrayList<Game> games = new ArrayList<>();

            try (Scanner fileReader = new Scanner(Paths.get(file))) {
                while (fileReader.hasNextLine()) {
                    String row = fileReader.nextLine();
                    String[] data = row.split(",");
                    games.add(new Game(data[0], data[1], Integer.valueOf(data[2]), Integer.valueOf(data[3])));
                }
            } catch (Exception e) {

            }
        return games;
    }

    public static void search( ArrayList<Game> games, String query) {
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLoss = 0;

        for (Game game : games) {
            if (game.getAwayTeam().equals(query) || game.getHomeTeam().equals(query)) {
                gamesPlayed++;

                if (game.matchResults().equals(query)) {
                    gamesWon++;
                } else {
                    gamesLoss++;
                }
                
            } 
            
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLoss);
    }
}
