/**
 * ClassName PACKAGE_NAME
 * Description TODO
 * Author 30712
 * Date 2021-01-19
 * Time 10:39
 */
public class Demo {
    class Super{
        int flag=1;
        Super(){
            test();
        }
        void test(){
         System.out.println("Super.test() flag="+flag);
        }
    }
    class Sub extends Super{
        Sub(int i) {
            flag=i;
            System.out.println("Sub.Sub()flag="+flag);
        }
        void test(){
            System.out.println("Sub.test()flag="+flag);
        }
    }
    public static void main(String[] args) {
        new Demo().new Sub(5);
    }
}

