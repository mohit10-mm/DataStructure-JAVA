public class tower_of_hanoi {
    public static void main(String[] args){
        int n=5;
        shiftdisk(n,'A','B','C');

    }
    public static void shiftdisk(int n, char TA, char TB, char TC) {
        if(n==1){
            System.out.println("shifted from "+TA+" to "+TC);
        }
            else{
                shiftdisk(n-1, TA, TC, TB);
                System.out.println("Disk "+n+" from "+TA+" is shifted to "+TB);
                shiftdisk(n-1, TB, TA, TC);
            }

        }
        
}
