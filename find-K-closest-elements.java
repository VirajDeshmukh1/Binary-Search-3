// Time Complexity : O(n-k)


class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result=new ArrayList<>();
        if(arr==null || arr.length==0){
            return result;
        }
        int low=0; int high=arr.length-1;
        while((high-low)>k-1){
            int distL=Math.abs(arr[low]-x);
            int distR=Math.abs(arr[high]-x);
            if(distL>distR){
                low++;
            }else{
                high--;
            }
        }
        for(int i=low; i<low+k;i++){
            result.add(arr[i]);
        }
        return result;
    }
}