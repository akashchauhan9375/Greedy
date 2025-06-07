/*
Leetcode - 55 Jump game --- 
In this question we have to verify that either we can reach the final stage or not using the value given in the array

we will keep updating the pointer using the for loop and we encounter that i is greater than maxIdx that means we are stuck 
and cannot move further and hence not able to move at the final index so return false in this condition else return true.

 */







class JumpGame{

    public static boolean canReach(int arr[]){
        int maxIdx = 0;
        for(int i=0;i<arr.length;i++){
            if(i>maxIdx){
                return false;
            }
            else{
                maxIdx = Math.max(maxIdx,i+arr[i]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr []= {1,2,1,0,3};
        System.out.println(canReach(arr));
    }
}