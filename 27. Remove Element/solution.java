class Solution {
    public int removeElement(int[] nums, int val) {
        int cont = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[cont] = nums[i];
                cont++;
            }
        }
        return cont;
    }
}
