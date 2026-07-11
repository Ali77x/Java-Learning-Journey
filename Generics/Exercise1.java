public class Exercise1{
    public static void main(String[] args){
//using the container generic class

        Container<String> fruit = new Container<>();
        Container<Integer> quantity = new Container<>();
        Container<Double> pricePerFruit = new Container<>();

        fruit.setValue("Mango");
        quantity.setValue(13);
        pricePerFruit.setValue(3.75);

        System.out.printf("Grocery Receipt.\nItems Bought: \nFruit: %s \nQuantity: %d \nPrice Per Item: %.2f \nTotal Price: %.2f", fruit.getValue(), quantity.getValue(), pricePerFruit.getValue(), quantity.getValue() * pricePerFruit.getValue() );


        
    }
}