package code_0302;
//아이디 비밀번호
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//System.in 시스템에서 받는다

        Map<String, String> map = new HashMap<>();

        map.put("Spring", "1234");
        map.put("summer", "12345");
        map.put("fall", "123");
        map.put("winter", "123456");
        //로그인 부분
        while(true){
            System.out.println("아이다와 비밀번호를 입력하세요!!");
            System.out.print("아이디 : ");
            String id = scanner.nextLine();
            System.out.print("비밀번호 : ");
            String password = scanner.nextLine();
            if(map.containsKey(id)){//아이디에 해당하는키가 있는지
                if(map.get(id).equals(password)){
                    //password == map.keySet(id)
                    System.out.println("성공");
                    break;
                }else{
                    System.out.println("비밀번호가 일치하지 않음");
                    continue;
                }
            }else {//키가 없을때
                System.out.println("아이디가 존재하지 않습니다");
                continue;
            }
        }

    }
}
