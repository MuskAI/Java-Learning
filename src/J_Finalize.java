import javax.print.DocFlavor;

class J_Book{
    public int m_id;
    public J_Book(int i){
        m_id = i;
    }
    protected void finalize()
    {
        switch (m_id)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("unk nown_book");
                break;
        }
        System.out.println("gc re used");
    }

}
public class J_Finalize {
    public static void  main(String args[])
    {
        J_Book book1 = new J_Book(1);
        new J_Book(2);
        new J_Book(3);
        System.gc();
    }

}
