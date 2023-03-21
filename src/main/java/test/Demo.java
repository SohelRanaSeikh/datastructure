package test;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<String> st = new ArrayList();
        st.add("sohel");
        st.add("abhishek");
        st.add("sudha");
        //   Map<Character,Integer> m=new HashMap<>();
        String result = String.join("", st);
        // Stream.of(st).
        // List<String> l=st.stream().map(s->s.split("").flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println("test-- " + result);

        List<Character> chars = result.chars().mapToObj(c -> (char) c).distinct().
                sorted().collect(Collectors.toList());
        System.out.println(chars);

        String[] str = {"abc", "dxyz", "pqr", "xyz"};

        String res = String.join("", str);
        System.out.println("res : " + res);
        res.chars().mapToObj(c -> (char) c).distinct().sorted().forEach(System.out::print);
        List<Character> list = res.chars().mapToObj(c -> (char) c).distinct().sorted().
                collect(Collectors.toList());

        System.out.println("list :" + list);
        String[] myArray = new String[list.size()];
        list.toArray(myArray);
        System.out.println("str2 : " + myArray);
        String[] str1 = {"abc", "xyz", "pqr", "xyz"};
        //  Stream.of(str1).distinct().forEach(System.out::println);
    }
}
