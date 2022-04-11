class queueusingarray{
    
    int front_q, rear_q;
    int capacityofqueue;
    static int[] q1;

    queueusingarray(int size){
        capacityofqueue = size;
        q1 = new int[capacityofqueue];
    }

    void enqueue(int value){
        if(rear_q == capacityofqueue){
            System.out.println("queue is full");
        }
        else{
            q1[rear_q] = value;
            rear_q++;
        }
    }

    void dequeue() {
        if(rear_q==0){
            System.out.println("queue is empty");
        }
        else{
            for(int i=0; i<rear_q-1; i++) {
                q1[i] = q1[i+1];
            }
            rear_q--;
        }
    }
    void display(){
        if(rear_q==0){
            System.out.println("queue is empty");
        }
        else{
            for(int i=0; i<rear_q; i++){
                System.out.print(q1[i]+" ");
            }
        }
    }
    
}
public class implementation_queue {
    public static void main(String[] args){
        queueusingarray q2 = new queueusingarray(6);
        //q2.enqueue(2);
        q2.enqueue(4);
        q2.enqueue(6);
        q2.enqueue(8);
        q2.display();
        System.out.println();
        q2.dequeue();
        q2.display();
        System.out.println();
    }
}
