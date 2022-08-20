class Solution {
    public int minSetSize(int[] arr) {
        int size = arr.length, res = 0;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int i=0; i<size; i++) {
            frequency.put(arr[i], frequency.getOrDefault(arr[i], 0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList <Map.Entry<Integer, Integer>> (frequency.entrySet());
        Collections.sort(
        list, 
        new Comparator<Map.Entry<Integer, Integer>> () {
            public int compare(Map.Entry<Integer, Integer> l1, Map.Entry<Integer, Integer> l2) {
                if(l1.getValue() == l2.getValue())
                    return l2.getKey() - l1.getKey();
                else
                    return l2.getValue() - l1.getValue();
            }
        });
        int i = 0;
        while(size > arr.length/2) {
            int count = list.get(i).getValue();
            size -= count;
            i++;
            res++;
        }
        return res;
    }
}