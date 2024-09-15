class Solution {

    public int cnt(String s) {

        int x = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                x++;
            }
        }

        return x;
    }

    public boolean halvesAreAlike(String s) {

        return cnt(s.substring(0, s.length() / 2)) == cnt(s.substring(s.length() / 2));

    }
}
