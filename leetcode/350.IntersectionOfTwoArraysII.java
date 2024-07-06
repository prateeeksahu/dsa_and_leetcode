//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/


class Solution {
    public int[] intersect(int[] n1, int[] n2) {

        int i = 0, j = 0;
        Arrays.sort(n1);
        Arrays.sort(n2);
        List<Integer> res = new ArrayList<>();

        while(i < n1.length && j < n2.length){
            if(n1[i] < n2[j]) i++;
            else if(n1[i] > n2[j]) j++;
            else {
                res.add(n1[i]);
                i++;
                j++;
            }
        }

        int[] arr = new int[res.size()];
        for (int k = 0; k < res.size(); k++) arr[k] = res.get(k);

        return arr;

        // return res.stream().mapToInt(k -> k).toArray();

    }
}
