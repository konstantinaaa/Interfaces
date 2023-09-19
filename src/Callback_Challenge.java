interface MemberCallback
{
    void callback();
}

class Store {
    MemberCallback mem[] = new MemberCallback[100];
    int count = 0;

    public int getCount() {return count;}

    public void register(MemberCallback m)
    {
        if(count < mem.length)
            mem[count++] = m;
        else
            System.out.println("Store is full. Cannot register more members.");
    }

    public void inviteSale()
    {
        for(int i = 0; i < count; i++)
        {
            if(mem[i] != null)
                mem[i].callback();
        }

    }
}

class CustomerMember implements MemberCallback
{
    String name;

    CustomerMember(String name)
    {
        this.name = name;
    }

    @Override
    public void callback()
    {
        System.out.println("Ok, I will visit, " + name);
    }
}

public class Callback_Challenge {
    public static void main(String[] args) {

        Store store = new Store();
        CustomerMember c1 = new CustomerMember("John");
        CustomerMember c2 = new CustomerMember("Rose");

        store.register(c1);
        store.register(c2);

        System.out.println("Number of registered members: " + store.getCount() + ". I can register " + (store.mem.length - store.getCount()) + " more.");


        store.inviteSale();
    }
}
