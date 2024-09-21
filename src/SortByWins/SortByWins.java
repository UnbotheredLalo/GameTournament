package SortByWins;

import Player.Player;

import java.util.*;

public class SortByWins {
    public static void main(String[] args) {

        Player player1 = new Player("El Mata Jotos", "FlowerBoyXO91", 55, 1106);
        Player player2 = new Player("xXxPepitoxXx", "PepeProblemz88", 150, 2800);
        Player player3 = new Player("The Piped Piper", "MustaineDave1977", 90, 1909);
        Player player4 = new Player("The Tomorrow XO", "AbelTesfaye24", 20, 578);
        Player player5 = new Player("Earth Hashira", "HimejimaGyomei", 10, 229);
        Player player6 = new Player("Mahito the Cursed", "PatchedFace010", 2, 51);
        Player player7 = new Player("Aisha Kombucha >.<", "GalvanAisha888", 34, 773);
        Player player8 = new Player("Psst-Hannia", "LileAqua33", 180, 3500);
        Player player9 = new Player("_Shade_", "NamiValadez2109", 77, 1549);
        Player player10 = new Player("bsw. Aszche", "Lindemann21", 43, 891);

        Map<Integer, Integer> playerWinMap = new HashMap<>();
        playerWinMap.put(player1.getMyLevel(), player1.getNumWins());
        playerWinMap.put(player2.getMyLevel(), player2.getNumWins());
        playerWinMap.put(player3.getMyLevel(), player3.getNumWins());
        playerWinMap.put(player4.getMyLevel(), player4.getNumWins());
        playerWinMap.put(player5.getMyLevel(), player5.getNumWins());
        playerWinMap.put(player6.getMyLevel(), player6.getNumWins());
        playerWinMap.put(player7.getMyLevel(), player7.getNumWins());
        playerWinMap.put(player8.getMyLevel(), player8.getNumWins());
        playerWinMap.put(player9.getMyLevel(), player9.getNumWins());
        playerWinMap.put(player10.getMyLevel(), player10.getNumWins());

    }
    // A method for sorting by wins is created
    public Map<Integer, Integer> sortByWins(Map<Integer, Integer> map)  {

        //a List created with the entries of map
        List<Map.Entry<Integer, Integer>> sortEntries = new ArrayList<>(map.entrySet());

        //Combining sorted and compareTo in order to get descendant order of the values
        sortEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        //Using LinkedHashMap for keeping the same insertion order
        Map<Integer, Integer> sortedWinsMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : sortEntries) {
            sortedWinsMap.put(entry.getKey(), entry.getValue());
        }
        return sortedWinsMap
    }
}
