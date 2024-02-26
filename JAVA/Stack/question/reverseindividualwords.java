class ReverseIndividualWords {
    public static void main(String[] args) {
        System.out.println("Reverse String --> " + ReverseIndividualWords.reverse("Rem go"));
    }
    
    public static String reverse(String str){
        MYStacks myStacks = new MYStacks(str.length());

        String reverse = "";
        for(int i=0; i<=str.length()-1; i++){
            System.out.println("size " + myStacks.size());
            if(str.charAt(i)!=' '){
                myStacks.push(str.charAt(i));
            }else{
                myStacks.push(str.charAt(i));
                int size = myStacks.size();
                for(int j=0; j<=i-1; j++){
                    System.out.println("size of stack --------------->" + myStacks.size());
                    reverse += myStacks.pop();
                }
        
            }
            // System.out.println("reverse str--> " + reverse);
        }
        // System.out.println(myStacks.peek());

        return reverse;
        
    }

    public static String getvalue(char [] arr){
        String valuee="";
        for(int i=0; i<arr.length; i++){

        }
        return valuee;
    }
}