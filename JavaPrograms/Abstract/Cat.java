package Abstract;

public class Cat {
    public void sleep(){
        Dog d=new Dog();
        d.eating();
    }
    public static void main(String[] args) {
        Cat c=new Cat();
        new Cat().sleep();
        
    }
}
