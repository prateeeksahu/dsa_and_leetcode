class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        int [] c = new int [2001];

        for(int i = 0;i<arr.length;i++){
            c[arr[i]+1000]++;
        }


        Arrays.sort(c);


        for(int i = 0; i < c.length-1; i++){

            if(c[i] != 0 && c[i] == c[i + 1]) return false;
        }

        return true;
        
    }  
    
}
