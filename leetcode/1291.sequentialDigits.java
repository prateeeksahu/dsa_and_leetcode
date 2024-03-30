class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        // List<Integer> lst = new ArrayList<>();
        

        // for(int i = low; i<=high; i++){
        //     boolean f = true;
        //     int n = i;
        //     int n1 = n%10; n /= 10;
            

        //     while(n>0){
        //         int n2 = n%10; 
        //         if(n1-n2 != 1){
        //             f = false;
        //             break;
        //         }

        //         n1 = n2;
        //         n = n/10;
               
        //     }

        //     if(f){
        //         lst.add(i);  
        //     }
        // }

        // return lst;


        List<Integer> ans = new ArrayList<>();
        String str = "123456789";
        

        for (int i = 2; i <= str.length(); i++) { 
            for (int j = 0; j <= str.length() - i; j++) { 
                String temp = str.substring(j, j + i);
                int num = Integer.parseInt(temp);
                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;

       
        
    }
}
