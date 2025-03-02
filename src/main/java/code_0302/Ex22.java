package code_0302;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


//linkedlist
public class Ex22 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i = 0; i< 10000; i++){
            list1.add(0, String.valueOf(i));//정수를 문자로 바꾼것

        }
        endTime = System.nanoTime();
        System.out.println("ArryList "+(endTime - startTime)+"ns");//속도체크 얼마나 느릴까
//4424300


        startTime = System.nanoTime();
        for(int i = 0; i< 10000; i++){
            list2.add(0, String.valueOf(i));//정수를 문자로 바꾼것

        }
        endTime = System.nanoTime();
        System.out.println("LinkedList "+(endTime - startTime)+"ns");
//        ArryList   4430700ns
//        LinkedList 1275800ns

//
        String my_string = "lovekdo";
        //for문으로 문자열 만큼 돌러셔
        //하나인 char을 string vlau로 바꾸고
        //비교해서 넣는다
        List<String> list = new ArrayList<>();
        for(int i =0; i < my_string.length(); i++){
            list.add(String.valueOf(my_string.charAt(i)));
        }
        System.out.println(list);
    }
}
