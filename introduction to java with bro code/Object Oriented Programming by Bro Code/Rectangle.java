class Rectangle extends Shape{

    double base;
    double height;

    Rectangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return base * height;
    }
    
}