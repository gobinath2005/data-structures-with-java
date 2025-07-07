public class Solution {
    public int removeElement(int[] num, int value) {
        int k = 0; 
        for (int i = 0; i < num.length; i++) {
            if (num[i] != value) {
                num[k++] = num[i]; 
            }
        }
        return k;
    }
}
