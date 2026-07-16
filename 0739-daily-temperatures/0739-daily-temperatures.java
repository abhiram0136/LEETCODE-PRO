class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Deque<Integer> stack=new ArrayDeque<>();
        int n = arr.length;
        int [] res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
                
            }
            if(!stack.isEmpty()){
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }
}