class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>(); 
        //  stack extends from vector. vector method are synchronised
        // therefore synchronised-> slower 

        int i=0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch=='('|| ch=='[' || ch=='{'){
                // if(stack.isEmpty()) stack.push(ch);
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                else if(stack.peek()=='(' && ch==')') stack.pop();
                else if(stack.peek()=='{' && ch=='}') stack.pop();
                else if(stack.peek()=='[' && ch==']') stack.pop();
                else{
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
        
    }
}