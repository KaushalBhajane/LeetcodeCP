class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=-1, cand2=-1, count1=0, count2=0;
        for(int num: nums) {
            if(cand1==num) {
                count1++;
            }
            else if(cand2==num) {
                count2++;
            }
            else if(count1==0) {
                cand1=num;
                count1++;
            }
            else if(count2==0) {
                cand2=num;
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        int n = nums.length;
        List<Integer> maj = new ArrayList<>();
        for(int i: nums) {
            if(i==cand1) {
                count1++;
            }
            else if(i==cand2) {
                count2++;
            }
        }

        if(count1 > n/3) {
            maj.add(cand1);
        }
        if(count2 > n/3) {
            maj.add(cand2);
        }
        return maj;
    }
}