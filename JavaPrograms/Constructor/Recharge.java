package Constructor;
public class Recharge{
    static void recharge(String mobileNum){
        System.out.println("Recharge default plan: "+mobileNum);
    }
    static void recharge(int ammount, String mobileNum){
        System.out.println("Recharge "+mobileNum +" for "+ammount);
    }
    static void recharge(String mobileNum, int ammount){
        System.out.println("Recharge "+mobileNum +" for "+ammount);
    }
    public static void main(String[] args) {
        recharge("789827266");
        recharge(350,"23445566");
        recharge("92445566", 360);
    }
}