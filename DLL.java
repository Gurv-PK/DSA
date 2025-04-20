
public class DLL<T>{

    private int size;
    private Node <T> tail = null;
    private Node <T> head = null;

    private class Node<T>{
        T data;
        Node prev,next=null;

        public Node(T data, Node<T> next, Node<T> prev){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
        @Override public String toString(){
            return data.toString();
        }
    }

    public void clear(){
        Node<T> trav = head;
        while(trav!=null){
            Node<T> next = trav.next;
            trav.prev=trav.next=null;
            trav.data=null;
            trav=next;
        }
        trav=head=tail=null;
        size =0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void AddFirst(T ele){
        if(isEmpty()){
            head = tail = new Node(ele,null,null);
        }
        else{
            head.prev = new Node<T>(ele, head, null);
            head = head.prev;
        }
        size++;
    }

    public void AddLast(T ele)
    {
        if(isEmpty()){
            head = tail = new Node(ele,null,null);
        }
        else{
            tail.next = new Node<T>(ele, null, tail);
            tail = tail.next;
        }
        size++;
    }

    public void Removefirst(){
        if(isEmpty()) throw new RuntimeException("List is empty");

        
        head = head.next;
        size--;

        if(isEmpty()) 
            tail=null;
        else
            head.prev=null;
        

    }


}

