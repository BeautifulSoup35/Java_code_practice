package code_0302;
//set

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex23 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("JAVA");
        set.add("Spring");
        set.add("Oracle");
        set.add("JAVA");
        set.add("Mybatis");
        System.out.println(set.size());
        System.out.println(set.toString());//[JAVA, Spring, Oracle, Mybatis]

        set.remove("Oracle");
        //for문으로 그냥은 안되고 향상된 for문으로 가능
        for(String str : set){
            System.out.println(str);//인덱스 추출
        }
        Iterator<String> iterator = set.iterator();//반복하겠
        while(iterator.hasNext()){
            //hasNext 에 boolean 갈수있는지 확인한다 다음을 계속확인
            System.out.print(iterator.next()+ " ");
        }


//        git init
//        git config user.name "BeautifulSoup35"
    }
}
