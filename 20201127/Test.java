package day5;

/**
 * ClassName day5
 * Description TODO
 * Author 30712
 * Date 2020-11-27
 * Time 23:39
 */
public class Test1 {
    String  str = new String("good");
    char[] ch = {'a','b','c'};
    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and");
        System.out.println(ex.ch);
 /*       String s="asd";
        System.out.println(s);*/
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] ='g';
    }
}
