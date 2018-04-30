
package takeout;

class Students
{
    Waiter mywaiter;
    String s1;
    String s2;
    String s3;
    
    public void Construct(Waiter waiter)
    {
        mywaiter=waiter;
        mywaiter.AddPatty(s1);
        mywaiter.AddSauce(s2);
        mywaiter.AddCheese(s3);
    }
}
