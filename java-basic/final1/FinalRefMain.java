package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data; //참조형
        data = new Data();
        // 위 두줄은 이 한줄과 같음
        // final Data data = new Data();

        //data = new Data(); -> 이미 할당을 했기때문에 참조대상 변경할 수 없음
        //final 변경 불가. 컴파일 오류

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}