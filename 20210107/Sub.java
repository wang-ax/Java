/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-06
 * Time 23:24
 */
class Supper{
    public int get()
    {
        System.out.println("Supper");
        return 5;
    }
}
public class Sub{
    public int get()
    {
        System.out.println("Sub");
        return new Integer("5");
    }

    public static void main(String args[]) {
        new Supper().get();
        new Sub().get();
    }
}