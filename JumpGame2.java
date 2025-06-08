/*
 
Leetcode -- 45 
In this question we have to return the minimum no of jump needed to reach the end.....
we will iterate through the array and keep updating the coverage of the pointer and if pointer reaches at the end of the 
coverage than increase the jump variable by one and update the coverage and keep checking that if we have reached the 
destignation or not

 */

class JumpGame2{
    public static int jump(int arr[]){
        int coverage =0;
        int destignation = arr.length;
        int lastIdx = 0;
        int totalJumps = 0;

        for(int i=0;i<arr.length;i++){
            coverage = Math.max(coverage,i+arr[i]);
            if(i==lastIdx){
                lastIdx = coverage;
                totalJumps++;

                if(coverage>=destignation){
                    return totalJumps;
                }

            }
        }
        return totalJumps;
    }
}