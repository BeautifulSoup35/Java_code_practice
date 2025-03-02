package code_0302;

import java.util.List;
import java.util.Vector;

public class Ex21 {
    public static void main(String[] args) {
        //Board board = new Board("제목", "내용", "작성자");
//        board.
//brdad와 연결상태// 저장중
        List<Board> list = new Vector<>();
        list.add(new Board("제목1", "내용1", "작성자1"));
        list.add(new Board("제목2", "내용2", "작성자2"));
        list.add(new Board("제목3", "내용3", "작성자3"));
        list.add(new Board("제목4", "내용4", "작성자4"));
        list.add(new Board("제목5", "내용5", "작성자5"));
        list.add(new Board("제목6", "내용6", "작성자6"));

        System.out.println(list.size());

        //이제 get으로 가져온다
        for(int i =0; i < list.size(); i++){
            Board board = list.get(i);
            System.out.println(board);//라인전체
//            결과code_0302.Board@73a28541
            //code_0302.Board@6f75e721
            //code_0302.Board@69222c14
            //code_0302.Board@606d8acf
            //code_0302.Board@782830e
            //code_0302.Board@470e2030
            System.out.println(board.getTitle() + "\t" + board.getContent() + "\t" + board.getWriter());
//            System.out.println(board.get(1));??
        }

    }
}
