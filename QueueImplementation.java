public class QueueImplementation{
    
    Integer[]  arr = new Integer[10];
    int front =0 , rear =-1;

    public QueueImplementation(){}

    public boolean isEmpty(){
        return front >rear; 
            
    }

    public void enqueue(int ele){

        if(rear == arr.length - 1) {
            System.out.println("Queue is full");
            return;
        }

        arr[++rear]=ele;
    }

    public int dequeu(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        else{
           int item = arr[front++];
           return item;
        }
    }

    public void display(){
        for (int arr1 = front;arr1<=rear;arr1++) {
            System.out.print(arr[arr1] + "--");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation qi = new QueueImplementation();
        System.out.println(qi.isEmpty());
        qi.enqueue(10);
        qi.enqueue(20);
        qi.enqueue(30);

        qi.display();
        qi.dequeu();
        qi.display();
        System.out.println(qi.isEmpty());
    }

}