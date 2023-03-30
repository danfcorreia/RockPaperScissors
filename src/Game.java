public class Game {

        private Player p1;
        private Player p2;
        private int games = 0;
        private int round = 1;

        public Game(Player player1, Player player2){
            p1 = player1;
            p2 = player2;
        }

    public void gameStart() throws InterruptedException {
            while(games < 5)
            {
                System.out.println("\nStarting round " + round);
                Thread.sleep(2000);

                int hand1 = p1.fetch();
                int hand2 = p2.fetch();
                int result = 0;

                if (hand1 == hand2) {
                    result = 1;
                } else if ((hand1 == 1 && hand2 == 3) || (hand1 == 2 && hand2 == 1) || (hand1 == 3 && hand2 == 2)) {
                    result = 2;
                } else if ((hand1 == 1 && hand2 == 2) || (hand1 == 2 && hand2 == 3) || (hand1 == 3 && hand2 == 1)) {
                    result = 3;
                }

                Weapon weapon1 = Weapon.byNumber(hand1);
                Weapon weapon2 = Weapon.byNumber(hand2);

                System.out.println(p1.getName() + " chose " + weapon1 + " to play this round.\n" + p2.getName() + " chose " + weapon2 + " to play this round.");
                System.out.println("The winner is...");
                Thread.sleep(4000);

                if(result == 1) {
                    System.out.println("\nIt's a Draw!");
                } else if (result == 2) {
                    System.out.println("\nWinner of this round: " + p1.getName());
                    p1.setWins(p1.getWins() + 1);
                } else if (result == 3) {
                    System.out.println("\nWinner of this round: " + p2.getName());
                    p2.setWins(p2.getWins() + 1);
                }
                games++;
                round++;
            }

             Thread.sleep(2000);
             System.out.println("Final results...");
             Thread.sleep(1000);

            if(p1.getWins() > p2.getWins()){
                System.out.println("After " + games + " rounds, the winner is " + p1.getName() + " with " + p1.getWins() + " points!");
            } else if(p1.getWins() < p2.getWins()) {
                System.out.println("After " + games + " rounds, the winner is " + p2.getName() + " with " + p2.getWins() + " points!");
            } else {
                System.out.println("It's a draw with " + p1.getWins() + " points each!");
            }

    }
}