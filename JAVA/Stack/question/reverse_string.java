class ReverseString {
    public static void main(String[] args) {
        ReverseString solutions = new ReverseString();
     
    //     String str = "Deepak";
    //    Solutions.reverse(str);
          System.out.println("Reverse String --> " + solutions.reverse("Deepak"));
        
    }
    
    public String reverse(String S){
        Stack stack = new Stack(S.length());
        String reverseSTR = "" ;
        for(int i=0; i<=S.length()-1; i++){
            stack.push(S.charAt(i));
        }
        for(int i=0; i<=S.length()-1; i++){
            reverseSTR += stack.pop();
        }
        return reverseSTR;
    }
}

class Stack{
    char [] stack;
    int top;
    int size;
    Stack(int size){
        top = -1;
        this.size = size;
        stack = new char[size];
    }
    
    public void push(char value){
        stack[++top] = value;
    }
    public char pop(){
        return stack[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
}

