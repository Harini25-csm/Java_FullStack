package Oops.Polymorphism;

public class FoodDeliveryApp {
    public void deliveryingTheFood(){
        System.out.println("Deliverying The Food");
    }
    
    static class zomato extends FoodDeliveryApp{
        @Override
        public void deliveryingTheFood(){
            System.out.println("The Food is delivered from zomato app");
        }
    }
    
    static class swiggy extends FoodDeliveryApp{
        @Override
        public void deliveryingTheFood(){
            System.out.println("The Food is delivered from swiggy app");
        }
    }
    public static void main(String[] args) {
        new FoodDeliveryApp().deliveryingTheFood();
        new zomato().deliveryingTheFood();
        new swiggy().deliveryingTheFood();
    }
}
