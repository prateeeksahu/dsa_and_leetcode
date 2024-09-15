class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] result = new int[n];
        int carry = 1;


        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum > 9) {
                carry = 1;
                result[i] = sum - 10;
            } 
            else {
                carry = 0;
                result[i] = sum;
            }
        }

        if (carry == 1) {
            int[] newResult = new int[n + 1];
            newResult[0] = 1;
            for (int i = 0; i < n; i++) {
                newResult[i + 1] = result[i];
            }
            return newResult;
        } 
        else {
            return result;
        }
    }
}
