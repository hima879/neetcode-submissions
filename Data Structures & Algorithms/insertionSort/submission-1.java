// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> s = new ArrayList<>();
        
        if (pairs == null || pairs.isEmpty()) {
            return s;   
        }
        
        s.add(new ArrayList<>(pairs));   
        int n = pairs.size();
        
        for (int i = 1; i < n; i++) {
            Pair curr = pairs.get(i);
            int j = i - 1;
            while (j >= 0 && pairs.get(j).key > curr.key) {
                pairs.set(j + 1, pairs.get(j));
                j--;
            }
            pairs.set(j + 1, curr);
            
            s.add(new ArrayList<>(pairs));
        }
        
        return s;
    }
}

