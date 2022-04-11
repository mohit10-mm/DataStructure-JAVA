public class merge_sort{
    static void mergesort(int[] a1, int first, int end){   // taking array to be sorted , start nd end of array
        if(first<end){                                     // recursive call the array until the single element left or first is less then end
            int mid = (first+end)/2;                       // finding mid value for partition
            mergesort(a1, first, mid);                     // recursive calling the merge sort for the left side
            mergesort(a1, mid+1, end);                     // recursive calling the merge sort for the right side
            merge(a1, first, mid, end);                    // calling merge function to merge the elements 
        }
    }
    static void merge(int a1[], int first, int mid, int end){    // merge function 
        int i, j, k;                                             // i,j,k are 3 pointers pointing towards the index of left, right and reultant array
        int lsize = mid - first+1;                               // size of left array
        int rsize = end - mid;                                   // size of right array
        int l1[] = new int[mid+1];                               // defining left array
        int r1[] = new int[end-mid];                             // defining right array
        for(i=0; i<lsize; i++){                                  // inserting data into the left array
            l1[i] = a1[first+i];
        }
        for(j=0; j<rsize; j++){                                   // inserting data into the right array
            r1[j] = a1[mid+1+j];
        }
        i=0;
        j=0;
        k=first;
        while(i<lsize && j<rsize){                                // comparing and inserting the smallest value into the resultant array 
            if(l1[i]<=r1[j]){
                a1[k] = l1[i];
                i++;
            }
            else{
                a1[k] = r1[j];
                j++;
            }
            k++;
        }
        while(i<lsize){                                           // if we reach to the end of any array the remaining elements of other array are directly inserted into the resultant array
            a1[k] = l1[i];
            i++;
            k++;
        }
        while(j<rsize){
            a1[k] = r1[j];
            j++;
            k++;
        }
    }

public static void main(String[] args){
    int[] a1 = new int[] {3,5,1,7,9,1,6};
    mergesort(a1, 0, a1.length-1);
    for(int i=0; i<a1.length; i++){
        System.out.print(a1[i]+" ");
    }

}

}