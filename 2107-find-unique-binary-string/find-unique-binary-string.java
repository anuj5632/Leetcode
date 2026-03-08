class Solution {
    public String generate(int n, String current, HashSet<String> set) {
        if(current.length() == n){
            if(!set.contains(current)){
                return current;
            }
            return null;
        }

        String left = generate(n, current + "0", set);
        if (left != null){
            return left;
        }

        return generate(n, current + "1", set);
    }

    public String findDifferentBinaryString(String[] nums) {

        HashSet<String> set = new HashSet<>();

        for (String s : nums){
            set.add(s);
        }
        int n = nums.length;

        return generate(n, "", set);
    }
}