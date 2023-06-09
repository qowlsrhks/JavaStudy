package 클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GSetter {
    public static int count;
    private int no;  //객체가 생성될 때 마다 ++
    private String name;
    private boolean gender;
    private String memo;
    private Date writeDate; // 객체가 생성되는 현재 날짜와 시간

    public GSetter() {

        this("무명씨", false, "없음");
    }

    public GSetter(String name, boolean gender, String memo) {

        no = ++count;
        this.name = name;
        this.gender = gender;
        this.memo = memo;
        writeDate = new Date();
    }

//    private 권한으로 설정된 멤버 변수는 클래스 외부에서 접근할수없다
//    이 규칙에 대한 예외로 Getter 와 Setter 메소드를 사용한다
//    Getter는 private 권한을 가지는 멤버 변수의 값을 얻어올 때 사용한다
//    Setter는 private 권한을 가지는 멤버 변수의 값을 수정할 때 사용한다


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
        return no+"." + name + "(" + (gender ? "남" : "여") + ")님이 " + sdf.format(writeDate) + "에 남긴 말 " + memo;
    }
}
