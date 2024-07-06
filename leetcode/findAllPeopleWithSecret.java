// https://leetcode.com/problems/find-all-people-with-secret/description/?envType=daily-question&envId=2024-02-24

import java.util.*; 

class Solution {
    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {

        Arrays.sort(meetings, Comparator.comparingInt(arr -> arr[2]));

        List<Integer> ans = new ArrayList<>();
        ans.add(firstPerson);
        ans.add(0);
        int sind = 0;
        int eind = 0;

        for(int i = 0; i< meetings.length; i++){
            if(ans.contains(meetings[i][0]) && !ans.contains(meetings[i][1])){
                ans.add(meetings[i][1]);
            } else if(ans.contains(meetings[i][1]) && !ans.contains(meetings[i][0])){
                ans.add(meetings[i][0]);
            }

            if(i < meetings.length-1 && meetings[i][2] != meetings[i+1][2]){
                for(int j = sind; j <= eind; j++){

                    if(ans.contains(meetings[j][0]) && !ans.contains(meetings[i][1])){
                        ans.add(meetings[j][1]);
                    } else if(ans.contains(meetings[j][1]) && !ans.contains(meetings[j][0])){
                        ans.add(meetings[j][0]);
                    }
                }
                
                sind = eind;
            }

           eind++;
        } 
         

        return ans;
    }
}

