public class MaximumWealth {
    //https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
//        int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts){
        int max = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int i : account) {
                wealth += i;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
