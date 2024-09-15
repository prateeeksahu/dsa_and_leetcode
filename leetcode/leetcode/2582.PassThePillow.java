//https://leetcode.com/problems/pass-the-pillow/description/?envType=daily-question&envId=2024-07-06

class Solution {
    public int passThePillow(int n, int t) {

        return t/(n-1)%2 == 0 ? 1+t%(n-1) : n-t%(n-1);

        // if((t / (n-1) % 2 == 0)) return t % (n-1) + 1;
        // else return (n-t % (n-1));
        //return (t % n) + 1;

    }
}

