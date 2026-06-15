class Solution {
    public boolean func(int side1,int side2,int side3){
        return (side1 + side2 > side3) &&
           (side2 + side3 > side1) &&
           (side1 + side3 > side2);
    }
    public int largestPerimeter(int[] nums) {
        int n = nums.length;
        int maxPeri = 0;
        Arrays.sort(nums);
        for(int i = 0;i<n-2;i++){
            int Peri = 0;
            int side1 = nums[i];
            int side2 = nums[i+1];
            for(int j = i+2;j<n;j++){
                int side3 = nums[j];
                if(func(side1,side2,side3)){
                    Peri = side1+side2+side3;
                    maxPeri = Math.max(maxPeri,Peri);
                }
            }
        }
        return maxPeri;
    }
}