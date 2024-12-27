package static1;

public class Data3 {
    public String name;
    public static int count; //static

    public Data3(String name) {
        this.name = name;
        count++; //Data3.count++; (Data3. 내 클래스 안이기 때문에 생략가능)
    }
}