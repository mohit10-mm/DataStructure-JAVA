public class binarysearch {
    public static int binarySearch(int[] a1, int key, int first, int last){    // key is value to be searched , first is start and last is end of the array
        int mid = (first+last)/2;                                              // divide array into 2 parts
        if (first <= last){                                                    // condition for binary search first will always be greater than last
            if(key == a1[mid]) {                                               //  if element entersed is same as the element of arraymid than return mid         
                return mid;
            }
            if(key < a1[mid]){                                                 // if element < mid element than last will be mid-1
                return binarySearch(a1, key, first, mid-1);
            }
            else{                                                              // if element > mid element than last will be mid+1
                return binarySearch(a1, key, mid+1, last);
            }
        }
        return -1;                                                            // element not found in array
    }

    public static void main(String args[]) {
        int[] a1 = new int[] {1,3,5,7,8,9,2};
        int index = binarySearch(a1, 3, 0, a1.length-1);
        if(index == -1){                                                      // element not found in array
            System.out.println("element not foundin array");
        }
        else{
            System.out.println("element foundat index " + index);
        }

        
    }
    
}
