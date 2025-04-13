package cote6;
import java.util.*;
public class Cote0413 {
    public static void main(String[] args){
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        Solution1 solution1 = new Solution1();
        int result = solution1.solution1(board, moves);
        System.out.println("Result: " + result);


        String new_id = "...!@BaT#*..y.abcdefghijklm";
        Solution2 solution2 = new Solution2();
        result = Integer.parseInt(solution2.solution2(new_id));
    }
}

class Solution1 {
    public int solution1(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        //크기 측정

        for(int i = 0; i < moves.length; i++){
            for( int j =0; j< board.length; j++){
                if(board[j][moves[i] - 1] != 0) {
                    if(stack.peek() == board[j][moves[i] - 1]) stack.pop();
                    else  stack.push(board[j][moves[i] - 1]);
                }
                answer = stack.peek();
            }
        }
        return answer;
    }
}


class Solution2 {
    public String solution2(String new_id) {
        String answer = "";
        int len= new_id.length() + 1;
        new_id = new_id.toLowerCase();
        // new_id.replaceAll(_-.abcd,)
        if(new_id.indexOf(".") == 0 || new_id.indexOf(".") == len)
            new_id.replaceAll(".","");
        if(len == 0)  new_id = "a";
        if(len > 14) {
            new_id.substring(15, len);
            if(".".equals(new_id.charAt(len))) new_id.replaceAll(".","");
        }
        if(len < 2){
            while(len == 3){
                new_id += new_id.charAt(len);
            }
        }
        return answer;
    }
}

class Solution3 {
    public String solution3(String new_id) {
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9\\-\\_\\.]","");
        while(new_id.contains("..")){
            new_id = new_id.replace("..", ".");
        }
        new_id = new_id.replaceAll("^[\\.]", "").replaceAll("[\\.]$","");
        if(new_id.equals(""))  new_id = "a";
        if(new_id.length() > 15) {
            new_id.substring(0, 15);
            new_id = new_id.replaceAll("[\\.$]","");
        }
        if(new_id.length() < 2){
            while(new_id.length()< 3){
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;


    }
}

class Solution4 {
    public int[] solution4(int[] lottos, int[] win_nums) {
        int max = 0, min =0;
        for(int num: lottos){
            if(num == 0) max++;
            else{
                for(int i =0; i < win_nums.length; i ++){
                    if(num == win_nums[i]){
                        max++;
                        min++;
                    }
                }
            }
        }
        //순차 검색
        //이진검색 : 배열이 오른차순이나 내림차순이여야 함
        int[] rank = {6, 6, 5, 4, 3, 2, 1};

        int[] answer = {rank[max], rank[min]};
        return answer;//등수
    }

}

class Solution5 {
    public int solution5(String s) {
        int answer = 0;
        String[] num = {"zero","one","two","three","four"
                ,"five","six","seven","eight","nine"};

        for(int i = 0; i < num.length; i ++){
            s = s.replace(num[i], String.valueOf(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}

class Solution6 {
    public String solution6(String[] survey, int[] choices) {
        String answer = "";
        char posit[] = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        int posit_num[] = {0,   0,   0,   0,   0 ,  0 ,  0 ,  0};
        for(int j =0; j < survey.length; j++){
            if(choices[j] < 4){
                for(int i = 0; i<posit.length; i++){
                    if(posit[i] == survey[j].indexOf(0))posit_num[i]++;
                }
            }
            else if(choices[j] == 4) {continue;}

            else {
                for(int i = 0; i<posit.length; i++){
                    if(posit[i]==survey[j].indexOf(1))posit_num[i]++;
                }
            }
        }

        for(int i =0; i < posit_num.length; i+=2){
            if(i -(i+1) > 0) answer += posit[i];
            else if( i -(i+1) == 0 ) answer += posit[i];
            else answer += posit[i+1];
        }


        return answer;
    }
}