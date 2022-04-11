public class quick_sort {
    static int partition(int[] a1, int first, int last){
        int pivot = a1[last];                               // taking last as the pivot
        int i = first-1;                                    // setting pivot index as first -1 
        for(int j=first; j<last; j++){
            if(a1[j]<=pivot){                               // if element at 1st position is smaller than pivot
                i++;                                        // pivot index is incremented by 1
                int swap = a1[i];                           // swapping element at jth location with pivot index i
                a1[i] = a1[j];
                a1[j] = swap;
            }
        }
        int swap = a1[i+1];                                 // swaping the element in last position with the ith+1 index value
        a1[i+1] = a1[last];
        a1[last] = swap;

        return i+1;
            
    }
    static void quicksort(int[] a1, int first, int last){   
        if(first<last){
        int mid = partition(a1, first, last);              // calling partition
        quicksort(a1, first, mid-1);                       // dividing array and sorting the elements on the lefthand side of pivot
        quicksort(a1, mid+1, last);                        // sorting the elements on the righthand side of pivot
    }
    }
    public static void main(String[] args) {
        int[] a1 = new int[] {2,5,7,6,8,6,9};
        quicksort(a1, 0, a1.length-1);

        for(int i=0; i<a1.length; i++){
            System.out.print(a1[i]+ " ");
        }
        
    }
    
}
