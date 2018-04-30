package takeout;

import java.util.LinkedList;


class Burger
{
    private LinkedList<String> types;
    Burger()
    {
        types=new LinkedList<String>();
    }
    
    public void Add(String type)
    {
        types.addLast(type);
    }
    
    public void Show()
    {
        System.out.println("Burger is ready as below: ");
        for(int i=0;i<types.size();i++)
        {
            System.out.println(types.get(i));
        }
    }
}
