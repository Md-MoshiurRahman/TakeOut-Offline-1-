
package takeout;


class ChickenBurger implements Waiter
{
    private Burger burger= new Burger();

    @Override
    public void AddPatty(String S1) {
        //burger.Add("Chicken Patty");
        burger.Add(S1);
    }

    @Override
    public void AddSauce(String S2) {
        //burger.Add("Chili Sauce");
        burger.Add(S2);
    }

    @Override
    public void AddCheese(String S3) {
        //burger.Add("Ricotta Cheese");
        burger.Add(S3);
    }

    @Override
    public Burger getBurger() {
        return burger;
        
    }    
}
