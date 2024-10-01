package nested.test;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private int size;
    private int cnt;
    List<Lib> array = null;

    private static class Lib{

        private String bookName;
        private String author;

        public Lib(String bookName, String author) {
            this.bookName = bookName;
            this.author = author;
        }
    }

    Library(int size) {
        this.size = size;
        array = new ArrayList<Lib>(size);
        this.cnt = size;
    }

    public void addBook(String bookName, String author){

        if(cnt >= size) {
            System.out.println("도서관 저장 공간이 부족합니다");
        }else {
            Lib lib = new Lib(bookName, author);
            array.add(lib);
            cnt ++;
        }
    }

    public void showBooks(){
        System.out.println("==책 목록 출력==");
        for (Lib lib : array) {
            System.out.println("도서 제목 : " + lib.bookName + ", 저자: " + lib.author);
        }
    }
}
