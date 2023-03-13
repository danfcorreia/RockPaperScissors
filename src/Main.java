public class Main {
    public static void main(String[] args) throws InterruptedException {

        Player p1 = new Player("Daniel");
        Player p2 = new Player("Sam");

        Game gameBegins = new Game(p1, p2);
        gameBegins.gameStart();

    }
}