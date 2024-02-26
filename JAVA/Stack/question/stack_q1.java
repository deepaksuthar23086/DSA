
//  class StackQ1 {
//     public static void main(String[] args) {
//         String expr = "{}([{}])}";
//         StackQ1 stackQ1 = new StackQ1();
//         stackQ1.expressionCheck(expr);
//     }
//     void expressionCheck(String value){
//         int stackIndex = -1;
//         char stack [] = new char[value.length()];
//         for(int i=0; i<value.length()-1; i++){
//             char x = value.charAt(i);
//             if(x=='(' || x=='[' || x=='{'){
//                 System.out.println(stackIndex);
//                 stack[++stackIndex] = x;
//                 System.out.println(stackIndex);
//             }
//             else if(x=='}'){
//                 System.out.println(x + " " + stackIndex + " " + stack[stackIndex]);
//                 if(stack[stackIndex]=='{'){
//                     stackIndex--;
//                 }else{
//                     stack[++stackIndex] = x;
//                 }
//             }else if(x==']'){
//                 if(stack[stackIndex]== '['){
//                     stackIndex--;
//                 }else{
//                     stack[++stackIndex] = x;
//                 }
//             }else{
//                 if(stack[stackIndex]=='('){
//                     stackIndex--;
//                 }else{
//                     stack[++stackIndex] = x;
//                 }
//             }
//         }
//         if(stackIndex==-1){
//             System.out.println("Balanced ");
//         }else{
//             System.out.println("Not Balanced ");
//         }
//     }
// }


class ParenthesisChecker{

    // Input: exp = “[()]{}{[()()]()}” 
    // Output: Balanced

    public static void main(String[] args) {
        ParenthesisChecker parenthesisChecker = new ParenthesisChecker();
        parenthesisChecker.parenthesisChecker("Deepak");
    }

    void parenthesisChecker(String value){
        MYStacks stacks = new MYStacks(value.length()-1);
        boolean exist = false;
        for(int i=0; i<=value.length()-1; i++){
            if(stacks.isEmpty()){
                if(value.charAt(i)=='(' || value.charAt(i)=='[' || value.charAt(i)=='{'){
                    stacks.push(value.charAt(i));
                }
            }else{
                if(value.charAt(i)==')'){
                    if(exist==9){
                        print
                    }
                }
            }
        }
    }
}