
package takeout;

class BeefBurger implements Waiter
{
    private Burger burger= new Burger();

    @Override
    public void AddPatty(String S1) {
        //burger.Add("Beef Patty");
        burger.Add(S1);
    }

    @Override
    public void AddSauce(String S2) {
        //burger.Add("Tamato Sauce");
        burger.Add(S2);
    }

    @Override
    public void AddCheese(String S3) {
        //burger.Add("Stilton Cheese");
        burger.Add(S3);
    }

    @Override
    public Burger getBurger() {
        return burger;
        
    }
    
}
