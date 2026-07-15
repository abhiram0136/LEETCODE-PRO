class Solution {
    private String reverse(String k){
        StringBuilder sb=new StringBuilder();
        for(int i=k.length()-1;i>=0;i--){
            char ch=k.charAt(i);
            sb.append(ch);

        }
        return sb.toString();
    }
    public String removeStars(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!='*'){
                stack.push(ch);

            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                    
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        String l=sb.toString();
        String ans=reverse(l);
        return ans;


    }
}