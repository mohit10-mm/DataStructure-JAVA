import java.util.Scanner;

public class linearsearch {
    public static void main(String args[]){
        int a1[] = new int[] {6,4,5,8,2,5,1,9};     // defining array
        Scanner s1 = new Scanner(System.in);      // to get the input  we use scanner class (this defines which element to search)
        int count = 0;                            // if count find similar element it will increment and otherwise it will be zero
        System.out.println("enter the element to be searched");
        int key = s1.nextInt();                    // user input using nextInt method
        for(int i=0; i<a1.length; i++){           //  for loop will run from beginning of array and go till the end and compare each element with the entered element 
            if (a1[i]==key) {
                System.out.println("index of element  " + i);
                count ++;
            }   
        }
        if(count==0)                               // when element searched is not in the array 
            System.out.println("element not found");
    }
    }

