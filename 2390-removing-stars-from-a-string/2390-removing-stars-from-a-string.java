class Solution {
    private String reverse(String k){
        String t="";
        for(int i=k.length()-1;i>=0;i--){
            t+=k.charAt(i);

        }
        return t;
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
        String t="";
        for(char ch : stack){
            t+=ch;
        }
        String l=reverse(t);
        return l;
    }
}