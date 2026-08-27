class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int pivot = n - 1; pivot >= 0; pivot--) {
            int[] count = freq.clone();

            boolean possible = true;

            for (int i = 0; i < pivot; i++) {
                int x = target.charAt(i) - 'a';

                if (count[x] == 0) {
                    possible = false;
                    break;
                }

                count[x]--;
            }

            if (!possible) {
                continue;
            }

            int x = target.charAt(pivot) - 'a';

            for (int c = x + 1; c < 26; c++) {
                if (count[c] > 0) {
                    StringBuilder ans = new StringBuilder();

                    for (int i = 0; i < pivot; i++) {
                        ans.append(target.charAt(i));
                    }

                    ans.append((char) ('a' + c));
                    count[c]--;

                    for (int j = 0; j < 26; j++) {
                        while (count[j] > 0) {
                            ans.append((char) ('a' + j));
                            count[j]--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
    }
}