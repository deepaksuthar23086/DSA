import java.util.Scanner;

import static java.lang.System.exit;

class Lifo{
    int arr[] = new int[5];
    int top = -1;
    Scanner scanner = new Scanner(System.in);
    void push(){
        top++;
        System.out.print("Enter Push Value ");
        int number = scanner.nextInt();
        
        // need to add this number in array

    }
    void pop(){
        top--;
    }
    void travessing(){
        
        // traversing will from top to 0
        
        for (int i = 0; i <= top; i++ ){
            System.out.println(i + "Index Value => " + arr[i]);
        }
    }
    void peak(){
        System.out.println("Peak Value : " + arr[top]);
    }
    void size(){ /// this method not needed, as top itself denote the number of elselements in the array.
        int high = 0;
        for(int i = 0; i <= top; i++){
            high = i +1;
        }
        System.out.println(high);
    }


}
class Main{
    public static void main(String [] args){
        Lifo lifo = new Lifo();
        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Travessing");
            System.out.println("4. Peak");
            System.out.println("5. Size");
            System.out.println("6. Exit");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    lifo.push();
                    break;
                case 2:
                    lifo.pop();
                    break;
                case 3:
                    lifo.travessing();
                    break;
                case 4:
                    lifo.peak();
                    break;
                case 5:
                    lifo.size();
                    break;
                case 6:
                    exit(0);
                default:
                    System.out.println("Invalid Option Please Select Right Option");
                    break;
            }
        }
    }
}
