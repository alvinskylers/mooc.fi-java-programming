public class Game {
    
    private String home;
    private String away;
    private int homeScore;
    private int awayScore;

    public Game(String home, String away, int homeScore, int awayScore) {
        this.home = home;
        this.away = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public String getHomeTeam() {
        return this.home;
    }

    public String getAwayTeam() {
        return this.away;
    }

    public String matchResults() {
        return this.awayScore < this.homeScore ? this.home : this.away;
    }

}
