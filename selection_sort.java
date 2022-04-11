public class selection_sort{
    public static void selectionSort(int[] a1) {
        for(int i=0; i<a1.length; i++){             // i will compare and sort the first element from the array
            int inter = i;                          // inter is tempory variable to store the index
            for(int j=i+1; j<a1.length; j++){       // j will now go to find the smallest element among the left elements
                if(a1[j]<a1[inter]){                // compare the index value referred, with the intermediate value
                    inter=j;                        // change the intermediate value to j
                }
            }
            int swap = a1[i];                       // swaping element with the ith location
            a1[i] = a1[inter];                      // swaping element from intermidiate to the ith location
            a1[inter] = swap;                       // swap value will we inserted into intermediate 

        }
        for(int i=0; i<a1.length; i++){
            System.out.print(a1[i]+ " ");
        }
    
    }

    public static void main(String[] args) {
        int[] a1 = new int[] {3,7,8,2,1,2,5};
        selectionSort(a1);
    
    }
}