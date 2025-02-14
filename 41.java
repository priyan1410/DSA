class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int c=1;
        while (set.contains(c)){
                c++;
            }
        return c;
    }
}
