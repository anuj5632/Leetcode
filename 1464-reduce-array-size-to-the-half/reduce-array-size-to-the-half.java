class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int[] freqarr = new int[n + 1];

        for(int key : map.keySet()){
            freqarr[map.get(key)]++;
        }

        int removed = 0;
        int count = 0;

        for(int i = n; i >= 1; i--){
            while(freqarr[i] > 0){
                removed += i;
                count++;
                freqarr[i]--;

                if(removed >= n / 2){
                    return count;
                }
            }
        }

        return count;
    }
}