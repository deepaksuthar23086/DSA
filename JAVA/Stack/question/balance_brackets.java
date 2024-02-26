import JAVA.Stack.*;;
public class balance_brackets {
    public static void main(String[] args) {
        String expression = "({[]})";
        System.out.println("length-->" + expression.length());
        MYStacks stacks = new MYStacks(expression.length()-1);
        int i=0;

        for( i=0; i<=expression.length()-1; i++){
            if(expression.charAt(i)=='(' ||expression.charAt(i)=='[' || expression.charAt(i)=='{'){
                stacks.push(expression.charAt(i));
            }else if(expression.charAt(i)==')'){
                if(stacks.peek()=='('){
                    System.out.println(stacks.pop());   
                }else{
                    continue;
                }
            }else if(expression.charAt(i)=='}'){
                if(stacks.peek()=='{'){
                    System.out.println(stacks.pop());
                }else{
                    continue;
                }
            }else if(expression.charAt(i)==']'){
                if(stacks.peek()=='['){
                    System.out.println(stacks.pop());
                }else{
                    continue;
                }
            }else{
                continue;
            }
        }
        if(stacks.isEmpty()){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced Peek Value-->" + stacks.peek());
        }
    }
}
