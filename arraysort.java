import java.util.Arrays;

public class arraysort {
    
    public static int search(int array[], int key) {
        for(int i=0;i<array.length;i++) {
            if(array[i]==key)
                return i;
        }
        return -1;
    }
        public static void main(String[] args) {
            int a1[]= new int[] {3,4,9,6,7,8,1};
            for(int i=0;i<a1.length;i++){
                System.out.print(a1[i]+" ");
            }
            Arrays.sort(a1);
            System.out.println();
            for(int i=0;i<a1.length;i++){
                System.out.print(a1[i]+" ");
            }
            int IndexValue = search(a1,7);
            if(IndexValue == -1)
                System.out.println("elment not found");
            else
                System.out.println("element found" +" "+IndexValue);

        }       
}
