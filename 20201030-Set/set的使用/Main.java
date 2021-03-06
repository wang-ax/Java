package set的使用;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * ClassName Main
 * Description TODO
 * Author 30712
 * Date 2020-10-30
 * Time 20:51
 */
public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        //add()操作
        System.out.println(set.add("cat"));
        System.out.println(set.add("dog"));
        System.out.println(set.add("bird"));
        System.out.println(set.add("tiger"));
        //打印set
        System.out.println(set);
        //remove()操作
        System.out.println(set.remove("bird"));
        System.out.println(set);
        //插入一个set中已经有的数据
        System.out.println(set.add("tiger"));

        //set.clear();清空集合
        //判断set是否为空
        System.out.println(set.isEmpty());
        //元素个数
        System.out.println(set.size());

        //迭代操作
        //可以替换成for  each 循环
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
        /*for (String animal : set) {
            System.out.println(animal);
        }*/
        
        //可以对数组进行去重
        List<String > list = new ArrayList<>();
        list.add("apple");
        list.add("apple");
        list.add("apple");
        list.add("apple");
        list.add("peach");
        list.add("orange");
        Set<String> set2 = new TreeSet<>(list);
        System.out.println(set2);
        
        //自定义类
        Set<People>  people= new TreeSet<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                return 0;
            }
        });
        System.out.println(people.add(new People()));
        System.out.println(people.add(new People()));
        System.out.println(people);
    }
    static class People{
        int age;
        String name;
    }
}
