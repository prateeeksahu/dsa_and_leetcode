class Solution {
    public String smallestNumber(String pattern) {
        Stack <Character> d = new Stack<>();
        Stack <Integer> v = new Stack<>();
        ArrayList<Integer> c = new ArrayList<>();
        int cm = 1;
        c.add(cm);

        for(int i = 0;i<pattern.length();i++){

        char ch = pattern.charAt(i);
            if(ch == 'D'){
                d.push('D');
                cm+=1;
                c.add(cm);
            } else {
                while(d.size()>0){
                    d.pop();
                    v.push(c.get(c.size()-1));
                    c.remove(c.size()-1);
                }

                v.push(c.get(c.size()-1));
                cm+=1;
                c.add(cm);
            }
        }

        while(d.size()>0){
            d.pop();
            v.push(c.get(c.size()-1));
            c.remove(c.size()-1);
        }

        v.push(c.get(c.size()-1));
        cm+=1;
        c.add(cm);

       
        String ans = "";

        while(v.size()>0){
            int a = v.pop();
            String s = Integer.toString(a);
            ans = a+ans;

           
        }

       return ans;

        
    }
}
