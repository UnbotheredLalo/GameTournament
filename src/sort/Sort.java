package sort;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sort {
    // A method for sorting by wins is created
    public static Map<Integer, Integer> sortByWins(Map<Integer, Integer> map)  {

        //a List created with the entries of map
        List<Map.Entry<Integer, Integer>> sortEntries = new ArrayList<>(map.entrySet());

        //Combining sorted and compareTo in order to get descendant order of the values
        sortEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        //Using LinkedHashMap for keeping the same insertion order
        Map<Integer, Integer> sortedWinsMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : sortEntries) {
            sortedWinsMap.put(entry.getKey(), entry.getValue());
        }
        return sortedWinsMap;
    }
}
