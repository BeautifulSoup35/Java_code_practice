package class0316;
/*
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

 */
import java.util.Scanner;
import java.util.Stack;

public class Bj10828 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        //for문을 몇번 돌릴까 -> n
        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i =0; i< n; i++){
            String s = scanner.nextLine();
            //push 는 짤라야함 뒤에 숫자를 어떻게 나눌까
            String arr[] = s.split(" "); //[push, 10]

            switch (arr[0]){//예외설정이 쉬운 switch
                case "push":
                    stack.push(Integer.parseInt(arr[1])); //문자열을 int로
                    break;
                case "pop":
                    if(stack.isEmpty()) System.out.println(-1);//백터에서 사용
                    else System.out.println(stack.pop());
//                    if(stack.empty())
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
//                    if(stack.isEmpty()) System.out.println(1);
//                    else System.out.println(-1);
                    System.out.println(stack.isEmpty()? 1 : -1);
                    break;
                case "top":
                    if(stack.isEmpty()) System.out.println(-1);//백터에서 사용
                    else System.out.println(stack.pop());
                    break;
                default:
                    break;
            }
        }


    }
}


