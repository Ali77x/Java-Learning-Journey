class KeyValue<K,V>{
    private final K key;
    private final V value;
    public KeyValue(K key, V value){
        this.key = key;
        this.value = value;
    }

    public void display(){
        System.out.println("Key: " + key + "\nAge: " + value);
    }
}