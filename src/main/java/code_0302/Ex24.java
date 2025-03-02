package code_0302;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map
public class Ex24 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//            key     valu
        map.put("홍길동", 90);
        map.put("이몽룡", 100);
        map.put("변학도", 80);
        map.put("홍길동", 99);//key의 중복 if vlau값으로 대체 된다

        //확인
        System.out.println(map.size());
        System.out.println(map.get("홍길동"));//99 -> 최종 업데이트값

        //key만 뽑아올때
        Set<String> keySet = map.keySet();// key만 가져오는 함수가 있다
        for(String key: keySet){
            System.out.println("이름: "+ key + ", 점수: " + map.get(key));//key변수가 있다니 key에 접근하면 valu를 얻을수있다

        }

        map.remove("홍길동");
        map.clear();


    }
}
