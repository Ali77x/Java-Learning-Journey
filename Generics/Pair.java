class Pair<T>{
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public void display(){
        System.out.println(item);
    }
}