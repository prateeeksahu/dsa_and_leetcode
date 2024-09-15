package java;
// https://leetcode.com/problems/find-players-with-zero-or-one-losses/?envType=daily-question&envId=2024-01-15

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        int [] arr = new int[100005];
       //Arrays.fill(arr, 0);

        for(int i = 0; i< matches.length;i++){
            int wnr = matches[i][0];
            int lsr = matches[i][1];

            if(arr[wnr] == 0){
                arr[wnr] = -1;
            } 
            
            if(arr[lsr] == -1){
                arr[lsr] = 1;
            } else {
                arr[lsr]++;
            }
        }

        List <Integer> notLost = new ArrayList<>();
        List <Integer> leastOne = new ArrayList<>();
        List <List <Integer>> res = new ArrayList<>();

         for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                notLost.add(i);
            } else if (arr[i] == 1) {
                leastOne.add(i);
            }
        }

        res.add(notLost);
        res.add(leastOne);

        return res;

    }
}