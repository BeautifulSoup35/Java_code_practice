package class0316;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stac {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();// stack 선언
        Scanner sc = new Scanner(System.in);
        ArrayStack stack = new ArrayStack(5);
        while(true){
            System.out.println("1. push 2. pop 3. peek 4. clear 5. print 0.exit");
            int n = sc.nextInt();
            if(n == 0){
                System.exit(0);//시스템 자체가 종료된다
                break;
            }
            switch (n){
                case 1:
                    System.out.println("push: ");
                    int x = sc.nextInt();
                    stack.push(x);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
//                    System.out.println(String.format("%", stack.peek())); &d 오른쪽 정렬, &s 왼쪽정렬(10보다 크면), %.2f(소주점 이하 2자리)
                    System.out.println("Peek: "+ stack.peek());
                    break;
                case 4:
                    stack.clear();
                    break;
                case 5:
                    stack.print();
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하셨습니다.");
//                break;//1부터 5가 아닌 값일때

            }
        }
    }
}

class  ArrayStack{
    private int max;
    private int top;
    private  int[] stack;

    public ArrayStack(int max){
        this.max = max;
        this.top = -1; //emtpy
        this.stack = new int[max];
    }//생성자 만들기

    public void push(int n){
        Scanner sc = new Scanner(System.in);
        if(top >= max -1){

        }else{
            stack[++top] = n;
        }


    }

    public void pop(){
        if(top <0){
        } else{
            stack[top] =0;
            --top;
        }
    }
    public int peek(){
        if(top <0){
            System.out.println(" stack is Empty");
            return -1;//빈 배열
        }
        return stack[top];
    }

    public void clear(){

    }

    public void print(){
        System.out.println(Arrays.toString(stack));
    }









}
