package org.wenjin;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hello {
    //模板一：psvm
    public static void main(String[] args) {
        System.out.printf("文瑾哈哈哈");
        ArrayList list = new ArrayList();
        LinkedList ll = new LinkedList();
        System.out.println("hello");
        //模板二：sout
        System.out.println("args = [" + args + "]");
        System.out.println("Hello.main");
        int i =10;
        System.out.println("i = " + i);
        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","wenjin"};
        for (int j = 0; j <arr.length ; j++) {
            System.out.println(arr[j]);
        }
        //变形：iter  增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int j = 0; j < arr.length; j++) {
            String s = arr[j];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list1 = new ArrayList();
        LinkedList<Object> list2 = new LinkedList<>();
        list1.add(123);
        list1.add(234);
        list1.add(3464);
        //模板五：ifn
        if (list1 == null) {

        }
        //if变形：inn
        if (list1 != null) {

        }
        //if变形：xxx.nn / xxx.null
        if (list1 == null) {

        }
        if (list1 != null) {

        }
    }

}