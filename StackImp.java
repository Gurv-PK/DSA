
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackImp<T> implements Iterable<T>{

    private LinkedList<T> list = new LinkedList<>();

    public StackImp(){}

    public StackImp(T ele){push(ele);}

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public void push(T ele){
        list.addLast(ele);
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    @Override
    public Iterator <T> iterator(){
        return list.iterator();
    }


    public static void main(String[] args) {
        
    }

}