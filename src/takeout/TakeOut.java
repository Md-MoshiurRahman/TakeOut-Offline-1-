package takeout;

interface Waiter
{
    void AddPatty(String s1);
    void AddSauce(String S2);
    void AddCheese(String S3);
    Burger getBurger();
}

public class TakeOut {

    
    public static void main(String[] args) {
        Students students = new Students();
        students.s1="Chicken Patty";
        students.s2="Chili Sauce";
        students.s3="Ricotta Cheese";
        
        Students students2 = new Students();
        students2.s1="Beef Patty";
        students2.s2="Tomato Sauce";
        students2.s3="Stilton Cheese";
        
        Waiter chickenmaker = new ChickenBurger();
        Waiter beefmaker = new BeefBurger();
        
        // Making ChickenBurger
        students.Construct(chickenmaker);
        Burger chcknB = chickenmaker.getBurger();
        chcknB.Show();
        
        //Making BeefBurger
        students2.Construct(beefmaker);
        Burger beefB = beefmaker.getBurger();
        beefB.Show();
        
    }
    
}
