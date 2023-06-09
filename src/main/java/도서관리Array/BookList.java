package 도서관리Array;

import java.text.DecimalFormat;
import java.util.ArrayList;

//여러 권의 책 정보(BookVO)를 기억할 클래스
public class BookList {
    private ArrayList<BookVO> bookList = new ArrayList<>();  //여러 권의 책 정보를 기억할 ArrayList

    public ArrayList<BookVO> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<BookVO> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        String str = "";
        str += "==============================\n";
        str += "도서명 저자명 출판사명 출판일 가격 \n";
        str += "==============================\n";

        double total = 0.0;
//        ArrayList의 개수만큼 반복
//        for (int i = 0; i < bookList.size(); i++) {
//            str += bookList.get(i) +"\n";
//            total += bookList.get(i).getPrice();
//        }
//        향상된 for : 배열이나 ArrayList의 저장된 내용을 0번째 값부터 마지막 값까지 전체를 처리할때 효과적이다
//        for(배열이나 ArrayList의 자료형 변수명 : 배열이나 ArrayList 이름){
//        반복해서 실행 할 문장;
//        ...
//    }
        for(BookVO book : bookList){
            str += book + "\n";
            total += book.getPrice();
        }

        str += "==============================\n";
        DecimalFormat df = new DecimalFormat("#,##0원");
        str += "합계 금액 : "+df.format(total)+"\n";
        str += "==============================\n";

        return str;
    }
    public void addBook(BookVO book) {
        bookList.add(book);
    }
}


//배열로 할때는 멤버 변수 개수부터 예외 처리까지 코드가 길어지지만 ArrayList로 할때는 간결하고 간단해진다
