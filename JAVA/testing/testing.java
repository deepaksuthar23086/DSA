package JAVA.testing;

import java.util.Scanner;

class Testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1; 
        while(scanner.hasNext()){
            String string = scanner.next();
            System.out.println(i + " " + string);
            i++;
        }
    }
}
