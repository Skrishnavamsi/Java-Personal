public class Product {
    double price;

    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    public double getPrice(int quantity){
        return quantity*price;
    }

    public void printType() {
        System.out.println("This is a product");
    }
}

class Car extends Product{
    @Override
    public void printType() {
        System.out.println("This is a Car");
    }
}