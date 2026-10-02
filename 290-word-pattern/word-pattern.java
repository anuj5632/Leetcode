class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        int n = pattern.length();

        if (n != words.length) {
            return false;
        }

        for (int i = 0; i < n; i++) {
            char key = pattern.charAt(i);
            String value = words[i];

            if (map.containsKey(key)) {
                if (!map.get(key).equals(value)) {
                    return false;
                }
            } 
            else {
                if (set.contains(value)) {
                    return false;
                }

                map.put(key, value);
                set.add(value);
            }
        }

        return true;
    }
}