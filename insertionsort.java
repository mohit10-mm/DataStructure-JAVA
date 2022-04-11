public class insertionsort {
    public static void insertion(int[] a1){
        for(int i=0; i<a1.length; i++){      // i is the pointer which will start from beginning and go to the end 
        int j=i-1;                           // j  keep track to the previous element to that particular index
        int b=a1[i];                         // j will keep track of just previous element than the element being sorted right now
        
        while(j>=0 && b<=a1[j]){             // b is the temporry element which will store the element to be compared
            a1[j+1]=a1[j];                   // swapimg values (j +1th index element will become jth index element)
            j=j-1;
        }
         a1[j+1]=b;                          // jth+1 element will become the B
        }

        for(int i=0; i<a1.length; i++){      // print the element
            System.out.print(a1[i]+" ");
        }
    }

    public static void main(String[]  args) {
         int[] a1 = new int[]{3,1,8,7,5,6,9};
         insertion(a1);
        
    }
    
}
