class BubbleSort{

    void bubbleSort(int arr[]){
        
        for(int i=0; i<arr.length; i++){

            for(int j=0; i<arr.length-i; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;
                    
                }
                System.out.println("hello");
            }
            
        }
        
    }
    public static void main(String[] args) {

        int[] arr = {6,2,5,3,4,1};

        BubbleSort bubble = new BubbleSort();

        System.out.print("Before Array => {");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]);

            if(i<5){
                System.out.print(", ");
            }
        }
        System.out.println("}");

        bubble.bubbleSort(arr);

        System.out.println("After Array => {");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]);

            if(i<5){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }   
}