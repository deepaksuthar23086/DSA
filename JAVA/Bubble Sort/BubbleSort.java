class BubbleSort{

    public static void bubbleSort(int arr[]){

        for(int i=0; i<arr.length; i++){

            for(int j=0; j<arr.length-i-1; j++){

                if(arr[j]>arr[j+1]){

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = {6,2,5,3,4,1};

        System.out.print("Before Array => {");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]);

            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");

        bubbleSort(arr);

        System.out.print("After Array => {");

        for(int i=0; i<arr.length; i++){

            System.out.print(arr[i]);

            if(i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}