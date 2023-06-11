package 기본API;

public class 문자열클래스 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" world");
        System.out.println(str.concat(" world"));
    }

}

/* String클래스

concat(문자열) : 문자열을 연결

substring(인덱스,잘라낼 길이) : 문자열 자르기

length() : 문자열의 길이 반환

toUpperCase() : 문자열을 대문자로 반환

toLowerCase() : 문자열을 소문자로 반환

charAt(인덱스) : 인덱스에 해당되는 글자 반환

indexOf(문자열) : 문자열의 위치 반환

equals(문자열) : 문자열이 같은지 boolean으로 반환

trim() 문자열 앞,뒤 공백 제거

replace(기존문자열,대체문자열) : 기존문자열을 대체문자열로변경

replaceAll(변환할문자열,변환된문자열) : 문자열 내의 특정부분을 다른 문자열로 변경
*/
