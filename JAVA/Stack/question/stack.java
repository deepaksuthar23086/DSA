class MYStacks{
    int top;
    char stack[];
    int size;
    MYStacks(int size){
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    void push(char value){
        stack[++top] = value;
        System.out.println(value +" Push");
    }

    boolean pop(){
        if(isEmpty()){
            return false;
        }else{
            top--;
             return true;
        }
        
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;
        }
    }

    int size(){
        return top;
    }
    
    char peek(){
        if(isEmpty()){
            return ' ';
        }else{
           
            return stack[top];
        }
        
    }

    boolean search(int value){
        boolean exist = false;
        for(int i=0; i<top; i++){
            if(value==stack[i]){
             
                exist = true;
            }else{
                exist = false;
            }
        }
        if(exist==false){
            System.out.println(value + " Value Not Available");
        }else{
            System.out.println(value + " Value Available");
        }
        return exist;
    }
}