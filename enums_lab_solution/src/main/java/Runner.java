import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        Game game = new Game(deck);

        System.out.println("Welcome to Draw Hi/Lo!");
        System.out.println("How many players would you like to play?");

        String input = scanner.next();
        int players = parseInt(input);

        for(int i = 0; i < players; i++){
            String prompt = String.format("Player %s, enter your name: ", (i + 1));
            System.out.println(prompt);
            String playerName = scanner.next();
            Player player = new Player(playerName);
            game.addPlayer(player);
        }

        System.out.println("How many cards are we playing with?");
        int noOfCards = parseInt(scanner.next());

        game.start(noOfCards);

        for(Player player: game.getPlayers()){
            String output = String.format("%s has:", player.getName());
            System.out.println(output);
            for(int i = 0; i < player.cardCount(); i ++){
                System.out.println(player.showCard(i));
            }
            System.out.println(String.format("Hand total: %s", player.handTotal()));
        }

        if(game.checkDraw()){
            System.out.println("It's a draw!");
        } else {
            Player winner = game.checkWinner();
            String winnerName = winner.getName();
            String output = String.format("%s wins!", winnerName);
            System.out.println(output);
        }

    }
}
