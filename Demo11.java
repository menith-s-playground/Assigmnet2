void main() {
    int[] nums = {10, 20, 30, 40, 50};
    for (int i = 0; i < nums.length; i++) {         // Only this can be converted to enhanced for loop
        int x = nums[i];
        System.out.println(x);
    }

    System.out.println("=======================");

    for(int x : nums) System.out.println(x);

    int[][] coordinates = {{2,3}, {4,2}, {8,2}, {9,2}};
}