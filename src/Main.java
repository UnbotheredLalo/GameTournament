//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import player.Player;
import utils.Sort;

import static skills.Category.CONTROLLER;
import static skills.Category.DUELIST;
import static skills.Category.INITIATOR;
import static skills.Category.SENTINEL;

public class Main {
    public static void main(String[] args) {

        Player newPlayer1 = new Player("xXx Dartrox xXx", "Dartrox21");

        Player player1 = new Player("El Mata Jotos", "FlowerBoyXO91", 55, 1106 );
        Player player2 = new Player("xXxPepitoxXx", "PepeProblemz88", 150, 2800);
        Player player3 = new Player("The Piped Piper", "MustaineDave1977", 90,1909);
        Player player4 = new Player("The Tomorrow XO", "AbelTesfaye24", 20,578);
        Player player5 = new Player("Earth Hashira", "HimejimaGyomei", 10,229);
        Player player6 = new Player("Mahito the Cursed", "PatchedFace010", 2,51);
        Player player7 = new Player("Aisha Kombucha >.<", "GalvanAisha888", 34, 773);
        Player player8 = new Player("Psst-Hannia", "LileAqua33",180, 3500);
        Player player9 = new Player("_Shade_", "NamiValadez2109",77,1549);
        Player player10 = new Player("bsw. Aszche", "Lindemann21",43, 891);

        ArrayList<Player> gameContestants = new ArrayList<>();
        gameContestants.add(player1);
        gameContestants.add(player2);
        gameContestants.add(player3);
        gameContestants.add(player4);
        gameContestants.add(player5);
        gameContestants.add(player6);
        gameContestants.add(player7);
        gameContestants.add(player8);
        gameContestants.add(player9);
        gameContestants.add(player10);
        System.out.println(gameContestants);

        Map<Integer, Integer> playersMap = new HashMap<>();
        playersMap.put(player1.getMyLevel(), player1.getNumWins());
        playersMap.put(player2.getMyLevel(), player2.getNumWins());
        playersMap.put(player3.getMyLevel(), player3.getNumWins());
        playersMap.put(player4.getMyLevel(), player4.getNumWins());
        playersMap.put(player5.getMyLevel(), player5.getNumWins());
        playersMap.put(player6.getMyLevel(), player6.getNumWins());
        playersMap.put(player7.getMyLevel(), player7.getNumWins());
        playersMap.put(player8.getMyLevel(), player8.getNumWins());
        playersMap.put(player9.getMyLevel(), player9.getNumWins());
        playersMap.put(player10.getMyLevel(), player10.getNumWins());

        //  Prints the whole dictionary
        Map<Integer, Integer> winRankingMap = Sort.sortByWins(playersMap);

        System.out.println("Total Wins Ranking: "+ winRankingMap);
        System.out.println("Quiondas we");

        // Sorting by Number of Wins

        player1.assignSkills(DUELIST);
        player2.assignSkills(SENTINEL);
        player3.assignSkills(SENTINEL);
        player4.assignSkills(CONTROLLER);
        player5.assignSkills(INITIATOR);
        player6.assignSkills(INITIATOR);
        player7.assignSkills(CONTROLLER);
        player8.assignSkills(DUELIST);
        player9.assignSkills(DUELIST);
        player10.assignSkills(SENTINEL);

    }
}