package class0316;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
3: 스택에 들어있는 정수의 개수를 출력한다.
4: 스택이 비어있으면 1, 아니면 0을 출력한다.
5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 */
public class Bj28278 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.nextLine();

        for(int i =0; i< n; i++){
            String s = scanner.nextLine();
            switch (s){
                case "1":
                    String arr[] = s.split(" ");
                    stack.push(Integer.parseInt(arr[1]));
                    break;
                case "2":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    }
                    else{
                        stack.pop();
//                        System.out.println(Arrays.toString(stack));
                        System.out.println(stack);
                    }
                    break;
                case "3":
                    System.out.println(stack.size());
                    break;
                case "4":
                    System.out.println(stack.isEmpty() ? 1 : 0);
                    break;
                case "5":
                    System.out.println(stack.isEmpty() ? -1 : stack.peek());
                    break;

            }
        }
    }
}
