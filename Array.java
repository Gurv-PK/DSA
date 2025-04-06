@SuppressWarnings("unchecked")
public class Array<T>{
    private T arr[];
    public int len =0;
    public int capacity =0;

    public Array(){
        this(16);
    }

    public Array(int cap){
        this.capacity=cap;
        arr = (T[]) new Object[cap]; 
    }

    public int size(){
        if(len==0) return -1;
        return len;
    }

    public String isEmpty(){
        if(size()==-1) return "Array is empty";
        else return "Array is not empty";
    }

    public String get(int i){
        if(i>len) return "Out of bounds" ;
        else
            return "Element present"+arr[i] ;
    }

    public void add(T ele){
        if(len+1 >= capacity)
            if (capacity == 0) capacity+=1;
            else
                capacity = capacity*2;
            T[] new_arr = (T[]) new Object[capacity];
            for (int i=0;i<len;i++)
                new_arr[i] = arr[i];
            arr = new_arr;
        arr[len++] = ele;       
    }

    public void removeAt(int index){
        if(index >= len && index <0) throw new IndexOutOfBoundsException();
        T[] new_arr = (T[]) new Object[len-1];
        for(int i =0,j=0;i<len;i++,j++)
            if(i==index)
                j--;
            else
                new_arr[j]=arr[i];
        arr = new_arr;
        capacity = --len;
    }

    public void remove(Object obj){
        for(int i =0;i<len;i++){
            if(arr[i]==obj){
                removeAt(i);
            }
        }            
    }

    public void display_arr(){
        for(int i =0;i<len;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("rawtypes")
        Array arr = new Array(50);

        System.out.println(arr.isEmpty());

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println("Size is "+arr.size());


        System.out.println("Array is ");
        arr.display_arr();

        System.out.println(arr.isEmpty());

        arr.remove(30);
        System.out.println("Array is ");
        arr.display_arr();
        arr.removeAt(0);
        System.out.println("Array is ");
        arr.display_arr();
        
    }

}
