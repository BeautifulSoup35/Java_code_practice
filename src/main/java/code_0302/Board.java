package code_0302;
//class Bored는 딱 하나
public class Board {
    private String title;
    private String content;
    private String writer;
    //권고사항 private 클래스에서만 작용하게 패키지 안 어떤 클래스에ㅔ도 수정할수있도록 하면 안된다
    public Board(){}    //생성자: 오버로딩한 여러가지 생성
    public Board(String title, String content, String writer){
        this.title = title;
        this.content =content;
        this.writer = writer;
    //생성자에서 지역변수를 데려온다 -> 상속에선 부모클래스는super로 하는걸 알수잇다
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
