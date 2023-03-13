public class Player {

    private String name;
    private int wins;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int fetch(){
        return NumberGenerator.randomGenerator();
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}