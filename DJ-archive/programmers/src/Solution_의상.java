import java.util.*;

class Solution_의상 {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] x : clothes) {
            map.put(x[1], map.getOrDefault(x[1], 0) + 1);
        }
        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        return answer - 1;
    }
}