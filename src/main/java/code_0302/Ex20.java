package code_0302;

import java.util.ArrayList;
import java.util.List;

/*
set map
collection 조부모

list: 인덱스 -> 중복가능
 arrylist vetor/ linked -> 무조건적 상속 implements
list가 부모
Arrylist 배열에 번호가 있다 수정가능
linkedlist:

arry: 추가 삭제 불가능
list/ set 단일 상속만 가능

set: 인덱스 없고 수정가능 -> 중복안됨
hashset:
TreeSet: 잘안쓴다 안배움

Map: 키와 값 -> 키는 중복안됨
HashMap

List 컬렉션: 대문자 객체 클래스
boolean add() 맨끝에 추가
void add(index, element) //void 따로 확인해야함 리턴안되서
오버로딩 이름같은거/ 오버라이딩
E set() //리턴 해준다

객체검사
boolean contains(Object o)
E get(index)//가져올때
boolean isEmpty() 컬렉션이 비어있는지 true== 빈통
int size <-> length

삭제
void clear  -> 리턴 하지 않음 == 판단할때 size 확인
E remove(index)
boolean removw(odject)  //계시판의 목록을 삭제할것이냐 -> 동명이인이 삭제되지 않도로 조심하자
ㅒ오브젝 != int
List <오브젝> list
list.set(index, "");
sout(list.get(2));

ArrayList
기본 10개로 정해놓고 만일 용량 초과면 갑절로 늘러난다 = 자동조절

Vector(스레드)
배열에 동시에 접근가능한게 멀티 스레드
벡터는 하나의 스레드가실행을 완료해야 실행가능

LinkedList 사용법은 arraylist와 동일
차이점
인조참조: 체인으로 관리
앞과 뒤의 인덱스 번호 본인에게 기입 Qu

 */
public class Ex20 {
    public static void main(String[] args) {
//        int a[] = new int[2];
        List<String> list = new ArrayList<>();
        //다형성 개 = 고양이
        list.add("JAVA");
        list.add("Spring");//자바편하게 만든 프레임워크
        list.add("Mybatis");
//        pht   서버내릴필요없음
        list.add(2, "Oracle");


        System.out.println(list.size());//4
        System.out.println(list.get(2));//Oracle
        list.set(3, "ibatis");//수정

        for(int i =0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        list.remove(0);//java삭제
        list.remove("ibatis");
        list.clear();

        System.out.println(list.isEmpty());
        System.out.println(list.toString());


    }
}
