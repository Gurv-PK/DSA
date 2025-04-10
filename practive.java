public class practive<T>{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private class Node<T>{
        Node<T> prev = null;
        Node<T> next = null;
        T data;

        public Node(T data, Node<T> prev,Node<T> next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }

    }


    public boolean IsEmpty(){
        return size==0;
    }

    public void InsertFirst(T ele){
        if(IsEmpty()) head=tail=new Node<>(ele,null,null);

        else{
            head.prev = new Node<T>(ele, null, head);
            head=head.prev;

        }
        size++;
    }

    public void display(){
        Node trav = head;
        while(trav!=null){
            System.out.println(trav.data);
            trav=trav.next;
        }
    }

    public static void main(String[] args) {
        practive pv = new practive<>();
        System.out.println("Is DLL empty "+pv.IsEmpty());
        System.out.println("Adding element at first position");
        pv.InsertFirst(12);
        pv.InsertFirst(21);
        pv.InsertFirst(56);
        System.out.println("Is DLL empty "+pv.IsEmpty());
        pv.display();
    }

}