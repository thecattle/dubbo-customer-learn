package com.sunp.customer;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author sunpeng
 * @time 2018/1/19 11:23
 * @description
 */
public class TestMain {
//    private transient volatile boolean initialized;
//    private transient volatile boolean destroyed;
//
//    public static void main(String[] args) {
//        TestMain testMain=new TestMain();
//        System.out.println(testMain.initialized);
//        System.out.println(testMain.destroyed);
//
//        List list=new ArrayList();
//        list.add(1);
//        List list1=new ArrayList();
//        Optional.ofNullable(list).ifPresent((value)->{
//            list1.addAll(list);
//        });
//        System.out.println(list1);
//
//        Optional.ofNullable(null).orElse("-");
//
//        Integer integer = formatNumber(1, i -> i + 1);
//        System.out.println(integer);
//
//        String s = formatString(100L, l -> getString(l));
//        System.out.println(s);
//
//        Consumer<String> consumer=(String str)->{
//            System.out.println(str);
//        };
//
//        setConsumer("sun",consumer);
//
//    }
//
//    private static Integer formatNumber(int i, Function<Integer,Integer> function){
//        Integer i1= function.apply(i);
//        return i1;
//    }
//    private static String formatString(Long i, Function<Long,String> function){
//        return function.apply(i);
//    }
//
//    private static String getString(Long i){
//        return i+"";
//    }
//
//    private static void setConsumer(String str, Consumer<String> consumer){
//        consumer.accept(str);
//    }

}
