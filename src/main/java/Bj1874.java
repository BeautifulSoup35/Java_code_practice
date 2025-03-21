package class0316;
/*
스택 (stack)은 기본적인 자료구조 중 하나로, 컴퓨터 프로그램을 작성할 때 자주 이용되는 개념이다.
스택은 자료를 넣는 (push) 입구와 자료를 뽑는 (pop) 입구가 같아 제일 나중에 들어간 자료가 제일 먼저 나오는 (LIFO, Last in First out) 특성을 가지고 있다.

1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다.
이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지,
 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.
 */

import java.util.Scanner;
import java.util.Stack;

public class Bj1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = scanner.nextInt();// 몇 개의 숫자로 할지 ex)8
        int top = 0;

        for(int i = 0; i< n; i++){
            int m = scanner.nextInt(); // 4 <top -> 1,2,3,4 저장
            //최종적으로 저장되는 장소 top
            if(m >top){
                for(int j = top+1; j<=m; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                top = m;
            }else if(stack.peek() != m){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb.toString());




    }

}
